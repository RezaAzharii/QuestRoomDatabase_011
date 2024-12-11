package com.example.pertemuan9data.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan9data.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}