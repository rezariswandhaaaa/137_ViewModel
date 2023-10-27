package com.example.activity4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.activity4.Data.DataForm
import com.example.activity4.Data.StatusForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var Email: String by mutableStateOf("")
        private set
    var Alamat: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var Stats: String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()



    fun insertData(nm: String, tlp: String, eml: String,almt: String, jk: String, Sts: String){
        namaUsr = nm;
        noTlp = tlp;
        Email = eml;
        Alamat = almt;
        jenisKl = jk;
        Stats = Sts;
    }

    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

    fun setStatS(pilihSTS: String){
        _uiState.update { currentState -> currentState.copy(status = pilihSTS)}
    }

}