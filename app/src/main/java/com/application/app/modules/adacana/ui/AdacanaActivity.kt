package com.application.app.modules.adacana.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAdacanaBinding
import com.application.app.modules.adacana.`data`.viewmodel.AdacanaVM
import com.application.app.modules.loginorsignup.ui.LoginOrSignupActivity
import kotlin.String
import kotlin.Unit

public class AdacanaActivity : BaseActivity<ActivityAdacanaBinding>(R.layout.activity_adacana) {
  private val viewModel: AdacanaVM by viewModels<AdacanaVM>()

  public override fun setUpClicks(): Unit {
    binding.imageLogo.setOnClickListener {
    val destIntent = LoginOrSignupActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.adacanaVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADACANA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdacanaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
