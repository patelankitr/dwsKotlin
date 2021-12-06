package com.application.app.modules.home.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdalah: String? = MyApp.getInstance().resources.getString(R.string.lbl_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlcanasatre: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_alcanasatre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJoined6Month: String? =
      MyApp.getInstance().resources.getString(R.string.msg_joined_6_month)

)
