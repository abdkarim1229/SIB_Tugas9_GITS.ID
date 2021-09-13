class Bungkus {
    //variabel untuk class inner
    val asus = "Merk Laptop ASUS"

    //membuat class nested
    class Laptop {
        //membuat variabel di dalam class nested
        val n = "Merk Laptop Lenovo"

        //membuat function didalam class nested
        fun Merk() = "Merk Laptop ACER"
    }

    //membuat class inner
    inner class Inner {
        //membuat function dan memnnggil variabel asus
        fun MerkASUS() = asus
    }
}

fun main() {
    println("~ Nested Class ~")
    //memanngil variabel di dalam class nested
    println(Bungkus.Laptop().n)
    //memanngil function didalam class nested menggunakan object
    val laptop = Bungkus.Laptop()
    println(laptop.Merk())
    println("~ Inner Class ~")
    //memanggil function di dalam class Inner menggunakan object asus
    val asus = Bungkus()
    println("Object asus : ${asus.Inner().MerkASUS()}")
}