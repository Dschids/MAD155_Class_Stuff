package com.example.mad155classstuff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mad155classstuff.adapter.MyAdapter
import com.example.mad155classstuff.model.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                                LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        //data
        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)

        recyclerView.adapter = thisAdapter

    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text1"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text2"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text3"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text4"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text5"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text6"))
        items.add(MyModel(R.drawable.ic_launcher_foreground, "Text7"))

        return items
    }
}