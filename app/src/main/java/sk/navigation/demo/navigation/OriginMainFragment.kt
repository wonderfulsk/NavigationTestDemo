package sk.navigation.demo.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*
import sk.navigation.demo.R

/**
 * Created by kuosun on 2023/3/15 4:02 下午.
 */
class OriginMainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startBaiduBtn.setOnClickListener {
            findNavController().navigate(R.id.action_global_originh5Fragment, OriginH5FragmentArgs("https://m.baidu.com/").toBundle())
        }
    }

}