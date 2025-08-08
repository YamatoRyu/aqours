package protection.member.aqours.fragment.person

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import protection.member.aqours.R
import protection.member.aqours.databinding.ActivityPersonPhotoBinding
import protection.member.aqours.fragment.person.list_person_photo.ListPersonPhoto
import protection.member.aqours.fragment.person.list_person_photo.ListPersonPhotoData

class PersonPhotoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonPhotoBinding
    private lateinit var recyclerView: RecyclerView

    private var listPerson: ArrayList<ListPersonPhotoData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        recyclerView = binding.recyclerViewPersonal

        listPerson.addAll(addPersonPhoto())
        showRecyclerView()
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

    @SuppressLint("Recycle")
    private fun addPersonPhoto(): ArrayList<ListPersonPhotoData> {
        val personList = ArrayList<ListPersonPhotoData>()

        val dataFace = resources.obtainTypedArray(R.array.riko)

        for (i in 0 until dataFace.length()) {
            val personData = ListPersonPhotoData(dataFace.getResourceId(i, -1))
            personList.add(personData)
        }

        return personList
    }

    private fun showRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listPhoto = ListPersonPhoto(listPerson)
        recyclerView.adapter = listPhoto
    }
}