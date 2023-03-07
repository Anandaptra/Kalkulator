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

private fun output(pembeli: Penjualan) {

    println("======================================================")
    println("STRUK PEMBELIAN BUKU TOKO AND5")
    println("______________________________________________________")
    pembeli.getNamaPembeli()
    pembeli.getJumlah()
    pembeli.getTotal()
    pembeli.getBayar()
    pembeli.getKembalian()
    pembeli.getBonus()
    println("------------------TERIMAKASIH--------------------------")
}



