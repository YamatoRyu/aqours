package protection.member.aqours.fragment.list_character

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import protection.member.aqours.R
import protection.member.aqours.fragment.person.PersonActivity

class ListAllCharacterPerson(private val listCharacter: List<ListCharacter>) : RecyclerView.Adapter<ListAllCharacterPerson.ListCharacterMember>() {
    private lateinit var onClickCallBack: OnClickCallBack

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCharacterMember {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_character, parent, false)
        return ListCharacterMember(view)
    }

    override fun onBindViewHolder(holder: ListCharacterMember, position: Int) {
        val (facePhoto, name) = listCharacter[position]
        holder.imageFace.setImageResource(facePhoto)
        holder.imageName.text = name

        holder.itemView.setOnClickListener {
            onClickCallBack.onItemClickCall(listCharacter[position])

            val intent = Intent(holder.itemView.context, PersonActivity::class.java).apply {
                putExtra("MEMBER_NAME", listCharacter[position])
            }

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listCharacter.size

    class ListCharacterMember(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFace: ImageView = itemView.findViewById(R.id.personal_face)
        val imageName: TextView = itemView.findViewById(R.id.personal_name)
    }

    interface OnClickCallBack {
        fun onItemClickCall(listCharacter: ListCharacter)
    }
}