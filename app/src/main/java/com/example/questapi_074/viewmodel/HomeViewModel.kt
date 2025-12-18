package com.example.questapi_074.viewmodel

import com.example.questapi_074.modedata.DataSiswa

sealed interface StatusUiSiswa {
    data class Success(val listSiswa: List<DataSiswa>) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
