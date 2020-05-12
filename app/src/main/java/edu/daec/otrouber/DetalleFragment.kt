package edu.daec.otrouber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import edu.daec.otrouber.modelo.DescripcionRecyclerAdapter
import edu.daec.otrouber.modelo.DespensaRecyclerAdapter
import edu.daec.otrouber.modelo.Details
import edu.daec.otrouber.modelo.Item
import kotlinx.android.synthetic.main.fragment_despensa.*
import kotlinx.android.synthetic.main.fragment_detalle.*

/**
 * A simple [Fragment] subclass.
 */
class DetalleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        detail_recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = DescripcionRecyclerAdapter(mutableListOf<Details>())
        }
        alta.setOnClickListener{
            view.findNavController().navigate(R.id.altaFragment)
        }

        val products = mutableListOf<Details>(
            Details("Leche","Alpura clasica entera 1Lt $20.50"),
            Details("Pan","Bolillo 1 pza $1.50"),
            Details("Pasta","Spaghetti La Moderna 450g $12.10"),
            Details("Arroz","Verde Valle 1Kg $26.50"),
            Details("Frijol","Verde Valle Peruano 900g $48.70"),
            Details("Chocolate", "Chocomilk en polvo lata 400g $45.90"),
            Details("Cerveza","Corona Extra 12 latas $172.00"),
            Details("Agua","Bonafont 6Lt $24.90"),
            Details("Café","Soluble Nescafe Clásico 225g $152.00"),
            Details("Cereal","Zucaritas Kellogg´s 760g $68.00"),
            Details("Papa","Blanca Alfa por kilo $28.90/Kg"),
            Details("Zanahoria","Zanahoria por kilo $14.90/Kg"),
            Details("Catsup", "Heinz 397g $17.00")
        )

        detail_recyclerView.adapter = DescripcionRecyclerAdapter(products)
    }
}
