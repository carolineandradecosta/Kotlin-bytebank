fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numerox $numeroX")
    println("numeroy $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}