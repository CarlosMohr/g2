import java.time.LocalDate;
import java.util.EmptyStackException;

import encomenda.Encomenda;


public abstract class Envio implements Precificavel{
    private LocalDate data; //Principio O <- só a própriaclasse pode acessar diretamente
    private double precoBase;
    private Encomenda encomenda;


    public Envio(LocalDate data, double precoBase, Encomenda encomenda) {
        this.data = data;

        if (precoBase < 0){
            throw IllegalArgumentException("O preço precisa ser positivo!");
        }
        this.precoBase = precoBase;


        if (encomenda == null) {
            throw EmptyStackException("Para fazer um envio é necessário uma encomenda!");
        }
        this.encomenda = encomenda;
    }

    public LocalDate getData() {
        return data;
    }
    public double getPrecoBase() {
        return precoBase;
    }
    public Encomenda getEncomenda() {
        return encomenda;
    }

    @Override 
    public abstract void calcularFrete();
}