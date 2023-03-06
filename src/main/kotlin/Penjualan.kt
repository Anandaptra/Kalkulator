class Penjualan(
        val namaPembeli:String,
        val baju:String,
        val jumlah:Int = 0,
        val harga:Int = 0,
        val uangBayar:Int,
        pKembali:Int
)
    {
        private val kembali = if (pKembali < 0) "Pembayaran kurang" else pKembali
        private val total = jumlah * harga

        fun getNamaPembeli(){
            println("Nama Pembeli: ${namaPembeli.uppercase()}")
        }

        fun getBaju(){
            println("Baju yang dibeli: $baju")
        }

        fun getJumlah(){
            println("Jumlah : $jumlah")
        }

        fun getTotal(){
            println("Total : Rp $total")
        }
}