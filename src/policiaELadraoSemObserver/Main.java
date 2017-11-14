package policiaELadraoSemObserver;


public class Main {

    public static void main(String[] args) {

        Policia viatura1 = new Policia(200);
        Policia viatura2 = new Policia(501);
        Policia viatura3 = new Policia(300);
        Policia viatura4 = new Policia(142);
        Policia viatura5 = new Policia(520);
        Policia viatura6 = new Policia(109);
        Policia viatura7 = new Policia(22);
        CarroRoubado carroRoubado = new CarroRoubado();

        String roubado = carroRoubado.frente();
        carroRoubado.andar(roubado);
        viatura1.rastrear(roubado);
        viatura2.rastrear(roubado);
        viatura3.rastrear(roubado);
        viatura4.rastrear(roubado);
        viatura5.rastrear(roubado);
        viatura6.rastrear(roubado);
        viatura7.rastrear(roubado);


        roubado = carroRoubado.direita();
        carroRoubado.andar(roubado);
        viatura1.rastrear(roubado);
        viatura2.rastrear(roubado);
        viatura3.rastrear(roubado);
        viatura4.rastrear(roubado);
        viatura5.rastrear(roubado);
        viatura6.rastrear(roubado);
        viatura7.rastrear(roubado);

        roubado = carroRoubado.esquerda();
        carroRoubado.andar(roubado);
        viatura1.rastrear(roubado);
        viatura2.rastrear(roubado);
        viatura3.rastrear(roubado);
        viatura4.rastrear(roubado);
        viatura5.rastrear(roubado);
        viatura6.rastrear(roubado);
        viatura7.rastrear(roubado);

        roubado = carroRoubado.esquerda();
        carroRoubado.andar(roubado);
        viatura1.rastrear(roubado);
        viatura2.rastrear(roubado);
        viatura3.rastrear(roubado);
        viatura4.rastrear(roubado);
        viatura5.rastrear(roubado);
        viatura6.rastrear(roubado);
        viatura7.rastrear(roubado);
    }

}
