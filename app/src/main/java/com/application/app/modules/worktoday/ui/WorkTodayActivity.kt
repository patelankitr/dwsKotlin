package com.application.app.modules.worktoday.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityWorkTodayBinding
import com.application.app.modules.wishlist.ui.WishListActivity
import com.application.app.modules.worktoday.`data`.model.WorkToday1RowModel
import com.application.app.modules.worktoday.`data`.viewmodel.WorkTodayVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class WorkTodayActivity :
    BaseActivity<ActivityWorkTodayBinding>(R.layout.activity_work_today) {
  private val viewModel: WorkTodayVM by viewModels<WorkTodayVM>()

  public override fun setUpClicks(): Unit {
    binding.btnMakeAWishLis.setOnClickListener {
            val destIntent = WishListActivity.getIntent(this, null)
            startActivity(destIntent)
            }
  }

  public fun onClickRecyclerTodoworklist(
    view: View,
    position: Int,
    item: WorkToday1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerTodoworklistAdapter =
                           
               
        RecyclerTodoworklistAdapter(viewModel.recyclerTodoworklistList.value?:mutableListOf())
    binding.recyclerTodoworklist.adapter = recyclerTodoworklistAdapter
    recyclerTodoworklistAdapter.setOnItemClickListener(
                    object : RecyclerTodoworklistAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : WorkToday1RowModel)
        {
                            onClickRecyclerTodoworklist(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerTodoworklistList.observe(this) {
                        recyclerTodoworklistAdapter.updateData(it)
                    }
    binding.workTodayVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WORK_TODAY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkTodayActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
