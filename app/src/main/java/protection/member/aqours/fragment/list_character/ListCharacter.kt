package protection.member.aqours.fragment.list_character

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListCharacter(
    val characterPhoto: Int,
    val characterName: String
) : Parcelable