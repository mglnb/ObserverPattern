package policia.e.ladrao;

import static policia.e.ladrao.util.Util.delay;

public class PoliciaELadrao {

    public static void main(String[] args) {
        CarroSubject carroSubject = new CarroSubject();

        Policia policia = new Policia(carroSubject);
        CarroRoubado carroRoubado = new CarroRoubado(carroSubject);

        carroSubject.add(policia);

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
