package com.application.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignupBinding
import com.application.app.modules.home.ui.HomeActivity
import com.application.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit

public class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  public override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.signupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
