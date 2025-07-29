package protection.member.aqours.fragment.person

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import protection.member.aqours.R
import protection.member.aqours.databinding.FragmentPersonBinding
import protection.member.aqours.fragment.list_character.ListAllCharacterPerson
import protection.member.aqours.fragment.list_character.ListCharacter

class PersonFragment : Fragment() {
    private var _binding: FragmentPersonBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private var arrayList: ArrayList<ListCharacter> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPersonBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.recyclerView

        arrayList.addAll(getListAddCharacter())
        showAllCharacterList()
    }

    @SuppressLint("Recycle")
    private fun getListAddCharacter(): ArrayList<ListCharacter> {
        val memberList = ArrayList<ListCharacter>()

        val dataImage = resources.obtainTypedArray(R.array.image_face)
        val dataName = resources.getStringArray(R.array.image_name)

        for (i in dataName.indices) {
            val member = ListCharacter(
                dataImage.getResourceId(i, -1),
                dataName[i]
            )

            memberList.add(member)
        }

        return memberList
    }

    private fun showAllCharacterList() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val listAllCharacterPerson = ListAllCharacterPerson(arrayList)
        recyclerView.adapter = listAllCharacterPerson
    }
}