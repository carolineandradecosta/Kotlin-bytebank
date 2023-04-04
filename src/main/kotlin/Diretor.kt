class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double,
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    // não faz sentido mater essa implementação aqui, já que o funcionario admin já possui e essa clase herda
//    override fun autentica(senha: Int): Boolean {
//        return super <FuncionarioAdmin>.autentica(senha)
//    }
}