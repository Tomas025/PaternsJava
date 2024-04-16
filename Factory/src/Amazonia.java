public class Amazonia extends Regiao {

    @Override
    protected Inimigo criarInimigo() {
        Inimigo inimigo = new AnimalMutante("Jararaca-do-norte mutante");
        inimigo.aparecer();
        return inimigo;
    }
   
}
