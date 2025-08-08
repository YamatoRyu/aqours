package protection.member.aqours.fragment.person.list_person_photo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import protection.member.aqours.R

class ListPersonPhoto(private val listPhoto: List<ListPersonPhotoData>) : RecyclerView.Adapter<ListPersonPhoto.PersonPhotoRecycler>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonPhotoRecycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.personality_photo, parent, false)
        return PersonPhotoRecycler(view)
    }

    override fun onBindViewHolder(holder: PersonPhotoRecycler, position: Int) {
        val (photo) = listPhoto[position]
        holder.characterPhoto.setImageResource(photo)
    }

    override fun getItemCount(): Int = listPhoto.size

    class PersonPhotoRecycler(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val characterPhoto: ImageView = itemView.findViewById(R.id.character_photo)
    }
}