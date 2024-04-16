public class Criminoso extends Inimigo{
    
    public Criminoso(String nome) {
        this.nome = nome;
    }

    @Override
    public void aparecer() {
        System.out.println("Criminoso " + this.nome + " aparece!");
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " ataca: facada!");
    }
}
