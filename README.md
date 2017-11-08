# Padrão de Projeto Observer
Observer é um padrão usado quando há um relacionamento um para muitos entre objetos.
Assim quando um objecto é modificado, o objeto dependente dele é notificado automaticamente.
Um exemplo é como se fosse uma assinatura de jornal e revistas, onde temos uma editora que publica as edições, e pessoas que assinam os jornais dessa editora e sempre recebem as novas edições assim que elas são publicadas. Enquanto a pessoa é assinante ela continua recebendo as edições na sua casa. Se a pessoa cancelar a assinatura do jornal, ela para de receber as edições.


## Implementação
A implementação padrão seguiria o fluxo de ter um `Observador`, um  `Subject`, e as classes dependentes que receberão as notificações do assunto observado.

Podemos resumir a esse diagrama: 

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/500px-Observer.svg.png" width="400">

A classe `Subject` terá uma coleção de observadores em que pode ser atribuido ou removido. Será a classe que notificará todas as outras.
A classe `Observer` guardaria apenas o método abstrato de notificação o qual seria extendido pela classe `ConcreteObserverA` e `ConcreteObserverB` que terá a ação que será notificada através da sobreescrita de `notify()`.

Nosso projeto implementamos um exemplo de uma fuga de um carro roubado com uma policia atrás.
Sempre que o carro roubado andar para alguma direção, o carro da policia seguirá ele.
