package br.com.valchan.alcoolougasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btCalcular(view:View){
        val precoAlcool = alcoolID.text.toString()
        val precoGasolina = gasolinaID.text.toString()
        val validaCampos = validarCampos(precoAlcool,precoGasolina)
        if(validaCampos==true){
            calcMelhorPreco(precoAlcool,precoGasolina)
        }else{
            txtID.setText("Preencha os preços primeiro!")
        }
    }
    fun validarCampos(precoAlcool: String, precoGasolina: String):Boolean{
        var cValidos:Boolean=true
        if(precoAlcool==null || precoAlcool.equals("")){
            cValidos=false
        }else if(precoGasolina==null || precoGasolina.equals("")){
            cValidos=false
        }
        return cValidos
    }
    fun calcMelhorPreco(precoAlcool: String, precoGasolina: String){
        val valorA = precoAlcool.toDouble()
        val valorG = precoGasolina.toDouble()
        val resultado = valorA / valorG
        if (resultado >= 0.7 ){
            txtID.setText("Melhor utilizar Gasolina!")
        }else{
            txtID.setText("Melhor utilizar Álcool!")
        }
    }
}
