package com.application.app.modules.home.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.home.`data`.model.Home1RowModel
import com.application.app.modules.home.`data`.model.HomeModel
import kotlin.collections.MutableList

public class HomeVM : ViewModel() {
  public val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  public val recyclerOptionsList: MutableLiveData<MutableList<Home1RowModel>> =
      MutableLiveData(mutableListOf())
}
