package policiaELadrao;

public abstract class CarroObserver {

    protected CarroSubject carro;

    public CarroObserver(CarroSubject carro) {
        this.carro = carro;
    }

    public abstract void update(String carro);

    public abstract void update();

}
