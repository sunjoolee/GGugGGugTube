package com.example.myapplication

import android.content.Intent
import android.content.Intent.ACTION_SEND
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentVideoDetailBinding

class VideoDetailFragment : Fragment() {

    private var binding: FragmentVideoDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnLike?.setOnClickListener {  }

        binding?.btnShare?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply{
                type = "text/plane"
                putExtra(Intent.EXTRA_TEXT, url)
            }
            startActivity(Intent.createChooser(intent, url))
        }
    }

    //추후에 Parcelize 되면 추가
    companion object{
//        fun newInstance() {
//            VideoDetailFragment().apply {
//                arguments = Bundle().apply {
//                    putParcelable(Key.EXTRA_USER, )
//                }
//            }
//        }
    }
}