package com.example.praktikumwireframe

object OrderData {
    var namaUser: String = ""
    val makananDipilih = mutableListOf<String>()
    var namaPenerima: String = ""
    var alamat: String = ""
    var patokan: String = ""

    fun reset() {
        makananDipilih.clear()
        namaPenerima = ""
        alamat = ""
        patokan = ""
    }
}
