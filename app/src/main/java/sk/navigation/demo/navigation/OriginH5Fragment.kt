package sk.navigation.demo.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_h5.*
import sk.navigation.demo.R

/**
 * Created by kuosun on 2023/3/15 4:02 下午.
 */
class OriginH5Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_h5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args by navArgs<OriginH5FragmentArgs>()
        Toast.makeText(requireContext(), args.url, Toast.LENGTH_LONG).show()
        webView.loadUrl(args.url)
    }

}