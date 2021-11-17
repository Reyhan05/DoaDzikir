package reyhan.com.doadandzikir

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PagiPetangActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang)

        val cvDzikirPagi: CardView = findViewById(R.id.rv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener(this)
        val btnDzikirPagi: ImageButton = findViewById(R.id.ib_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)

        val cvDzikirPetang: CardView = findViewById(R.id.rv_dzikir_petang)
        cvDzikirPagi.setOnClickListener(this)
        val btnDzikirPetang: ImageButton = findViewById(R.id.ib_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cv_dzikir_pagi -> startActivity(Intent(this, DzikirPagi::class.java))
            R.id.ib_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagi::class.java))

            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPetang::class.java))
            R.id.ib_btn_dzikir_petang -> startActivity(Intent(this, DzikirPetang::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
