package com.canbayazit.kotlinlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    println("Merhaba kotlin")
    println(5*10)


        //VERIABLES

        var a = 5
        var b = 20

        println(a*b)

        var yas = 50
        println(yas  / 5 * 8)

        yas  = 60
        println(yas /5 * 8)


        val pi = 3.14   // sabit deger verilen degişkenlerde val veri tipi kullanılır.
        val x = 5
        val y = 20

        println(x +y)

        val yasSonucu = yas * x
        println(yasSonucu)


        println("-------------------------String---------------------------")
        val myString = "Benim Yeni Metnim"
        println(myString)

        val isim = "can"
        val soyIsim = "bayazıt"
        val tamIsim= isim + " " + soyIsim
        println(tamIsim)


        println("-------------------------Boolean---------------------------")

        var benimBoolean = true
        benimBoolean = false


        //  <    kucuktur
        //  >   buyuktur
        //  ==   esittir
        //  !=  esit degildir
        //  <=  kucuk esıttır
        //  >=   buyuk esıttır
        //  &&  ve
        //  ||  veya
        //

    println(3<5)
        println(4!=4)



        println("-------------------------Veri Tipi Donusturme---------------------------")


        var benimInt = 10
        var benimLongaCevirilenInt = benimInt.toLong()
        println(benimLongaCevirilenInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)


        println("-------------------------Matematiksel Islemler---------------------------")
        var sayi = 8
        println(sayi)
        sayi = sayi+1
        println(sayi)

        var digersayi = 10
        println(digersayi > sayi)



        //Remainder

        println(10%3) // 10 u üçe bölersen kaç kalır.

        println("-------------------------If Statements-Eger Kontrolleri---------------------------")

        val skor = 50

        if (skor <10){
            println("Oyunu kaybettin")
        }else if(skor >= 10 && skor<20){
            println("Skorun idare eder ")
        }else if(skor >=20 && skor <30){
            println("Skorun iyi")
        }else {
            println("Muazzam Aq")
        }


        println("-------------------------When---------------------------")
        var notRakami = 2
        var notStringi = ""
        when(notRakami){

            0 -> notStringi = "Geçersiz Not"
            1 ->notStringi = "Zayıf"
            2 ->notStringi = "Kötü"
            3 ->notStringi = "Orta"
            4 ->notStringi = "Iyi"
            else ->notStringi = "Pek ıyi"
        }
 println(notStringi)

                    //Donguler
        println("-------------------------For---------------------------")

        val numaraDizisi = arrayOf(5,10,15,20,25,30)

        val q = numaraDizisi[0] / 5 + 3
        println(q)

        println("Dongü basladı")
        for (numara in numaraDizisi){

            println(numara / 5 + 3)

        }
        println("Dongu bitti")



        for (indeks in numaraDizisi.indices){
            println(numaraDizisi[indeks] / 5 +3)
        }
println("burası")
        for (b in 0..9){
            println(b)
        }

        var benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Can")
        benimDigerStringDizim.add("bayazıt")
        println("naber")
        for (str in benimDigerStringDizim){
            println(str)
        }

    }
}