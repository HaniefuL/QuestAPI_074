package com.example.questapi_074.repositori

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

interface ContainerApp {
    // Sediakan dua nama agar tidak error jika ViewModel memanggil salah satunya
    val repositoryDataSiswa: RepositoryDataSiswa
    val repositorySiswa: RepositoryDataSiswa
}

class DefaultContainerApp: ContainerApp {
    private val baseurl = "http://10.0.2.2/tiumy/"

    val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val klien = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()


}