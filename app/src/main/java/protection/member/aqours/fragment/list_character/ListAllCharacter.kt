package protection.member.aqours.fragment.list_character

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import protection.member.aqours.R

class ListAllCharacter(private val listMember: List<ListPerson>) : RecyclerView.Adapter<ListAllCharacter.ListCharacterMember>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCharacterMember {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_character, parent, false)
        return ListCharacterMember(view)
    }

    override fun onBindViewHolder(holder: ListCharacterMember, position: Int) {
        val (facePhoto, name) = listMember[position]
        holder.imageFace.setImageResource(facePhoto)
        holder.imageName.text = name
    }

    override fun getItemCount(): Int = listMember.size

    class ListCharacterMember(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFace: ImageView = itemView.findViewById(R.id.personal_face)
        val imageName: TextView = itemView.findViewById(R.id.personal_name)
    }
}