package com.example.singleselectionradiobutton

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MainActivity : AppCompatActivity() {
    var selectedIndex=0
    val langNames = arrayOf(
        "PYTHON","HTML","JAVA","C++","SQL","KOTLİN","C"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun selectedItem(view: View) {
        var selectItem=langNames[selectedIndex]
        val langDialog =MaterialAlertDialogBuilder(this)
        langDialog.setTitle("Programlama Dilleri")
        langDialog.setSingleChoiceItems(langNames,selectedIndex){
            dialog,which->
            selectedIndex = which
            selectItem=langNames[which]
        }
        langDialog.setPositiveButton("TAMAM") { dialog, which ->
            textMassage("$selectItem is selected")
        }
        langDialog.setNeutralButton("ÇIKIŞ") { dialog, which ->
            dialog.dismiss()
        }

        langDialog.show()

    }


    private fun textMassage(mag:String){
     Toast.makeText(this,mag,Toast.LENGTH_SHORT).show()
    }
}