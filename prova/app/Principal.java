import modelo.Remetente;
import prova.envio.Envio;
import envio.*;
import encomenda.Encomenda;
import java.util.List;
import central.Central;


public class Principal{
    public static void main(String [] args) {


        prova.central.Central central = new ArrayList();
        Remetente remetente1 = new Remetente("João", "(11)9999-9999");
        System.out.println(remetente1.getNome() + "| contato: " + remetente1.getTelefone());
        Remetente remetente2 = new Remetente("Maria", "(99)1111-1111");
        System.out.println(remetente2.getNome() + "| contato: " + remetente2.getTelefone());

        Encomenda encomenda1 = new Encomenda("Fardo", 20.5, remetente1);
        System.out.println(encomenda1.getDescricao() + encomenda1.getPeso() + "Kg. Enviado por " + remetente1.getNome());
        Encomenda encomenda2 = new Encomenda("Sacola", 2.5, remetente2);
        System.out.println(encomenda2.getDescricao() + encomenda2.getPeso() + "Kg. Enviado por " + remetente2.getNome());


        Envio envio1 = new Economico(null, 100, encomenda1).add(central);
        Envio envio2 = new Expresso(null, 20, encomenda2, 3).add(central);
        Envio envio3 = new Internacional(null, 35, encomenda1).add(central);
        Envio envio4 = new Economico(null, -1, encomenda1).add(central);


        System.out.println(central.getEnvios().getPrecoBase());

    }

    public double faturamentoTotal() { 
    } 


    
}