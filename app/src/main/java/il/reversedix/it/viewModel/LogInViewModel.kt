package il.reversedix.it.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import il.reversedix.it.model.LogInModel

class LogInViewModel : ViewModel() {
    private val _logInModel = MutableLiveData<LogInModel>()
    val logInModel : LiveData<LogInModel> = _logInModel

    fun logIn(name: String) {
        val logInModel = LogInModel()
        logInModel.name = name
        logInModel.success = true
        _logInModel.value = logInModel
    }
}