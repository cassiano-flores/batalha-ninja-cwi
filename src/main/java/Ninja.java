public class Ninja {

    private String nome;
    private int chakra = 100;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu) {
        this.nome = nome;
        this.jutsu = jutsu;
    }

    public void atacar(Ninja ninjaOponente){
        ninjaOponente.receberGolpe(jutsu.getDano());
        chakra = chakra - jutsu.getChakra();
    }

    public void receberGolpe(int dano){
        chakra = chakra - dano;
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }
}
