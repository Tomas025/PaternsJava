public class Sertao extends Regiao{

    @Override
    protected Inimigo criarInimigo() {
        Inimigo inimigo = new Cangaceiro("Quinta-feira");
        inimigo.aparecer();
        return inimigo;
    }
    
}
