package com.example.tempconverter.data.reposytori

import android.content.Context
import com.example.tempconverter.domaine.reposytori.resultSave

private const val KEY_SHARED1 = "KEY1"
private const val KEY_TEMP1 = "KEYT1"

class saveReposytImpl(context: Context): resultSave {

    val sahredP = context.getSharedPreferences(KEY_SHARED1, Context.MODE_PRIVATE)

    override fun sv(values: String){
        val editor = sahredP.edit()
        editor.putString(KEY_TEMP1, values)
        editor.apply()

    }

    override fun gt(): String {
        val data = sahredP.getString(KEY_TEMP1, "")?: ""
        return data
    }

}