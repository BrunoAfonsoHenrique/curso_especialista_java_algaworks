public class FolhaDePagamento {

    Holerite calcularSalario(int qtdeHorasTrabalhadas, int qtdeHorasExtras, ContratoTrabalho contratoTrabalho) {

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasNormais = contratoTrabalho.valorHoraNormal * qtdeHorasTrabalhadas;
        holerite.valorTotalHorasExtras = contratoTrabalho.valorHoraExtra * qtdeHorasExtras;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {
            holerite.valorAdicionalParaFilhos = subtotal * 0.10;
        }

        return holerite;

    }
}
