package sk.navigation.demo.smoothnavigation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by kuosun on 2023/3/15 4:05 下午.
 */
class SharedViewModel: ViewModel() {

    // H5活动页展示的url
    val url = MutableLiveData("")

}