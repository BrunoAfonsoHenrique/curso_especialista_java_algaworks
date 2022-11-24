import com.algaworks.rh.Funcionario;
import com.algaworks.rh.Holerite;
import com.algaworks.rh.Programador;

public class Principal {

    public static void main(String[] args) {

//        Funcionario funcionario1 = new Funcionario("Bruno", 40.0);
//        System.out.println(funcionario1);
//        Holerite holerite = funcionario1.gerarHolerite(10, "Dezembro");
//        holerite.imprimir();
//
//        System.out.println();

        Programador programador1 = new Programador("Jeferson", 25.0);
        programador1.setValorBonus(100);
        System.out.println(programador1);
        Holerite holerite2 = programador1.gerarHolerite(30, "Janeiro");
        holerite2.imprimir();
    }
}
