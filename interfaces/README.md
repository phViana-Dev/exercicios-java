# Interfaces em Java

As interfaces em Java são uma poderosa funcionalidade que permite definir um conjunto de métodos que uma classe deve implementar. Elas são usadas para definir um contrato entre diferentes partes do código, garantindo que as classes que a implementam forneçam a implementação dos métodos definidos na interface.

## O que são Interfaces?

Uma interface em Java é uma coleção de métodos abstratos (métodos sem implementação) e constantes (variáveis ​​estáticas e finais). Ela define um conjunto de operações que uma classe deve implementar, mas não fornece nenhuma implementação concreta para esses métodos. Em vez disso, as classes que implementam a interface devem fornecer sua própria implementação para os métodos definidos na interface.

## Por que Usar Interfaces?

Interfaces são uma parte fundamental da programação orientada a objetos em Java e oferecem vários benefícios:

- **Abstração**: Permitem que você defina um contrato abstrato para um conjunto de operações, sem se preocupar com a implementação concreta.
- **Reusabilidade**: Facilitam a reutilização de código, permitindo que várias classes implementem a mesma interface e forneçam sua própria implementação para os métodos definidos nela.
- **Polimorfismo**: Permitem o polimorfismo, onde uma referência de interface pode se referir a objetos de diferentes classes que implementam essa interface.

## Como Usar Interfaces em Java

Para criar uma interface em Java, você usa a palavra-chave `interface` seguida pelo nome da interface e uma lista de métodos abstratos que a interface deve definir. Aqui está um exemplo simples:

```java
public interface Carro {
    void ligar();
    void desligar();
    void acelerar();
    void frear();
}
