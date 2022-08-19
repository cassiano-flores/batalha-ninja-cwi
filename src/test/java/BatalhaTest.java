import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        //arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5, 7);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5, 8);
        Ninja segundoNinja = new Ninja("Sasuke", jutsuSegundoNinja);

        Batalha batalha = new Batalha();

        //act
        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        //assert
        Assert.assertSame(segundoNinja, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar(){
        //arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(4, 4);
        Ninja primeiroNinja = new Ninja("Sasuke", jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(2, 2);
        Ninja segundoNinja = new Ninja("Naruto", jutsuSegundoNinja);

        primeiroNinja.atacar(segundoNinja);
        int jutsuRestanteEsperado = 96;   //100 - 4 = 96

        //act
        int jutsuRestanteObtido = primeiroNinja.getChakra();

        //assert
        Assert.assertEquals(jutsuRestanteEsperado, jutsuRestanteObtido);

    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        //arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5, 1);
        Ninja primeiroNinja = new Ninja("Itachi", jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5, 5);
        Ninja segundoNinja = new Ninja("Naruto", jutsuSegundoNinja);

        Batalha batalha = new Batalha();

        //act
        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        //assert
        Assert.assertSame(primeiroNinja, ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        //arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5, 5);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5, 1);
        Ninja segundoNinja = new Ninja("Itachi", jutsuSegundoNinja);

        Batalha batalha = new Batalha();

        //act
        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        //assert
        Assert.assertSame(segundoNinja, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        //arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(3, 3);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(3, 3);
        Ninja segundoNinja = new Ninja("Sasuke", jutsuSegundoNinja);

        Batalha batalha = new Batalha();

        //act
        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        //assert
        Assert.assertSame(primeiroNinja, ninjaVencedor);
    }
}
