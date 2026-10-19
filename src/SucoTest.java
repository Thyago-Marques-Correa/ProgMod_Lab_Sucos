import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SucoTest {

    private Suco suco;

    @BeforeEach
    public void setUp() {
        suco = new Suco(EFruta.LARANJA);
    }

    @Test
    public void adicionaSegundaFruta() {
        assertEquals(2, suco.adicionar(EFruta.MORANGO));
    }

    @Test
    public void naoAdicionaTerceiraFruta() {
        suco.adicionar(EFruta.MORANGO);
        assertEquals(2, suco.adicionar(EFruta.MANGA));
    }

    @Test
    public void segundaFrutaPrecisaSerLaranjaQuandoPrimeiraNaoE() {
        Suco outro = new Suco(EFruta.MORANGO);
        assertEquals(1, outro.adicionar(EFruta.MANGA));
        assertEquals(2, outro.adicionar(EFruta.LARANJA));
    }

    @Test
    public void ignoraFrutaNula() {
        assertEquals(1, suco.adicionar(null));
    }

    @Test
    public void precoComUmaFruta() {
        assertEquals(8d, suco.preco(), 0.01);
    }

    @Test
    public void precoComDuasFrutasEhMedia() {
        suco.adicionar(EFruta.MORANGO);
        assertEquals(10d, suco.preco(), 0.01);
    }

}
