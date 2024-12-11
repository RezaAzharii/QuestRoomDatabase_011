package com.example.pertemuan9data.dependeciesinjection

import android.content.Context
import com.example.pertemuan9data.data.database.KrsDatabase
import com.example.pertemuan9data.repository.LocalRepositoryMhs
import com.example.pertemuan9data.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabse(context).mahasiswaDao())
    }
}