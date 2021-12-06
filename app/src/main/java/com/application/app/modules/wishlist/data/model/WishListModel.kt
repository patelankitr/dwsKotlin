package com.application.app.modules.wishlist.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class WishListModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeAWishLis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_wish_lis)
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
  public var txtTaskTodo: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_todo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAttachments: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_attachments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etCreateActionMValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTtmmyyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMaximum10MbValue: String? = null
)
