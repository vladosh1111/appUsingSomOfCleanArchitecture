package com.example.tempconverter.domaine.usecase

import com.example.tempconverter.data.reposytori.saveReposytImpl

class saveResultUseCase(val repos: saveReposytImpl) {

    fun saveGet(value: String){
        val save = repos.sv(value)
    }
}