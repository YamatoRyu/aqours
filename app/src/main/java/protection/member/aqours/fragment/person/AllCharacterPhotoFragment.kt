package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import protection.member.aqours.databinding.FragmentAllCharacterPhotoBinding

class AllCharacterPhotoFragment : Fragment() {
    private var _binding: FragmentAllCharacterPhotoBinding? = null
    private val binding = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAllCharacterPhotoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}