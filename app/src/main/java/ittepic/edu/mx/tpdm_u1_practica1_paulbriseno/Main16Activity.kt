package ittepic.edu.mx.tpdm_u1_practica1_paulbriseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main16Activity : AppCompatActivity() {
    var btn15: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)
        btn15=findViewById(R.id.boton15)



        btn15?.setOnClickListener {
            finish()

        }

    }
}
