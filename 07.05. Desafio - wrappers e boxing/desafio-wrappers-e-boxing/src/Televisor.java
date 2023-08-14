import java.util.Objects;

public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        Objects.requireNonNull(novoCanal, "Novo canal deve ser informado");
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        Objects.requireNonNull(novoVolume, "Novo volume deve ser informado");
        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = novoVolume;
            System.out.println("Volume alterado para " + volume);
        }
    }

}