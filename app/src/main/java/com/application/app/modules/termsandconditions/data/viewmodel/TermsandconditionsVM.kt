package com.application.app.modules.termsandconditions.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.termsandconditions.`data`.model.TermsandconditionsModel

public class TermsandconditionsVM : ViewModel() {
  public val termsandconditionsModel: MutableLiveData<TermsandconditionsModel> =
      MutableLiveData(TermsandconditionsModel())
}
