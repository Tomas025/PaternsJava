public abstract class ParteDoCarro {
    protected String nome;
    protected double peso;
  
    abstract double calcularPesoTotal();
    abstract void add(ParteDoCarro parte);
    // abstract void remove();
    abstract void print(ParteDoCarro parte, double pesoParcial);
  }