package policiaELadrao;

import policiaELadrao.util.Util;

public class Policia extends CarroObserver implements Carro {
    private int viatura;

    public Policia(CarroSubject carro, int viatura) {
        super(carro);
        this.viatura = viatura;
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
        Util.delay(300);
        switch (carros) {
            case "frente":
                System.out.println("Viatura " + viatura + " andou para frente!");
                break;
            case "direita":
                System.out.println("Viatura " + viatura + " dobrou para direita!");
                break;
            default:
                System.out.println("Viatura " + viatura + " dobrou para esquerda!");
                break;
        }
    }

}
