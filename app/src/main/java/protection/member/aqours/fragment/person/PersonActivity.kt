package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityPersonBinding
import protection.member.aqours.fragment.list_character.ListCharacterData

class PersonActivity : AppCompatActivity() {
    private var name: String = ""

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPersonBinding.inflate(layoutInflater)
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
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }

            R.id.character_photo_library -> return clickCharacterPersonPhoto()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menubar_person, menu)
        return true
    }

    private fun clickCharacterPersonPhoto(): Boolean {
        val characterName = name.toString().split(" ")
        Toast.makeText(this, "All ${characterName[1]}-chan image photo", Toast.LENGTH_LONG).show()

        return true
    }
}