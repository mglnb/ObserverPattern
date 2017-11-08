# Padrão de Projeto Observer
Observer é um padrão usado quando há um relacionamento um para muitos entre objetos.
Assim quando um objecto é modificado, o objeto dependente dele é notificado automaticamente.
Um exemplo é como se fosse uma assinatura de jornal e revistas, onde temos uma editora que publica as edições, e pessoas que assinam os jornais dessa editora e sempre recebem as novas edições assim que elas são publicadas. Enquanto a pessoa é assinante ela continua recebendo as edições na sua casa. Se a pessoa cancelar a assinatura do jornal, ela para de receber as edições.


## Implementação
A implementação padrão seguiria o fluxo de ter um `Observador`, um  `Subject`, e as classes dependentes que receberão as notificações do assunto observado.

Podemos resumir a esse diagrama: 

<p style="text-align:center;">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/500px-Observer.svg.png" width="500">
</p>


A classe `Subject` terá uma coleção de observadores em que pode ser atribuido ou removido. Será a classe que notificará todas as outras.
A classe `Observer` guardaria apenas o método abstrato de notificação o qual seria extendido pela classe `ConcreteObserverA` e `ConcreteObserverB` que terá a ação que será notificada através da sobreescrita de `notify()`.

Nosso projeto implementamos um exemplo de uma fuga de um carro roubado com uma policia atrás.
Sempre que o carro roubado andar para alguma direção, o carro da policia seguirá ele.

Primeiramente, teremos a interface Carro contendo a assinatura dos métodos que serão implementados.

```java

public interface Carro {
    
    public String frente();
    public String direita();
    public String esquerda();
    
}

```

E então a classe abstrata `CarroObserver` onde irá conter o método abstrado update que será obrigatorio a sobreescrita nas classes filhas

```java
public abstract class CarroObserver {

    protected CarroSubject carro;

    public CarroObserver(CarroSubject carro) {
        this.carro = carro;
    }
    /**
     * @params carro seria a ação do carro
     */
    public abstract void update(String carro);
}
```

Após isso, criamos a classe `CarroSubject` que contém um array de observers do tipo `CarroObserver`

```java
import java.util.ArrayList;

public class CarroSubject {
    protected ArrayList<CarroObserver> observers;
    protected Carro carro;

    public CarroSubject() {
        this.observers = new ArrayList<CarroObserver> ();
    }
    /**
     * Atribui o observer
     * @params observer adiciona ao ArrayList uma instancia de CarroObserver
     */
    public void attach(CarroObserver observer){
        observers.add(observer);
    }
    /**
     * Remove o observer
     * @params index indice para remover
     */
    public void detach(int index){
        observers.remove(index);
    }
    
    /**
     * Define o estado da classe
     * Chama o método para notificar todas cadastradas
     */
    public void setState(Carro carro, String args){
        this.carro = carro;
        notifyObservers(args);
    }


    /**
     * Notifica todas classes cadastradas
     * @params args passa a ação do carro
     */
    private void notifyObservers(String args) {
        for(CarroObserver obs : observers){
            obs.update(args);
        }
    }
    
    /**
     * @return carro
     *
     */
    public Carro getState(){
        return carro;
    }
    
}
```


Então temos nossa primeira classe dependente ela terá que implementar a interface `Carro` e extender `CarroObserver` para implementar todos métodos necessários.

```java

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
        delay(1000); // Gera um Thread.sleep
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
}

```
Classe `Policia` referencia ao carro da policia, segue o mesmo padrão do carro roubado.

```java
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

```

E então nossa main 

```java

import static policia.e.ladrao.util.Util.delay;

public class PoliciaELadrao {

    public static void main(String[] args) {
        // Primeiro criamos nosso Subject
        CarroSubject carroSubject = new CarroSubject();

        // Instanciamos o carro da policia e o roubado passando nosso Subject
        Policia policia = new Policia(carroSubject);
        CarroRoubado carroRoubado = new CarroRoubado(carroSubject);

        // Atribuirei um observer para o carro da policia, assim ela receberá notificações sempre que a outra classe for alterada.
        carroSubject.attach(policia);

        // Ações do carro roubado
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

```


