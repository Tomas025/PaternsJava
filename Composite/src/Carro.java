import java.util.ArrayList;
import java.util.List;

public class Carro extends ParteDoCarro{
    public List<ParteDoCarro> partes = new ArrayList<ParteDoCarro>();

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    double calcularPesoTotal() {
        double pesoTotal = this.peso;

        for (ParteDoCarro parte : partes) {
            pesoTotal += parte.calcularPesoTotal();
            parte.print(parte, pesoTotal);
        }

        this.peso = pesoTotal;

        return pesoTotal;
    }

    @Override
    void add(ParteDoCarro parte) {
        partes.add(parte);
    }

    @Override
    void print(ParteDoCarro parte, double pesoParcial) {
        System.out.println("\nO peso da " +  this.nome + " é: " + this.peso + ". Total parcial: " + pesoParcial);
    }

}
