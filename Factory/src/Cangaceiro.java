public class Cangaceiro extends Inimigo {
    
    public Cangaceiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void aparecer() {
        System.out.println("Cangaceiro " + this.nome + " aparece!");
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " ataca: tiro de párabelo!");
    }
}