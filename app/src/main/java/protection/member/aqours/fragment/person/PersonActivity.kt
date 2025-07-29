package protection.member.aqours.fragment.person

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityPersonBinding

class PersonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}