import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    private Pedido pedido;
    private Bebida suco;
    private Bebida vitamina;

    @BeforeEach
    public void setUp() {
        suco = new Suco(EFruta.CUPUACU);
        vitamina = new Vitamina(EFruta.LARANJA);
        pedido = new Pedido();
    }

    @Test
    public void adicionaBebidaValida() {
        assertEquals(1, pedido.adicionar(suco));
    }

    @Test
    public void naoAdicionaBebidaNula() {
        assertEquals(0, pedido.adicionar(null));
    }

    @Test
    public void pedidoVazioNaoTemCusto() {
        assertEquals(0d, pedido.preco(), 0.01);
    }

    @Test
    public void precoComUmaBebida() {
        pedido.adicionar(suco);
        assertEquals(10d, pedido.preco(), 0.01);
    }

    @Test
    public void precoComDuasBebidas() {
        pedido.adicionar(suco);
        pedido.adicionar(vitamina);
        assertEquals(20.5d, pedido.preco(), 0.01);
    }

    @Test
    public void cupomListaItensETotal() {
        pedido.adicionar(suco);
        pedido.adicionar(vitamina);
        String cupom = pedido.toString();
        assertTrue(cupom.startsWith("PEDIDO COM 2 ITENS"));
        assertTrue(cupom.contains("cupuacu"));
        assertTrue(cupom.endsWith("A PAGAR: R$ 20,50") || cupom.endsWith("A PAGAR: R$ 20.50"));
    }

}
