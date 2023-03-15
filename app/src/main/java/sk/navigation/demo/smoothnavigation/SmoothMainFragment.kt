package sk.navigation.demo.smoothnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*
import sk.navigation.demo.R

/**
 * Created by kuosun on 2023/3/15 4:05 下午.
 */
class SmoothMainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedViewModel by activityViewModels<SharedViewModel>()
        startBaiduBtn.setOnClickListener {
            sharedViewModel.url.value = "https://m.baidu.com/"
            findNavController().navigate(R.id.action_global_smoothh5Fragment)
        }
    }
}