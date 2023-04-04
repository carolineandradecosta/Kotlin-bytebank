abstract class Conta(                                                  // construtor primário
    var titular: String,
    val numero: Int                                          //  definir var ou val
) {
    var saldo = 0.0
        protected set

//    constructor(titular: String, numero: Int){              // construtor secundário
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    // pode ser removida pq a contPoupança e contCorrente já vão herdar esse comportamento da contTransferivel
    // alem disso, essa função teria que ser override na contaTransferivel
//    fun transfere(valor: Double, destino: Conta): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }





//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }

}