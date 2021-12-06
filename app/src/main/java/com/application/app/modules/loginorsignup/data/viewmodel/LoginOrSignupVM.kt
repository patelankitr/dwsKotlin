package com.application.app.modules.loginorsignup.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.loginorsignup.`data`.model.LoginOrSignupModel

public class LoginOrSignupVM : ViewModel() {
  public val loginOrSignupModel: MutableLiveData<LoginOrSignupModel> =
      MutableLiveData(LoginOrSignupModel())
}
