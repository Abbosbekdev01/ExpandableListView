package uz.abbosbek.expandablelistview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import uz.abbosbek.expandablelistview.databinding.ItemChildNameBinding
import uz.abbosbek.expandablelistview.databinding.ItemParentBinding

class MyExpandAdapter(
    val titleList: ArrayList<String>, val map: HashMap<String, ArrayList<String>>
) : BaseExpandableListAdapter() {

    /** grupani nechta yaratilishini so'raydi*/
    override fun getGroupCount(): Int = titleList.size

    /** nechta malumot yaratilishini so'raydi yani nechtaligini so'raydi*/
    override fun getChildrenCount(groupPostion: Int): Int {
        return map[titleList[groupPostion]]!!.size
    }

    /** grouppani elementini so'raydi*/
    override fun getGroup(p0: Int): Any {
        return titleList[p0]
    }

    /** child yani malumotni so'raydi*/
    override fun getChild(p0: Int, p1: Int): Any {
        val list = map[titleList[p0]]!!
        return list[p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
       }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
     }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(groupPostion: Int, isExpaded: Boolean, convertView: View?, parent: ViewGroup?): View {
        val itemParentBinding = ItemParentBinding.inflate(LayoutInflater.from(parent?.context),parent, false)
        itemParentBinding.tvParentName.text = titleList[groupPostion]
        return itemParentBinding.root
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        val itemChildBinding = ItemChildNameBinding.inflate(LayoutInflater.from(p4?.context), p4, false)
        itemChildBinding.itemChildName.text = map[titleList[p0]]?.get(p1)
        return itemChildBinding.root
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}