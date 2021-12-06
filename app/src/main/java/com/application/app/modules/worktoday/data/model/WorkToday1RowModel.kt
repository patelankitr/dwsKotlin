package com.application.app.modules.worktoday.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class WorkToday1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResearchProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_research_produc)

)
