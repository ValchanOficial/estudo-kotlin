package br.com.valchan.sorteiroapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sortear(view: View){
        var texto = findViewById<View>(R.id.txtID2) as TextView
        var numeroSorteado = Random().nextInt(11)
        texto.setText("O numero sorteado e $numeroSorteado")
    }
}
