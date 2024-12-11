package com.example.pertemuan9data.repository

import com.example.pertemuan9data.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}