import com.algaworks.estoque.Carro;
import com.algaworks.estoque.GerenciadorEstoque;
import com.algaworks.estoque.Roupa;

public class Principal {

    public static void main(String[] args) {

        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque();
//        estoqueRoupas.adicionar(new Carro("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta basica branca", 20));
        estoqueRoupas.adicionar(new Roupa("Camiseta basica preta", 10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque();
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 10));
        imprimirEstoque(estoqueCarros);

    }

    private static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque) {
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }
}
