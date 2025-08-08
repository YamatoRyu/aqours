package protection.member.aqours.fragment.person.list_person_photo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListPersonPhotoData(
    val characterImage: Int
) : Parcelable
