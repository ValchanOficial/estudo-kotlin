package br.com.valchan.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CLIENTE
        BT_Cliente.setOnClickListener {
            val intent = Intent(this,DetalhesClientesActivity::class.java)
            startActivity(intent)
        }
        //CONTATO
        BT_Contato.setOnClickListener {
            val intent = Intent(this,DetalhesContatoActivity::class.java)
            startActivity(intent)
        }
        //EMPRESA
        BT_Empresa.setOnClickListener {
            val intent = Intent(this,DetalhesEmpresaActivity::class.java)
            startActivity(intent)
        }
        //SERVIÇOS
        BT_Servicos.setOnClickListener {
            val intent = Intent(this,DetalhesServicosActivity::class.java)
            startActivity(intent)
        }
    }
}
