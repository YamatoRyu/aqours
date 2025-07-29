package protection.member.aqours.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import protection.member.aqours.databinding.FragmentPersonCharacterAboutBinding

class PersonCharacterAboutFragment : Fragment() {
    private var _binding: FragmentPersonCharacterAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPersonCharacterAboutBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}