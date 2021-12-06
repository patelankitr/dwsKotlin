package com.application.app.modules.worktoday.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class WorkTodayModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorkTodays: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_today_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeYourJobE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_your_job_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt02April2021: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_02_april_2021)

)
