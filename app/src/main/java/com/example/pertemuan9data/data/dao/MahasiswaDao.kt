package com.example.pertemuan9data.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pertemuan9data.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    //Fungsi mengambil semua data pada tabel Mahasiswa
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
    //Fungsi mengambil data pada tabel Mahasiswa berdasarkan Nim
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>
    //Fungsi menghapus data tertentu pada tabel Mahasiswa
    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)
    //Fungsi untuk mnegupdate/mengubah data yang sudah ada pada tabel mahasiswa
    @Update
    suspend fun updateMahasiwa(mahasiswa: Mahasiswa)
}