package protection.member.aqours.fragment.list_character

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListCharacterData(
    val characterName: String,
    val characterPhoto: Int,
    val characterColorName: Int,
    val characterImage: Int,
    val characterSubGroup: String,
    val characterSchoolYears: String,
    val characterBirthday: String,
    val characterZodiac: String,
    val characterBloodType: String,
    val characterHeight: String,
    val characterBackground: String,
    val characterPersonality: String,
    val characterSkill: String,
    val characterHobbies: String,
    val characterLikedFood: String,
    val characterDislikeFood: String
) : Parcelable