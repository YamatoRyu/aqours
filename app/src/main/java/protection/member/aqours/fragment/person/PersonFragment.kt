package protection.member.aqours.fragment.person

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import protection.member.aqours.R
import protection.member.aqours.databinding.FragmentPersonBinding
import protection.member.aqours.fragment.list_character.ListAllCharacterPerson
import protection.member.aqours.fragment.list_character.ListCharacterPerson

class PersonFragment : Fragment() {
    private var _binding: FragmentPersonBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private var arrayList: ArrayList<ListCharacterPerson> = ArrayList()

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
    private fun getListAddCharacter(): ArrayList<ListCharacterPerson> {
        val memberList = ArrayList<ListCharacterPerson>()

        val dataFace = resources.obtainTypedArray(R.array.image_face)
        val dataImage = resources.obtainTypedArray(R.array.image_clothes)
        val dataName = resources.getStringArray(R.array.image_name)
        val dataColorName = resources.getIntArray(R.array.image_color)
        val dataSubGroup = resources.getStringArray(R.array.image_sub_group)
        val dataSchoolYear = resources.getStringArray(R.array.image_school_years)

        for (i in dataName.indices) {
            val member = ListCharacterPerson(
                dataName[i],
                dataFace.getResourceId(i, -1),
                dataColorName[i],
                dataImage.getResourceId(i, -1),
                dataSubGroup[i],
                dataSchoolYear[i]
            )

            memberList.add(member)
        }

        return memberList
    }

    private fun showAllCharacterList() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val listAllCharacterPerson = ListAllCharacterPerson(arrayList)
        recyclerView.adapter = listAllCharacterPerson

        listAllCharacterPerson.setOnCharacterClick(object : ListAllCharacterPerson.OnClickCallBack {
            override fun onItemClickCall(listCharacter: ListCharacterPerson) {
                showCharacterPerson(listCharacter)
            }
        })
    }

    private fun showCharacterPerson(listCharacter: ListCharacterPerson) {
        val characterName = listCharacter.toString().split("\\s|, ".toRegex())
        Toast.makeText(requireContext(), "All about ${characterName[1]}-chan", Toast.LENGTH_SHORT).show()
    }
}