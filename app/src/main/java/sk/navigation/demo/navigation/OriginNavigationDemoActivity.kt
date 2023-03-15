package sk.navigation.demo.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_origin_navigation_demo.*
import sk.navigation.demo.R

class OriginNavigationDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_origin_navigation_demo)

        startBingBtn.setOnClickListener {
            findNavController(R.id.navHost).navigate(R.id.action_global_originh5Fragment, OriginH5FragmentArgs("https://cn.bing.com/").toBundle())
        }

    }
}