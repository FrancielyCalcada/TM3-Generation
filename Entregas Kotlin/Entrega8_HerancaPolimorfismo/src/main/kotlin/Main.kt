import classes.filha.Cachorro
import classes.filha.Cavalo
import classes.filha.Preguica

/*
    Exercícios Herança/Polimorfismo
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
fiquem na classe Animal:

Animal -> Cachorro; Cavalo; Preguiça
Cachorro: Nome, idade, emitir som, correr
Cavalo: Nome, idade, emitir som, correr
Preguiça: Nome, idade, emitir som, subir em árvores

Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que
 emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.

 */

fun main() {

    var cachorro1 = Cachorro("Krypto O Supercão", 5)

    print("Nome: ")
    println(cachorro1.nome)

    print("Idade: ")
    println(cachorro1.idade)

    cachorro1.correr()
    cachorro1.emitirSom()
    println()

    var cavalo1 = Cavalo("BoJack Horseman", 40)

    print("Nome: ")
    println( cavalo1.nome)

    print("Idade: ")
    println(cavalo1.idade)

    cavalo1.correr()
    cavalo1.emitirSom()
    println()

    var preguica1 = Preguica("Flecha Zootopia", 30)

    print("Nome: ")
    println(preguica1.nome)

    print("Idade: ")
    println(preguica1.idade)

    preguica1.emitirSom()
    preguica1.subirArvore()

}