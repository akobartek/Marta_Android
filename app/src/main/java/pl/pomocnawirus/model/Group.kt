package pl.pomocnawirus.model

import com.google.firebase.firestore.DocumentId
import pl.pomocnawirus.utils.FirestoreUtils

data class Group(
    @DocumentId var id: String = "",
    var name: String = "",
    var city: String = "",
    var admins: ArrayList<String> = arrayListOf(),
    var email: String = "",
    var phone: String = "",
    var orders: ArrayList<Order> = arrayListOf()
) {
    fun createGroupHashMap(): HashMap<String, Any> = hashMapOf(
        FirestoreUtils.firestoreKeyName to this.name,
        FirestoreUtils.firestoreKeyCity to this.city,
        FirestoreUtils.firestoreKeyAdmins to this.admins,
        FirestoreUtils.firestoreKeyEmail to this.email,
        FirestoreUtils.firestoreKeyPhone to this.phone,
        FirestoreUtils.firestoreKeyOrders to this.orders
    )
}