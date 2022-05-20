package com.example.a552kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a551kotlin.Products
import com.example.a551kotlin.Watch
import com.example.ebay.Adapter.AdapterMarket
import com.example.ebay.Adapter.Market_adapter_2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        watch()
        products()
        tools()
    }

    private fun tools() {

        rec_3.setHasFixedSize(true)
        rec_3.layoutManager = GridLayoutManager(this, 3)

        val list = ArrayList<Tools>()

        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))
        list.add(Tools(R.drawable.ibm, "IBM pro."))

        val adapter = Adapter_Tools(this, list)
        rec_3.adapter = adapter
    }

    private fun watch() {
        main_recyclerView_id.setHasFixedSize(true)
        main_recyclerView_id.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list = ArrayList<Watch>()

        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))

        val adapter = Market_adapter_2(this, list)
        main_recyclerView_id.adapter = adapter
    }

    private fun products() {

        rec_2.setHasFixedSize(true)
        rec_2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list = ArrayList<Products>()
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )

        val adapter = AdapterMarket(this, list)
        rec_2.adapter = adapter
    }
}