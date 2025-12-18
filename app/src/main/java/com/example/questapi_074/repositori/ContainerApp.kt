package com.example.questapi_074.repositori

interface ContainerApp {
    // Sediakan dua nama agar tidak error jika ViewModel memanggil salah satunya
    val repositoryDataSiswa: RepositoryDataSiswa
    val repositorySiswa: RepositoryDataSiswa
}

class DefaultContainerApp: ContainerApp {}