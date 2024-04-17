public class Sertao implements Regiao{

    @Override
    public Inimigo criarInimigo() {
        Inimigo inimigo = new Cangaceiro("Quinta-feira");
        inimigo.aparecer();
        return inimigo;
    }
    
}
