package pl.pomocnawirus.model

import com.google.firebase.firestore.DocumentId
import pl.pomocnawirus.utils.FirestoreUtils

data class User(
    @DocumentId var id: String = "",
    val email: String = "",
    var name: String = "",
    var userType: String = USER_TYPE_USER,
    var phone: String = "",
    var groupId: String = "",
    val tasksToDo: ArrayList<String> = arrayListOf()
) {
    companion object {
        const val USER_TYPE_ADMIN = "ADMIN"
        const val USER_TYPE_USER = "USER"
    }

    fun createUserHashMap(): HashMap<String, Any> = hashMapOf(
        FirestoreUtils.firestoreKeyEmail to this.email,
        FirestoreUtils.firestoreKeyName to this.name,
        FirestoreUtils.firestoreKeyPhone to this.phone,
        FirestoreUtils.firestoreKeyUserType to this.userType,
        FirestoreUtils.firestoreKeyGroupId to this.groupId,
        FirestoreUtils.firestoreKeyTasksToDo to this.tasksToDo
    )
}