package policiaELadraoSemObserver;


import policiaELadrao.util.Util;

public class Policia  implements Carro {
    private int viatura;

    public Policia(int viatura) {
        this.viatura = viatura;
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

    public void rastrear(String string) {
        Util.delay(300);
        switch (string) {
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
