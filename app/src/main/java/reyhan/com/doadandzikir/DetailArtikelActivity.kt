package reyhan.com.doadandzikir

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailArtikelActivity : AppCompatActivity() {

    companion object {
        const val DATA_TITTLE = "data_tittle"
        const val DATA_DESC = "data_desc"
        const val DATA_IMAGE = "data_image"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artike Islami"
        setContentView(R.layout.activity_detail_artikel)

        val dataTitle = intent.getStringExtra(DATA_TITTLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle: TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle

        val tvDesc: TextView = findViewById(R.id.tv_desc)
        tvDesc.text = dataTitle

        val imgArtikel: ImageView = findViewById(R.id.iv_img_artikel)
        imgArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
