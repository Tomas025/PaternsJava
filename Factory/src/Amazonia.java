public class Amazonia implements Regiao {

    @Override
    public Inimigo criarInimigo() {
        Inimigo inimigo = new AnimalMutante("Jararaca-do-norte mutante");
        inimigo.aparecer();
        return inimigo;
    }
   
}
