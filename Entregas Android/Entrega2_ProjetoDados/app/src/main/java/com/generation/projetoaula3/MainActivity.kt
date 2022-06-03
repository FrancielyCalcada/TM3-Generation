package com.generation.projetoaula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById(id)
        val buttonD6 = findViewById<Button>(R.id.btnD6)

        buttonD6.setOnClickListener{
            //mensagem flutuante - Toast | show() - mostrar mensagem para o usuário | Ex.: mensagens de erro, campo não preenchido,...
            //Toast.makeText(this, "Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }

        val buttonD12 = findViewById<Button>(R.id.btnD12)

        buttonD12.setOnClickListener{
            rolarDados(12)
        }

        val buttonD20 = findViewById<Button>(R.id.btnD20)

        buttonD20.setOnClickListener{
            rolarDados(20)
        }

    }

    private fun rolarDados(lados: Int){
        //range: entre 1 e o num de lados passados | .random: vai gerar um num aleatorio
        val rolagem = (1..lados).random()

        when(lados){
            6 ->{
                val textDado6 = findViewById<TextView>(R.id.txtD6)
                textDado6.text = rolagem.toString()
            }
            12 ->{
                val textDado12 = findViewById<TextView>(R.id.txtD12)
                textDado12.text = rolagem.toString()
            }
            20 ->{
                val textDado20 = findViewById<TextView>(R.id.txtD20)
                textDado20.text = rolagem.toString()
            }
        }

        //exemplo para trocar imagem de acordo com o número
        /*val image = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){

            1 -> image.setImageResource(R.drawable.imageD1)
            2 -> image.setImageResource(R.drawable.imageD2)
            3 -> image.setImageResource(R.drawable.imageD3)
            4 -> image.setImageResource(R.drawable.imageD4)
            5 -> image.setImageResource(R.drawable.imageD5)
            6 -> image.setImageResource(R.drawable.imageD6)

        }*/
    }

}