public class RioJaneiro extends Regiao{

    @Override
    protected Inimigo criarInimigo() {
        Inimigo inimigo = new Criminoso("Zé Pequeno");
        inimigo.aparecer();
        return inimigo;
    }
    
}
