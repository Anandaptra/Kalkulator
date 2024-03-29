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

        fun getBayar(){
            println("Bayar: Rp $uangBayar")
        }

        fun getKembalian(){
            println("Kembali: Rp $kembali")
        }

        fun getBonus(){
            val hargaDiskon = total-50000
            if(total in 150001..200000) {
                println("Bonus : 1 buah Gelang")
            } else if (total in 200001..300000){
                println("Bonus : 1 buah Gantungan Kunci")
            } else if (total > 300000){
                println("Bonus : Diskon 50000 , Harga Akhir : $hargaDiskon)")
            } else {
                println("Bonus : 0")
            }
        }
}