class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get() {
            return salario
        }
    // não faz sentido mater essa implementação aqui, já que o funcionario admin já possui e essa clase herda
//    override fun autentica(senha: Int): Boolean {
//        return super <Autenticavel>.autentica(senha)
//    }
}