package uz.abbosbek.expandablelistview.utils

object MyData {
    val map = HashMap<String, ArrayList<String>>()
    val titleList = ArrayList<String>()

    fun addElement() {
        titleList.add("Android_10")
        titleList.add("Android_11")
        titleList.add("Android_12")

        val list_10 = ArrayList<String>()
        list_10.add("Abdujabbor")
        list_10.add("Abdujabbor")
        list_10.add("Abdujabbor")
        list_10.add("Sultonbek")
        list_10.add("Sultonbek")
        list_10.add("Sultonbek")

        val list_11 = ArrayList<String>()
        list_11.add("Kamoldin")
        list_11.add("Kamoldin")
        list_11.add("Kamoldin")
        list_11.add("Javohir")
        list_11.add("Javohir")
        list_11.add("Javohir")

        val list_13 = ArrayList<String>()
        list_13.add("Bekzodjon")
        list_13.add("Bekzodjon")
        list_13.add("Bekzodjon")
        list_13.add("Bekzodjon")
        list_13.add("Muzaffar")
        list_13.add("Muzaffar")
        list_13.add("Muzaffar")

        map[titleList[0]] = list_10
        map[titleList[1]] = list_11
        map[titleList[2]] = list_13

    }
}