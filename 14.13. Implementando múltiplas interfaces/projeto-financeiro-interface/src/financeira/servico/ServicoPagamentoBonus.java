package financeira.servico;

import financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        // aqui teria a implementação da logica de pagamento

        System.out.printf("DEBUG: BONUS PAGO NO VALOR DE %.2f%n", valorBonus);
    }
}
