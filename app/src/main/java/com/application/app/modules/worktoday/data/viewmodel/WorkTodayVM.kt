package com.application.app.modules.worktoday.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.worktoday.`data`.model.WorkToday1RowModel
import com.application.app.modules.worktoday.`data`.model.WorkTodayModel
import kotlin.collections.MutableList

public class WorkTodayVM : ViewModel() {
  public val workTodayModel: MutableLiveData<WorkTodayModel> = MutableLiveData(WorkTodayModel())

  public val recyclerTodoworklistList: MutableLiveData<MutableList<WorkToday1RowModel>> =
      MutableLiveData(mutableListOf())
}
