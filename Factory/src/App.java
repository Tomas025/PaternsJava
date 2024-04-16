public class App {
    public static void main(String[] args) {
        
        System.out.println("\n*Na Amazônia*");
        Regiao amazonia = new Amazonia();
        Inimigo cobraMutante = amazonia.criarInimigo();
        cobraMutante.atacar();
        
        System.out.println("\n*No Sertão*");
        Regiao sertao = new Sertao();
        Inimigo cangaceiro = sertao.criarInimigo();
        cangaceiro.atacar();

        System.out.println("\n*No Rio de Janeiro*");
        Regiao rioJaneiro = new RioJaneiro();
        Inimigo carioca = rioJaneiro.criarInimigo();
        carioca.atacar();

    }
}
