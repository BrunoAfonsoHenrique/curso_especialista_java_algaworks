import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
        cadastro.removerPorCidade("Fortim/CE");

        cadastro.removerTodos();

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        hoteis.set(3, new Hotel("Teste", "teste", 1)); substitui o objeto
//        hoteis.add(3, new Hotel("Teste", "teste", 1)); // adiciona o objeto
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}