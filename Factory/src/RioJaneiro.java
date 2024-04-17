public class RioJaneiro implements Regiao{

    @Override
    public Inimigo criarInimigo() {
        Inimigo inimigo = new Criminoso("Zé Pequeno");
        inimigo.aparecer();
        return inimigo;
    }
    
}
