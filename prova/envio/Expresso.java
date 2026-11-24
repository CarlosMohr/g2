import java.time.LocalDate;

public class Expresso extends Envio {

    private double pesoExcedente;
    public Expresso(LocalDate data, double precoBase, Encomenda encomenda, double pesoExcedente) {
        super(data, precoBase, encomenda);
        this.pesoExcedente = pesoExcedente;
    }

    @Override
    public void calcularFrete() {
        if (getPeso() > 10) {
            return GetprecoBase() + (pesoExcedente * 15);
        }
    }
}