import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>(2);

        alunos.add("Joao");
        alunos.add("Maria");

//        for (int i = 0; i < alunos.size(); i++) {
//            String aluno = alunos.get(i);
//            System.out.println(aluno);
//        }

        for (String aluno1 : alunos) {
            System.out.println(aluno1);
        }

//        for (int i = 0; i < alunos.length; i++) {
//            String aluno = alunos[i];
//            System.out.println(aluno);
//        }

    }
}
