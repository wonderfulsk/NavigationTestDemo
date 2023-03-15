package sk.navigation.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import sk.navigation.demo.navigation.OriginNavigationDemoActivity
import sk.navigation.demo.smoothnavigation.SmoothNavigationDemoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationBtn.setOnClickListener {
            startActivity(Intent(this, OriginNavigationDemoActivity::class.java))
        }

        smoothNavigationBtn.setOnClickListener {
            startActivity(Intent(this, SmoothNavigationDemoActivity::class.java))
        }
    }
}