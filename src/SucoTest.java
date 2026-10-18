import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SucoTest {
    Suco suco;

    @BeforeEach
    public void setUp(){
        suco = new Suco(EFruta.LARANJA);
    } 

    @Test 
    public void adicionarSegundaFruta(){
        int quantos = suco.adicionar(EFruta.MORANGO);

        assertEquals(2, quantos);
    }

    @Test 
    public void naoAdicionarTerceiraFruta(){
        suco.adicionar(EFruta.MORANGO);
        int quantos = suco.adicionar(EFruta.MORANGO);

        assertEquals(2, quantos);
    }

    @Test 
    public void segundaSoPodeSerLaranja(){
        Suco outroSuco = new Suco(EFruta.MORANGO);

        int quantos = outroSuco.adicionar(EFruta.MORANGO);

        assertEquals(1, quantos);
    }
    
}
