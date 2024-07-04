# Desafio de Orientação a Objetos - DIO

## Descrição
O desafio consiste em modelar uma representação do primeiro modelo de iPhone, lançado em 2007, utilizando a linguagem de programação Java. 

Neste projeto, o iPhone é modelado como uma classe que compõe várias funcionalidades essenciais, cada uma representada por suas próprias classes: ReprodutorMusical, AparelhoTelefonico e NavegadorInternet. Cada uma dessas classes possui atributos e métodos próprios, demonstrando encapsulamento. As associações e composições mostram como as diferentes partes do sistema interagem e dependem umas das outras.

Implementar esses conceitos em um diagrama UML ajuda a visualizar e estruturar o código de maneira eficiente, mantendo a organização e a modularidade, fundamentais na POO.

## Modelo UML

```mermaid
classDiagram
    class ReprodutorMusical {
        -musicas: List<String>
        +tocar()
        +pausar()
        +adicionarMusica(String musica)
    }

    class AparelhoTelefonico {
        -numero: String
        +fazerChamada(String numero)
        +encerrarChamada()
    }

    class NavegadorInternet {
        -historico: List<String>
        +navegar(String url)
        +exibirHistorico()
    }

    class iPhone {
        -reprodutorMusical: ReprodutorMusical
        -aparelhoTelefonico: AparelhoTelefonico
        -navegadorInternet: NavegadorInternet
        +ligar()
        +desligar()
    }

    iPhone *-- ReprodutorMusical
    iPhone *-- AparelhoTelefonico
    iPhone *-- NavegadorInternet
```


