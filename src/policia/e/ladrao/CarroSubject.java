package policia.e.ladrao;

import java.util.ArrayList;

public class CarroSubject {
    protected ArrayList<CarroObserver> observers;
    protected Carro carro;

    public CarroSubject() {
        this.observers = new ArrayList<CarroObserver> ();
    }
    
    public void add(CarroObserver observer){
        observers.attach(observer);
    }
    
    public void remove(int index){
        observers.detach(index);
    }
    
    public void setState(Carro carro, String args){
        this.carro = carro;
        notifyObservers(args);
    }

    private void notifyObservers(String args) {
        for(CarroObserver obs : observers){
            obs.update(args);
        }
    }
    
    public Carro getState(){
        return carro;
    }
    
}
