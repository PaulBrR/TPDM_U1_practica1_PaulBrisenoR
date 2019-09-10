package ittepic.edu.mx.tpdm_u1_practica1_paulbriseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main14Activity : AppCompatActivity() {
    var btn13: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)
        btn13=findViewById(R.id.boton13)



        btn13?.setOnClickListener {
            finish()

        }
    }
}
