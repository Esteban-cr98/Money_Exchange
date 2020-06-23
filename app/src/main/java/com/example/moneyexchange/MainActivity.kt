package com.example.moneyexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BT_convertir.setOnClickListener {
            val tipo1= sp_first.selectedItem.toString()
            val tipo2= sp_second.selectedItem.toString()
            val moneyS= et_numero.text.toString()

            val money = moneyS.toDouble()

            var resultado = 0.0

            if (tipo1 == "Pesos Colombianos") {
                if (tipo2 == "Pesos Colombianos") {
                    resultado = (money * 1.0)
                }
                if (tipo2 == "Pesos Mexicanos") {
                    resultado = (money * 0.006)
                }
                if (tipo2 == "Dolares") {
                    resultado = (money * 0.00027)
                }
                if (tipo2 == "Euros") {
                    resultado = (money * 0.00024)
                }
            }
            if (tipo1 == "Pesos Mexicanos") {
                if (tipo2 == "Pesos Colombianos") {
                    resultado = (money * 165.89)
                }
                if (tipo2 == "Pesos Mexicanos") {
                    resultado = (money * 1)
                }
                if (tipo2 == "Dolares") {
                    resultado = (money * 0.044)
                }
                if (tipo2 == "Euros") {
                    resultado = (money * 0.039)
                }
            }
            if (tipo1 == "Dolares") {
                if (tipo2 == "Pesos Colombianos") {
                    resultado = (money * 3727.0)
                }
                if (tipo2 == "Pesos Mexicanos") {
                    resultado = (money * 22.5)
                }
                if (tipo2 == "Dolares") {
                    resultado = (money * 1)
                }
                if (tipo2 == "Euros") {
                    resultado = (money * 0.89)
                }
            }
            if (tipo1 == "Euros") {
                if (tipo2 == "Pesos Colombianos") {
                    resultado = (money * 4197.69)
                }
                if (tipo2 == "Pesos Mexicanos") {
                    resultado = (money * 25.34)
                }
                if (tipo2 == "Dolares") {
                    resultado = (money * 1.13)
                }
                if (tipo2 == "Euros") {
                    resultado = (money * 1)
                }
            }
            TV_resultado.text = "$moneyS $tipo1 son igual a $resultado $tipo2"


        }
    }
}