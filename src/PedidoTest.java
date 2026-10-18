import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
    Bebida suco;
    Bebida vitamina;

    @BeforeEach 
    public void setUp(){
        suco = new Suco(EFruta.CUPUACU);
        vitamina = new Vitamina(EFruta.LARANJA);
        pedido = new Pedido();
    }

    @Test 
    public void adicionaBebidaValida(){
        int quantidade  = pedido.adicionar(suco);
        assertEquals(1, quantidade);
    }

    @Test 
    public void naoAdicionaBebidaNula(){
        int quantidade  = pedido.adicionar(null);
        assertEquals(0, quantidade);
    }

    @Test 
    public void calculaPrecoUmaBebida(){
        pedido.adicionar(suco);
        double preco = pedido.preco();

        assertEquals(10d, preco, 0.01);
    }

    @Test 
    public void calculaPrecoDuasBebidas(){
        pedido.adicionar(suco);
        pedido.adicionar(vitamina);
        double preco = pedido.preco();

        assertEquals(20.5d, preco, 0.01);
    }
}
