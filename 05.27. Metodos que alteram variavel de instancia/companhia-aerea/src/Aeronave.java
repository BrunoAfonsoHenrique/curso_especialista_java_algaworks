public class Aeronave {

    boolean ativo = true;

    int totalAssentos;

    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            // existe uma forma melhor de fazer isso: usando exceptions
            System.out.println("Aeronave desativa. Assentos não reservados!");
        }
    }
}
