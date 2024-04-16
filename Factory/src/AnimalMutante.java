public class AnimalMutante extends Inimigo{

    public AnimalMutante(String nome) {
        this.nome = nome;
    }

    @Override
    public void aparecer() {
        System.out.println(this.nome + " aparece");
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " ataca: mordida toxica!");
    }
    
}
