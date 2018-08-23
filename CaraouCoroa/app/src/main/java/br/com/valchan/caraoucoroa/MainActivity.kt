package br.com.valchan.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BT_jogar.setOnClickListener {
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            //gerar num random
            val numero = Random().nextInt(2)
            intent.putExtra("numero",numero)
            startActivity(intent)
        }
    }
}
