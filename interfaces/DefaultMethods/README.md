# Programa de Empréstimo

## Descrição
Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. Informar o valor a ser pago depois de decorrido o prazo do empréstimo, conforme regras de juros em cada país.

## Sobre Default Methods em Java

Em Java, a partir do Java 8, foi introduzido o conceito de métodos padrão (default methods) em interfaces. Esses métodos permitem que você adicione novos comportamentos a interfaces existentes sem quebrar a compatibilidade com as implementações existentes dessas interfaces.

### Por que usar Default Methods?

- **Compatibilidade com Versões Anteriores**: Permite adicionar novos métodos a interfaces sem forçar todas as classes que implementam a interface a implementar o novo método.

- **Evolução de Bibliotecas e APIs**: Facilita a evolução de bibliotecas e APIs, já que novos métodos podem ser adicionados a interfaces sem perturbar os clientes existentes.

### Quando usar Default Methods?

- **Quando uma Nova Funcionalidade é Introduzida**: Use métodos padrão quando você precisar adicionar uma nova funcionalidade a uma interface existente sem exigir que todas as implementações da interface sejam atualizadas.

- **Quando a Intenção é Fornecer uma Implementação Padrão**: Use métodos padrão quando você quiser fornecer uma implementação padrão para um método em uma interface, permitindo que as classes que implementam a interface optem por usá-lo ou substituí-lo.
