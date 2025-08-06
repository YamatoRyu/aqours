package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityPersonPhotoBinding

class PersonPhotoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonPhotoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
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