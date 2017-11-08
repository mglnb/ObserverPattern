package policia.e.ladrao;

import static policia.e.ladrao.util.Util.delay;

public class Policia extends CarroObserver implements Carro {

    public Policia(CarroSubject carro) {
        super(carro);
    }

    @Override
    public String frente() {
        update("frente");
        return "frente";
    }

    @Override
    public String direita() {
        update("direita");
        return "direita";
    }

    @Override
    public String esquerda() {
        update("esquerda");
        return "esquerda";
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String carros) {
        delay(1000);
        switch (carros) {
            case "frente":
                System.out.println("Carro da Policia andou para frente!");
                break;
            case "direita":
                System.out.println("Carro da Policia dobrou para direita!");
                break;
            default:
                System.out.println("Carro da Policia dobrou para esquerda!");
                break;
        }
    }

}
