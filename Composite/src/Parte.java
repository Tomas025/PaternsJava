public class Parte extends ParteDoCarro {

    public Parte(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    double calcularPesoTotal() {
        return this.peso;
    }

    @Override
    void add(ParteDoCarro parte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    void print(ParteDoCarro parte, double pesoParcial) {
        System.out.println("\nSomando agora o peso de " +  this.nome + ": " + this.peso + ". Total parcial: " + pesoParcial);
    }
    
}