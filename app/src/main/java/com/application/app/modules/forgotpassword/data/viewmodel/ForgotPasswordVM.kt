package com.application.app.modules.forgotpassword.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.forgotpassword.`data`.model.ForgotPasswordModel

public class ForgotPasswordVM : ViewModel() {
  public val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())
}
