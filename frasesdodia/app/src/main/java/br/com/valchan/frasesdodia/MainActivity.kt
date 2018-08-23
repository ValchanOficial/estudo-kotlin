package br.com.valchan.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView //lateinit significa que sera inicializado depois o valor da var
    val frases = arrayOf(
            "Tenho em mim todos os sonhos do mundo. - Fernando Pessoa",
            "Uma vida sem desafios não vale a pena ser vivida. - Sócrates",
            "A sabedoria começa na reflexão. - Sócrates",
            "Uma vida não basta ser vivida. Ela precisa ser sonhada. - Mario Quintana",
            "Só sei que nada sei - Sócrates",
            "Eu não procuro saber as respostas, procuro compreender as perguntas. - Confúcio",
            "Aquilo que se faz por amor está sempre além do bem e do mal. - Friedrich Nietzsche",
            "Viver é a coisa mais rara do mundo. A maioria das pessoas apenas existe. - Oscar Wilde",
            "A dúvida é o princípio da sabedoria. - Aristóteles"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.txtID) as TextView //localizando texto na activity
    }

    fun gerarFrase(view: View){
        val totalArray = frases.size
        val numAleatorio = Random().nextInt(totalArray)
        texto.setText(frases[numAleatorio])
    }
}
