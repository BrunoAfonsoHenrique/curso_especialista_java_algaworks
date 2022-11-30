import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        GestorFiscal gestorFiscal = new GestorFiscal();
        NotaFiscalProduto nfBolaFutebol = new NotaFiscalProduto("Bola de futebol", 300, 50);
        NotaFiscalServico nfReparoPc = new NotaFiscalServico("Reparo da placa mãe", 1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoPc);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoPc.calcularImpostos());
    }
}
