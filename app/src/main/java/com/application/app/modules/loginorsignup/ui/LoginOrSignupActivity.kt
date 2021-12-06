package com.application.app.modules.loginorsignup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLoginOrSignupBinding
import com.application.app.modules.login.ui.LoginActivity
import com.application.app.modules.loginorsignup.`data`.viewmodel.LoginOrSignupVM
import com.application.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

public class LoginOrSignupActivity :
    BaseActivity<ActivityLoginOrSignupBinding>(R.layout.activity_login_or_signup) {
  private val viewModel: LoginOrSignupVM by viewModels<LoginOrSignupVM>()

  public override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.btnSignUp.setOnClickListener {
        val destIntent = SignupActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.loginOrSignupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOGIN_OR_SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginOrSignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
