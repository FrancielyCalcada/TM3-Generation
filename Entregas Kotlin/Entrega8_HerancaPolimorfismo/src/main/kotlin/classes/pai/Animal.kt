package classes.pai

open class Animal (var nome: String, var idade: Int){

    open fun emitirSom(){
        print("Emitindo som de ")
    }

    open fun correr(){
        print("Correndo como um ")
    }

}