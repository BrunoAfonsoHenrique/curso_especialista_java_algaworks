public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João da Silva";
        funcionario.quantidadeDeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaDePagamento folhaPagamento = new FolhaDePagamento();

        Holerite holerite = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);
        holerite.imprimir();
    }
}
