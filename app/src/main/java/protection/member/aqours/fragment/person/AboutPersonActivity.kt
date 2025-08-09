package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityAboutPersonBinding
import protection.member.aqours.fragment.person.list_character.ListCharacterData

class AboutPersonActivity : AppCompatActivity() {
    private var name: String = ""

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAboutPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val listPerson = intent.getParcelableExtra<ListCharacterData>("ALL_MEMBER")

        listPerson?.let {
            binding.image.setImageResource(it.characterImage)
            binding.name.text = it.characterName
            name = it.characterName
            binding.name.setTextColor(it.characterColorName)

            binding.subGroup.text = it.characterSubGroup
            binding.schoolYears.text = it.characterSchoolYears
            binding.birthday.text = it.characterBirthday
            binding.astrologicalSign.text = it.characterZodiac
            binding.bloodType.text = it.characterBloodType
            binding.height.text = it.characterHeight
            binding.background.text = it.characterBackground
            binding.personality.text = it.characterPersonality
            binding.skill.text = it.characterSkill
            binding.hobbies.text = it.characterHobbies
            binding.likedFood.text = it.characterLikedFood
            binding.dislikeFood.text = it.characterDislikeFood
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onSupportNavigateUp()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}