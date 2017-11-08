package policia.e.ladrao;

import static policia.e.ladrao.util.Util.delay;

public class CarroRoubado extends CarroObserver implements Carro {

    public CarroRoubado(CarroSubject carro) {
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
    public void update(String carros) {
        delay(1000);
        switch (carros) {
            case "frente":
                System.out.println("Carro roubado andou para frente!");
                break;
            case "direita":
                System.out.println("Carro roubado dobrou para direita!");
                break;
            default:
                System.out.println("Carro roubado dobrou para esquerda!");
                break;
        }
    }

    @Override
    public void update() {
    }

}
