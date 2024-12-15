package com.example.pertemuan9data.ui.viewmodel

import com.example.pertemuan9data.data.entity.Mahasiswa


data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)