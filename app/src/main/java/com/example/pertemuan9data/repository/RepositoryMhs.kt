package com.example.pertemuan9data.repository

import com.example.pertemuan9data.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    //Fungsi memanggil data dari fungsi getMahasiswa dari Dao
    fun getAllMhs(): Flow<List<Mahasiswa>>
    fun getMhs(nim: String): Flow<Mahasiswa>
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    suspend fun updateMhs(mahasiswa: Mahasiswa)
}