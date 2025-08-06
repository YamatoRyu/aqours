package protection.member.aqours.fragment.person

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityPersonPhotoBinding

class PersonPhotoActivity : AppCompatActivity() {
    val binding = ActivityPersonPhotoBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}