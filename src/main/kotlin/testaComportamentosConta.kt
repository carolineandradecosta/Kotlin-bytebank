fun testaComportamentosConta(){
    val contaAlex = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )                          // utilizando labels
    val contaFran = ContaPoupanca(
        numero = 1001,
        titular = "Fran"
    )

    contaAlex.deposita(200.0)

    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

//    // essa forma de realizar o deposito não é a melhor
//    println("depositando na conta do Alex")
//    contaAlex.saldo += 50.0
//    println("depositando na conta da Fran")
//    println(contaAlex.saldo)

//    // realizando o deposito através da função deposita
//    println("depositando na conta do Alex")
//    deposita(contaAlex, 50.0)
//    println(contaAlex.saldo)
//
//    println("depositando na conta da Fran")
//    deposita(contaFran, 70.0)
//    println(contaFran.saldo)

    // essa é a forma mais apropriada de realizar o deposito utilizando poo
    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando da conta do Alex")
    contaAlex.saca(50.0)
    println(contaAlex.saldo)

    println("Sacando da conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran") // o saque não é realizado
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Tranferência da conta da Fran para o Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 100.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)

}