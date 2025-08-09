package protection.member.aqours.fragment.music_solo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import protection.member.aqours.databinding.FragmentMusicSoloBinding

class MusicSoloFragment : Fragment() {
    private var _binding: FragmentMusicSoloBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMusicSoloBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}