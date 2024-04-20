package com.example.tempconverter.domaine.usecase

import com.example.tempconverter.data.reposytori.saveReposytImpl

class getResulUseCase(val repos: saveReposytImpl) {

    fun get(): String{
        return repos.gt()
    }
}