package com.example.aplikasikotlin

fun main(args: Array<String>) {
    printHeader("Biodata")
    biodata("Alfindo Oktavian Ramadhan", alamat = "jl.diponegoro no 6,rt 3,rw2,sukorejo,ponorogo")
    printHeader("Hobby")
    hobby("Berenang", "karena berenang merupakan olahraga yang sangat menyehatkan badan.", bahan = "Kacamata berenang dan pakaian berenang")
}

fun printHeader(title: String) {
    val border = "====".repeat(15)
    println("$border\n==== $title ====\n$border")
}

fun biodata(nama: String, kelas: String = "Teknologi Informasi 2A", alamat: String, nim: String = "233307001", prodi: String = "TEKNOLOGI INFORMASI") {
    val biodata = "Nama = $nama\nKelas = $kelas\nAlamat = $alamat\nNIM = $nim\nProdi = $prodi\n"
    print(biodata)
}

fun hobby(hobby: String, desc: String, bahan: String) {
    println("Hobby = $hobby")
    println("Deskripsi = $desc")
    println("Alat & Bahan = $bahan")
}