package cobakotlin.dhika.com.simpleintentbydhika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nimnya: EditText = findViewById(R.id.et_nim)
        var namanya: EditText = findViewById(R.id.et_nama)
        var nilainya: EditText = findViewById(R.id.et_nilai)

        bt_click.setOnClickListener(){
            intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("nim",nimnya.getText())
            intent.putExtra("nama",namanya.getText())
            intent.putExtra("nil",nilainya.getText())
            startActivity(intent)
        }
    }
}
