package id.ac.polbeng.nadiya.eventhandlingnadiya

import android.os.Bundle
import android.widget.Toast
import  com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.nadiya.eventhandlingnadiya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan ViewBinding untuk menghubungkan layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menambahkan event listener pada tombol dengan id btnDisplayMessage
        binding.btnDisplayMessage.setOnClickListener {
            // Menampilkan pesan Toast ketika tombol diklik
            Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_LONG).show()
        }

        binding.btnDisplayMessage.setOnLongClickListener {
            Toast.makeText(
                applicationContext,
                "Long Click",
                Toast.LENGTH_SHORT
            ).show()
            true // Return true to indicate that the long click has been handled
        }
    }
}

