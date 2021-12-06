package com.application.app.modules.adacana.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.adacana.`data`.model.AdacanaModel

public class AdacanaVM : ViewModel() {
  public val adacanaModel: MutableLiveData<AdacanaModel> = MutableLiveData(AdacanaModel())
}
