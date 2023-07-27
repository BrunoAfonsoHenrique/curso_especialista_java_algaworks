import com.algaworks.detran.Carro;
import com.algaworks.detran.Proprietario;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        //Map<Carro, Proprietario> proprietarios = new Hashtable<>();
        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        proprietarios.put(porsche, jose);
//        proprietarios.remove(new Carro("JAV5A67", "XXX"));

//        proprietarios.put(null, joao);
        proprietarios.put(porsche, null);

//        System.out.println(proprietarios);

//        System.out.println(proprietarios.get(ford));
//        System.out.println(proprietarios.get(new Carro("JAV5A67", "XXX")));
//        System.out.println(proprietarios.get(new Carro("XXX5A67", "XXX"))); // retorna null

        // Iterando nas chaves
//        Set<Carro> chaves = proprietarios.keySet();
//        for (Carro carro : chaves) {
//
//        }

//        for (Carro carro : proprietarios.keySet()) {
//            System.out.println(carro);
//
//        }

        // Iterando nos valores
//        Collection<Proprietario> proprietarioCollection = proprietarios.values();
//        for (Proprietario proprietario : proprietarioCollection) {
//
//        }

//        for (Proprietario proprietario : proprietarios.values()) {
//            System.out.println(proprietario);
//        }

        //Iterar na chave e valor
//        for (Carro carro : proprietarios.keySet()) {
//            Proprietario proprietario = proprietarios.get(carro);
//            System.out.printf("Placa: %s -> (%s) = Propritario(a): %s%n", carro.getPlaca(),
//                    carro.getModelo(), proprietario.getNome());
//        }

        //Iterar chave valor juntos (Mais rápido)
//        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
//            System.out.printf("Placa: %s -> (%s) = Propritario(a): %s%n", entry.getKey().getPlaca(),
//                    entry.getKey().getModelo(), entry.getValue().getNome());
//        }
        //Simplificando
//        for (var entry : proprietarios.entrySet()) {
//            System.out.printf("Placa: %s -> (%s) = Propritario(a): %s%n", entry.getKey().getPlaca(),
//                    entry.getKey().getModelo(), entry.getValue().getNome());
//        }
    }
}
