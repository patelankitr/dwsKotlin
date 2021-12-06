package com.application.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityHomeBinding
import com.application.app.modules.home.`data`.model.Home1RowModel
import com.application.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerOptions(
    view: View,
    position: Int,
    item: Home1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerOptionsAdapter =
                                   
                RecyclerOptionsAdapter(viewModel.recyclerOptionsList.value?:mutableListOf())
    binding.recyclerOptions.adapter = recyclerOptionsAdapter
    recyclerOptionsAdapter.setOnItemClickListener(
                            object : RecyclerOptionsAdapter.OnItemClickListener {
                                override fun onItemClick(view:View, position:Int, item :
        Home1RowModel)
            {
                                    onClickRecyclerOptions(view, position, item)
                                }
                            }
                            )
    viewModel.recyclerOptionsList.observe(this) {
                                recyclerOptionsAdapter.updateData(it)
                            }
    binding.homeVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
