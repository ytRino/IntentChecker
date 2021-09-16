package net.nessness.intentchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import net.nessness.intentchecker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by lazy {
        ActivityMainBinding.bind(findViewById(android.R.id.content))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState != null) {
            supportFragmentManager.commit {
            }
        }
    }
}