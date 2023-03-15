package sk.navigation.demo.smoothnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_smooth_navigation_demo.*
import sk.navigation.demo.R

class SmoothNavigationDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_navigation_demo)


        startBingBtn.setOnClickListener {
            val sharedViewModel by viewModels<SharedViewModel>()
            sharedViewModel.url.value = "https://cn.bing.com/"
            findNavController(R.id.navHost).navigate(R.id.action_global_smoothh5Fragment)
        }

    }
}