package classes.filha

import classes.pai.Animal

class Preguica(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("preguiça")
    }

    fun subirArvore(){
        println("Subindo na árvore como uma preguiça")
    }

}