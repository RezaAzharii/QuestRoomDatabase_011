package com.example.pertemuan9data

import android.app.Application
import com.example.pertemuan9data.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Berfungsi untuk menyimpan Instance
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // Membuat instace ContainerApp
        //instance adalah object yang dibuat dari class
    }
}