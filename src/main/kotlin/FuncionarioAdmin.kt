abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel{

    override fun autentica(senha: Int): Boolean {        // adc o open para que seja possivel sobrescrever no Diretor
        if(this.senha == senha){
            return true
        }
        return false
    }

}