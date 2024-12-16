package com.example.pertemuan9data.repository

import com.example.pertemuan9data.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    //Fungsi memanggil data dari fungsi getMahasiswa dari Dao
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    suspend fun updateMhs(mahasiswa: Mahasiswa)
    fun getAllMhs(): Flow<List<Mahasiswa>>
    fun getMhs(nim: String): Flow<Mahasiswa>
}