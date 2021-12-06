package com.application.app.modules.termsandconditions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTermsandconditionsBinding
import com.application.app.modules.termsandconditions.`data`.viewmodel.TermsandconditionsVM
import kotlin.String
import kotlin.Unit

public class TermsandconditionsActivity :
    BaseActivity<ActivityTermsandconditionsBinding>(R.layout.activity_termsandconditions) {
  private val viewModel: TermsandconditionsVM by viewModels<TermsandconditionsVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.termsandconditionsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "TERMSANDCONDITIONS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TermsandconditionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
