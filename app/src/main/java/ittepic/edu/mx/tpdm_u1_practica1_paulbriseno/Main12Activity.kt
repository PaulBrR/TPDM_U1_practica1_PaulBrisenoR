package ittepic.edu.mx.tpdm_u1_practica1_paulbriseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main12Activity : AppCompatActivity() {
    var btn11: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        btn11=findViewById(R.id.boton11)



        btn11?.setOnClickListener {
            finish()

        }
    }
}
