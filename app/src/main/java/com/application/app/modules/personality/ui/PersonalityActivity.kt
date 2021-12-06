package com.application.app.modules.personality.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPersonalityBinding
import com.application.app.modules.personality.`data`.viewmodel.PersonalityVM
import com.application.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

public class PersonalityActivity :
    BaseActivity<ActivityPersonalityBinding>(R.layout.activity_personality) {
  private val viewModel: PersonalityVM by viewModels<PersonalityVM>()

  public override fun setUpClicks(): Unit {
    binding.btnChangeSave.setOnClickListener {
            val destIntent = WorkTodayActivity.getIntent(this, null)
            startActivity(destIntent)
            }
  }

  public override fun onInitialized(): Unit {
    binding.personalityVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PERSONALITY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
