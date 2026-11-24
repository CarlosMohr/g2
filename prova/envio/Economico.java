public class Economico extends Envio {
    public Economico(LocalDate data, double precoBase, Encomenda encomenda) {
        super(data, precoBase, encomenda);    //Principio D <- classe filha depende de Envio usando extends e super
    }

    @Override
    public void calcularFrete() {
        return GetprecoBase();
        }
    }