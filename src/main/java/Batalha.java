public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja){

        if (primeiroNinja.getNome().equals("Itachi") || segundoNinja.getNome().equals("Itachi")){
            if (primeiroNinja.getNome().equals("Itachi")){
                return primeiroNinja;
            }
            else {
                return segundoNinja;
            }
        }
        else {
            for (int i = 0; i < 3; i++) {
                primeiroNinja.atacar(segundoNinja);
                segundoNinja.atacar(primeiroNinja);
            }

            if (segundoNinja.getChakra() > primeiroNinja.getChakra()) {
                return segundoNinja;
            } else {
                return primeiroNinja;
            }
        }
    }
}
