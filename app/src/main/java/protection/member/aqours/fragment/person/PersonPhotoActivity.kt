package protection.member.aqours.fragment.person

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.databinding.ActivityPersonPhotoBinding

class PersonPhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPersonPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)
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