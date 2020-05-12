package edu.daec.otrouber.modelo

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import edu.daec.otrouber.R

class DescripcionRecyclerAdapter( private val list: List<Details>)
    : RecyclerView.Adapter<DescriptionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DescriptionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DescriptionViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DescriptionViewHolder, position: Int) {
        val detail: Details = list[position]
        holder.bind(detail)
    }

    override fun getItemCount(): Int = list.size

}

class DescriptionViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.renglon_detalle, parent, false)) {

    private var articuloTextView: TextView? = null
    private var descripcionTextView: TextView? = null


    init {
        articuloTextView = itemView.findViewById(R.id.articleView)
        descripcionTextView = itemView.findViewById(R.id.detailView)
    }

    fun bind(detail: Details) {
        Log.i("Error articulo",detail.producto)
        articuloTextView?.text = detail.producto
        descripcionTextView?.text = detail.descripcion
    }

}