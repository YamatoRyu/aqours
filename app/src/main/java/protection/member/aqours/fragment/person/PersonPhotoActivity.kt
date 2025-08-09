package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import protection.member.aqours.databinding.ActivityPersonPhotoBinding
import protection.member.aqours.list_character.ListCharacterData

class PersonPhotoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonPhotoBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        recyclerView = binding.recyclerViewPersonal
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
        }

        return onOptionsItemSelected(item)
    }
}