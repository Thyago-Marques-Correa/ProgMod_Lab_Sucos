    import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VitaminaTest {
 

    Vitamina vitamina;

    @BeforeEach
    public void setUp(){
        vitamina = new Vitamina(EFruta.MORANGO);
    } 

    @Test 
    public void adicionarTresFrutas(){
        vitamina.adicionar(EFruta.MORANGO);
        int quantos = vitamina.adicionar(EFruta.MORANGO);

        assertEquals(3, quantos);
    }

    @Test 
    public void precoComUmaFruta(){
        double preco = vitamina.preco();

        assertEquals(14.5, preco, 0.01);
    }

    @Test 
    public void precoComDuasFrutas(){
        vitamina.adicionar(EFruta.LARANJA);
        double preco = vitamina.preco();

        assertEquals(12.5 * 1.4, preco, 0.01);
    }

   
    
}