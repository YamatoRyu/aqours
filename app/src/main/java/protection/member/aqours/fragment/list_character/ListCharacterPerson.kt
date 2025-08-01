package protection.member.aqours.fragment.list_character

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListCharacterPerson(
    val characterName: String,
    val characterPhoto: Int,
    val characterColorName: Int,
    val characterImage: Int,
    val characterSubGroup: String,
    val characterSchoolYears: String
) : Parcelable