package reyhan.com.doadandzikir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import reyhan.com.doadandzikir.adapter.DzikirDoaAdapter

class QauliyahShalatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyyah: RecyclerView = findViewById(R.id.rv_qauliyah_solat)
        rvQauliyyah.layoutManager = LinearLayoutManager(this)
        rvQauliyyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
