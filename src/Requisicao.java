import java.time.LocalDate;

public class Requisicao {

    LocalDate data;
    Utilizador utilizador;
    Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador, Copia copia) {
        this.data = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Copia getCopia() {
        return copia;
    }
}
