fun cedulas(dinheiro: Int) {

    val cem  = dinheiro / 100
    var troco = dinheiro % 100

    val cinquenta = troco / 50
    troco = troco % 50

    val vinte = troco / 20
    troco = troco % 20

    val dez = troco / 10
    troco = troco % 10

    val cinco = troco / 5
    troco = troco % 5

    val dois = troco / 2
    troco =  troco % 2

    val um = troco / 1


    println("$cem nota(s) de R$ 100,00")
    println("$cinquenta nota(s) de R$ 50,00")
    println("$vinte nota(s) de R$ 20,00")
    println("$dez nota(s) de R$ 10,00")
    println("$cinco nota(s) de R$ 5,00")
    println("$dois nota(s) de R$ 2,00")
    println("$um nota(s) de R$ 1,00")


}