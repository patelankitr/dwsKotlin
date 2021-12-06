package com.application.app.modules.loginorsignup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginOrSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeToOur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOurCommunityI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInThrough: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_through)

)
