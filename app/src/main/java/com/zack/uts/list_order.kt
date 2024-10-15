package com.zack.uts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zack.uts.Adapter.OrderAdapter
import com.zack.uts.Model.ModelListOrder

class list_order : AppCompatActivity() {

    private lateinit var RecyclerViewMakanan : RecyclerView
    private lateinit var AdapterMakanan : OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_order)


        val menuMakanan = listOf(
            ModelListOrder(
                R.drawable.img1,
                "mashed potato cups",
                "29 nov, 01.09 pm",
                "$30.00",
                "2 items"
            ),
            ModelListOrder(
                R.drawable.img2,
                "mini taco bowls",
                "29 nov, 01.09 pm",
                "$35.00",
                "5 items"
            ),
            ModelListOrder(
                R.drawable.makanan,
                "kwetiau goreng",
                "29 nov, 01.09 pm",
                "$15.00",
                "1 items"
            ),
            ModelListOrder(
                R.drawable.makan2,
                "paket komplit 1",
                "29 nov, 01.09 pm",
                "$50.00",
                "1 items"
            ),
            ModelListOrder(
                R.drawable.makan5,
                "paket komplit 2",
                "29 nov, 01.09 pm",
                "$53.00",
                "2 items"
            )

        )


        RecyclerViewMakanan = findViewById(R.id.RvMakanan)
        RecyclerViewMakanan.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        AdapterMakanan = OrderAdapter(menuMakanan)
        RecyclerViewMakanan.adapter = AdapterMakanan



    }
}