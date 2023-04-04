interface Autenticavel {

    fun autentica(senha: Int): Boolean

    // nesse caso que envolve uma senha e não é possível ser privada, é mlehor não fazer essa implementação padão
//    private val senha: Int
//
//    fun autentica(senha: Int): Boolean {
//        if(this.senha == senha){
//            return true
//        }
//        return false
//    }

}