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
import protection.member.aqours.fragment.person.list_character.ListCharacter
import protection.member.aqours.fragment.person.list_character.ListCharacterData

class PersonFragment : Fragment() {
    private var _binding: FragmentPersonBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private var arrayList: ArrayList<ListCharacterData> = ArrayList()

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
    private fun getListAddCharacter(): ArrayList<ListCharacterData> {
        val memberList = ArrayList<ListCharacterData>()

        val dataFace = resources.obtainTypedArray(R.array.image_face)
        val dataImage = resources.obtainTypedArray(R.array.image_clothes)
        val dataName = resources.getStringArray(R.array.image_name)
        val dataColorName = resources.getIntArray(R.array.image_color)
        val dataSubGroup = resources.getStringArray(R.array.image_sub_group)
        val dataSchoolYear = resources.getStringArray(R.array.image_school_years)
        val dataBirthday = resources.getStringArray(R.array.image_birthday)
        val dataZodiac = resources.getStringArray(R.array.astrological_sign)
        val dataBloodType = resources.getStringArray(R.array.image_blood_type)
        val dataHeight = resources.getStringArray(R.array.image_height)
        val dataBackground = resources.getStringArray(R.array.image_background)
        val dataPersonality = resources.getStringArray(R.array.image_personality)
        val dataSkill = resources.getStringArray(R.array.image_skill)
        val dataHobbies = resources.getStringArray(R.array.image_hobbies)
        val dataLikeFood = resources.getStringArray(R.array.image_liked_food)
        val dataDislikeFood = resources.getStringArray(R.array.image_dislike_food)

        for (i in dataName.indices) {
            val member = ListCharacterData(
                dataName[i],
                dataFace.getResourceId(i, -1),
                dataColorName[i],
                dataImage.getResourceId(i, -1),
                dataSubGroup[i],
                dataSchoolYear[i],
                dataBirthday[i],
                dataZodiac[i],
                dataBloodType[i],
                dataHeight[i],
                dataBackground[i],
                dataPersonality[i],
                dataSkill[i],
                dataHobbies[i],
                dataLikeFood[i],
                dataDislikeFood[i]
            )

            memberList.add(member)
        }

        return memberList
    }

    private fun showAllCharacterList() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val listCharacter = ListCharacter(arrayList)
        recyclerView.adapter = listCharacter

        listCharacter.setOnCharacterClick(object : ListCharacter.OnClickCallBack {
            override fun onItemClickCall(listCharacter: ListCharacterData) {
                showCharacterPerson(listCharacter)
            }
        })
    }

    private fun showCharacterPerson(listCharacter: ListCharacterData) {
        val characterName = listCharacter.toString().split("\\s|, ".toRegex())
        Toast.makeText(requireContext(), "All about ${characterName[1]}-chan", Toast.LENGTH_SHORT).show()
    }
}