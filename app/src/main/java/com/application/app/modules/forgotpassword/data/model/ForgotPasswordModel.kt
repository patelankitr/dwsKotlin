package com.application.app.modules.forgotpassword.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelpingOthers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_helping_others)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIfYouAreAlwa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_are_alwa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null
)
