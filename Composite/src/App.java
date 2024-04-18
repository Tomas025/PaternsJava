public class App {
    public static void main(String[] args) throws Exception {
        ParteDoCarro carroceria = new Carro("Carroceria");
        carroceria.add(new Parte("Para-lamas", 50));
        carroceria.add(new Parte("Porta", 130));
        carroceria.add(new Parte("Painéis", 100));
        carroceria.add(new Parte("Porta-malas", 190));
        carroceria.add(new Parte("Capô", 130));
        
        ParteDoCarro tremDeForca = new Carro("Trem de força");
        tremDeForca.add(new Parte("Motor", 500));
        tremDeForca.add(new Parte("Transmissão", 100));
        tremDeForca.add(new Parte("Diferencial", 200));
        tremDeForca.add(new Parte("Rodas", 200));
        
        ParteDoCarro chassi = new Carro("Chassi");
        chassi.add(tremDeForca);
        chassi.add(new Parte("Suspensão", 300));
        
        ParteDoCarro carro = new Carro("Carro");
        carro.add(carroceria);
        carro.add(chassi);
        

        System.out.println("Peso total do carro: " + carro.calcularPesoTotal()); 
    }
}
