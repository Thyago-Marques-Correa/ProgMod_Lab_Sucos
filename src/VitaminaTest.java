import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VitaminaTest {

    private Vitamina vitamina;

    @BeforeEach
    public void setUp() {
        vitamina = new Vitamina(EFruta.MORANGO);
    }

    @Test
    public void adicionaAteTresFrutas() {
        vitamina.adicionar(EFruta.MANGA);
        assertEquals(3, vitamina.adicionar(EFruta.LARANJA));
    }

    @Test
    public void naoAdicionaQuartaFruta() {
        vitamina.adicionar(EFruta.MANGA);
        vitamina.adicionar(EFruta.LARANJA);
        assertEquals(3, vitamina.adicionar(EFruta.CUPUACU));
    }

    @Test
    public void precoPequenaSomaLeite() {
        assertEquals(14.5, vitamina.preco(), 0.01);
    }

    @Test
    public void precoMediaTemAcrescimoDeQuarentaPorCento() {
        vitamina.adicionar(EFruta.LARANJA);
        assertEquals(12.5 * 1.4, vitamina.preco(), 0.01);
    }

    @Test
    public void precoGrandeTemAcrescimoDeSessentaPorCento() {
        vitamina.adicionar(EFruta.LARANJA);
        vitamina.adicionar(EFruta.MANGA);
        assertEquals((9 + 2.5) * 1.6, vitamina.preco(), 0.01);
    }

}
