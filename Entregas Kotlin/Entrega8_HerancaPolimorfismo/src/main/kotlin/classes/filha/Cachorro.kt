package classes.filha

import classes.pai.Animal

class Cachorro(nome: String, idade: Int,) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("cachorro")
    }

    override fun correr(){
        super.correr()
        println("cachorro")
    }

}