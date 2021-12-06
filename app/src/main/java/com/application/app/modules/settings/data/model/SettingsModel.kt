package com.application.app.modules.settings.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourSettingsS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndCondi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)

)
