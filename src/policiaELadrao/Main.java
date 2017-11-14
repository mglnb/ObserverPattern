package policiaELadrao;

public class Main {

    public static void main(String[] args) {
        CarroSubject carroSubject = new CarroSubject();

        Policia viatura1 = new Policia(carroSubject, 200);
        Policia viatura2 = new Policia(carroSubject,501);
        Policia viatura3 = new Policia(carroSubject,300);
        Policia viatura4 = new Policia(carroSubject,142);
        Policia viatura5 = new Policia(carroSubject,520);
        Policia viatura6 = new Policia(carroSubject,109);
        Policia viatura7 = new Policia(carroSubject,22);
        CarroRoubado carroRoubado = new CarroRoubado(carroSubject);

        carroSubject.attach(viatura1);
        carroSubject.attach(viatura2);
        carroSubject.attach(viatura3);
        carroSubject.attach(viatura4);
        carroSubject.attach(viatura5);
        carroSubject.attach(viatura6);
        carroSubject.attach(viatura7);

        carroSubject.setState(carroRoubado, carroRoubado.frente());
        carroSubject.setState(carroRoubado, carroRoubado.esquerda());
        carroSubject.setState(carroRoubado, carroRoubado.direita());
        carroSubject.setState(carroRoubado, carroRoubado.esquerda());
        carroSubject.setState(carroRoubado, carroRoubado.frente());
        carroSubject.setState(carroRoubado, carroRoubado.esquerda());
        carroSubject.setState(carroRoubado, carroRoubado.direita());
        carroSubject.setState(carroRoubado, carroRoubado.esquerda());
        carroSubject.setState(carroRoubado, carroRoubado.frente());

    }

}
