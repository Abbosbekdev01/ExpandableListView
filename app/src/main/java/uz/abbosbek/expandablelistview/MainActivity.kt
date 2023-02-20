package uz.abbosbek.expandablelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.abbosbek.expandablelistview.adapters.MyExpandAdapter
import uz.abbosbek.expandablelistview.databinding.ActivityMainBinding
import uz.abbosbek.expandablelistview.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var myExpandAdapter: MyExpandAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /** MyData qo'shilgan ma'lumotlarni bu Activity da chaqirib oldik*/
        MyData.addElement()

        myExpandAdapter = MyExpandAdapter(MyData.titleList,MyData.map)
        binding.myExpandView.setAdapter(myExpandAdapter)
        
        binding.myExpandView.setOnChildClickListener { expandableListView, view, i, i2, l ->

            Toast.makeText(this, "${MyData.map[MyData.titleList[i]]?.get(i2)}", Toast.LENGTH_SHORT)
                .show()
            true
        }
    }
}