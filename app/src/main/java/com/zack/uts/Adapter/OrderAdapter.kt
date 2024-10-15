package com.zack.uts.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zack.uts.Detailorder
import com.zack.uts.Model.ModelListOrder
import com.zack.uts.R

class OrderAdapter (
    val itemListMakanan : List<ModelListOrder>
): RecyclerView.Adapter<OrderAdapter.MyviewHolder>() {
    class MyviewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txtNamaMakanan : TextView = itemView.findViewById(R.id.txtNmMakanan)
        var imgMakanan : ImageView = itemView.findViewById(R.id.imgMakanan)
        var txtTanggal : TextView = itemView.findViewById(R.id.txtTgl)
        var txtHarga : TextView = itemView.findViewById(R.id.txtHarga)
        var txtItem : TextView = itemView.findViewById(R.id.txtJumlahItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemListMakanan.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currenItem = itemListMakanan[position]
        holder.txtNamaMakanan.setText(currenItem.Nama)
        holder.imgMakanan.setImageResource(currenItem.image)
        holder.txtTanggal.setText(currenItem.Tanggal)
        holder.txtHarga.setText(currenItem.Harga)
        holder.txtItem.setText(currenItem.Item)


        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context,Detailorder::class.java).apply {
                putExtra("namaMakanan", currenItem.Nama)
                putExtra("imageMakanan", currenItem.image)
            }
            context.startActivity(intent)
        }

    }
}