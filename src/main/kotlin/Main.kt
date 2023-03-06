fun main(){

    println("-------------------------------------------------------")
    println("INPUT TRANSAKSI PENJUALAN BAJU")
    println("-------------------------------------------------------")
    print("Nama Pembeli : ")
    val namaPembeli:String = readLine().toString()
    print("Baju : ")
    val baju:String = readLine().toString()
    print("Jumlah : ")
    val jumlah:Int = readLine()?.toInt() ?: 0
    print("Harga : ")
    val harga:Int = readLine()?.toInt() ?: 0
    print("Uang Bayar : ")
    val uangBayar:Int = readLine()?.toInt() ?: 0
    val kembali:Int = uangBayar-(harga*jumlah)


    val pembeli = Penjualan(namaPembeli, baju, jumlah, harga, uangBayar, kembali)

    output(pembeli)
}

fun output(pembeli: Penjualan) {


}



