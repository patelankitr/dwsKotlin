package com.application.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityForgotPasswordBinding
import com.application.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.application.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

public class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  public override fun setUpClicks(): Unit {
    binding.btnStart.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.forgotPasswordVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
