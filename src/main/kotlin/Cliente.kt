class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
//    override val senha: Int         // se fosse utilizar a implementação padão na interface
): Autenticavel{

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}