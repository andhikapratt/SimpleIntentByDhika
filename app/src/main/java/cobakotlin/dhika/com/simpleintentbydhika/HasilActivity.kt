package cobakotlin.dhika.com.simpleintentbydhika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hasil.*


class HasilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val bundle:Bundle? = intent.extras
        val nim_bro = bundle?.get("nim")
        val nama_bro = bundle?.get("nama")
        val nil_bro = bundle?.get("nil")

        var nil = nil_bro.toString()
        var nill = nil.toInt()

        if (nill >= 80){
            tv_has_ket.setText("A")
        }
        else if(nill >= 60){
            tv_has_ket.setText("B")
        }
        else if(nill >= 40){
            tv_has_ket.setText("C")
        }
        else if(nill >= 20){
            tv_has_ket.setText("D")
        }
        else{
            tv_has_ket.setText("E")
        }
        tv_has_nim.setText(""+nim_bro)
        tv_has_nama.setText(""+nama_bro)
        tv_has_nil.setText(""+nil_bro)
    }
}
