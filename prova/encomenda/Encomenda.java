import modelo.Remetente;

public class Encomenda {
    private String descricao;
    private double peso;
    private Remetente remetente;

    public Encomenda(String descricao, double peso, Remetente remetente) {
        this.descricao = descricao;

        if (peso < 0) {
            throw IllegalArgumentException("O peso precisa ser positivo");
        }
        this.peso = peso;
        this.remetente = remetente;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }
    public Remetente getRemetente() {
        return remetente;
    }
}