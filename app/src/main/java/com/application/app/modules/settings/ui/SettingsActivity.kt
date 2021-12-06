package com.application.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySettingsBinding
import com.application.app.modules.language.ui.LanguageActivity
import com.application.app.modules.personality.ui.PersonalityActivity
import com.application.app.modules.settings.`data`.viewmodel.SettingsVM
import com.application.app.modules.termsandconditions.ui.TermsandconditionsActivity
import kotlin.String
import kotlin.Unit

public class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  public override fun setUpClicks(): Unit {
    binding.cardViewBackground.setOnClickListener {
    val destIntent = PersonalityActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.cardViewBackground1.setOnClickListener {
    val destIntent = LanguageActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.cardViewBackground2.setOnClickListener {
    val destIntent = TermsandconditionsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.settingsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SETTINGS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
