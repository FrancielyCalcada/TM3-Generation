package classes.filha

import classes.pai.Animal

class Cavalo(nome: String, idade: Int,) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("cavalo")
    }

    override fun correr() {
        super.correr()
        println("cavalo")
    }

}