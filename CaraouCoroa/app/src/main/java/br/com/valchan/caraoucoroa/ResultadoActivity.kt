package br.com.valchan.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        //recuperando dados
        val dados: Bundle = intent.extras
        val numero = dados.getInt("numero")
        if(numero==0){
            IMG_resultado.setImageResource(R.drawable.moeda_cara)
        }else{
            IMG_resultado.setImageResource(R.drawable.moeda_coroa)
        }
        //voltando ao main
        BT_voltar.setOnClickListener {
            finish()
        }
    }
}
