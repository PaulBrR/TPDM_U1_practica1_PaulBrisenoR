package ittepic.edu.mx.tpdm_u1_practica1_paulbriseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main13Activity : AppCompatActivity() {
    var btn12: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        btn12=findViewById(R.id.boton12)



        btn12?.setOnClickListener {
            finish()

        }
    }
}
