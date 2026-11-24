public class Internacional extends Envio {
    public Internacional(LocalDate data, double precoBase, Encomenda encomenda) {
        super(data, precoBase, encomenda);
    }
    @Override
    public void calcularFrete() {
        return GetprecoBase() * 2.5;
        }
    }