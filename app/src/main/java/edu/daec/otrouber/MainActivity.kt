package edu.daec.otrouber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.FirebaseError
import com.google.firebase.database.ValueEventListener
import edu.daec.otrouber.modelo.DespensaFirebase
import edu.daec.otrouber.modelo.Item

class MainActivity : AppCompatActivity() {

    private val despensaFirebase : DespensaFirebase = DespensaFirebase()
    private var itemLast: Item = Item()
    private var mutableList: MutableList<Item> = mutableListOf<Item>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //despensaFirebase.cargaFirebaseDummy()
    }


    fun agregaItem(view: View){

        itemLast = despensaFirebase.cargaUnItem(
            Item("","Leche", 15 ))
        despensaFirebase.borraUnItem(itemLast)
    }

    fun consulta(view: View){
        despensaFirebase.obtenTodos()
    }
    override fun onResume() {
        super.onResume()
    }
}
