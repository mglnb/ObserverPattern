package policiaELadraoSemObserver;


import policiaELadrao.util.Util;

public class CarroRoubado implements Carro {

    public CarroRoubado() {
    }

    @Override
    public String frente() {
        return "frente";
    }

    @Override
    public String direita() {
        return "direita";

    }

    @Override
    public String esquerda() {
        return "esquerda";
    }

    public void andar(String string) {
        Util.delay(1000);
        switch (string) {
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

}
