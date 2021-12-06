package com.application.app.modules.wishlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityWishListBinding
import com.application.app.modules.wishlist.`data`.viewmodel.WishListVM
import kotlin.String
import kotlin.Unit

public class WishListActivity : BaseActivity<ActivityWishListBinding>(R.layout.activity_wish_list) {
  private val viewModel: WishListVM by viewModels<WishListVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.wishListVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WISH_LIST_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WishListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
