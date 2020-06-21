package com.example.sharedelementtest

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fButton.setOnClickListener {
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity(), Pair<View, String>(fImageView, "test"))
            val extra = ActivityNavigator.Extras.Builder()
                .setActivityOptions(options)
                .build()

            findNavController().navigate(R.id.action_testFragment_to_testActivity, null, null, extra)
        }
    }
}