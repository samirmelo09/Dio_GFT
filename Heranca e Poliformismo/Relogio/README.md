⏰ Projeto Relógio (Java)
Este projeto implementa uma hierarquia de classes para representar relógios de diferentes países, aplicando os conceitos de POO (Programação Orientada a Objetos) como herança, encapsulamento, polimorfismo e abstração.

Escreve uma hierarquia de classes para criação de relógios para diferentes lugares do mundo, defina uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) e um método que deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada relógio Americando e outra chamada relógio Brasileiro, lembrando que para o relógio americano não existem as horas de 13 até 24. Defina também na super classe um método que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto, esse método deve receber um relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu para setar as novas informações do relógio.

📌 Estrutura
O projeto possui as seguintes classes:

- Clock (classe abstrata – superclasse)
- BRLClock (relógio brasileiro – 24h)
- USClock (relógio americano – 12h com AM/PM)
- Main (classe de teste/demonstração)

🔹 Classe: Clock
Classe abstrata e selada, define a estrutura básica de um relógio.

Atributos:
- horas (0–23)
- minutos (0–59)
- segundos (0–59)

Métodos:
- getHoras(), setHoras(int h) → controla valores válidos (0–23).
- getMinutos(), setMinutos(int m) → controla valores válidos (0–59).
- getSegundos(), setSegundos(int s) → controla valores válidos (0–59).
- getTime() → retorna a hora formatada no padrão HH:MM:SS.
- convert(Clock clock) (abstrato) → método que deve ser implementado pelas subclasses para converter entre tipos de relógios.
==============================================================================================================================
🔹 Classe: BRLClock
Representa o relógio brasileiro no formato de 24 horas.

Funcionalidades
- Herda de Clock.

Implementa convert(Clock clock) para:
- Converter de um USClock → ajusta AM/PM para 24h.
- Converter de outro BRLClock → copia diretamente valores de hora, minuto e segundo.

exemplo:
Clock brl = new BRLClock();
brl.setHoras(15);
brl.setMinutos(30);
brl.setSegundos(45);

System.out.println(brl.getTime()); // 15:30:45
=============================================================================================================================
🔹 Classe USClock
Representa o relógio americano no formato de 12 horas com indicador AM/PM.

Atributos adicionais
periodIndicator → indica AM ou PM.

Funcionalidades:
- Converte automaticamente horas de 24h para 12h.
- Sobrescreve getTime() para incluir o indicador AM/PM.
- Implementa convert(Clock clock) para:
- Converter de um BRLClock → ajusta para 12h com AM/PM.
- Converter de outro USClock → copia valores e período.

exemplo:
Clock us = new USClock();
us.setHoras(15); // automaticamente vira 03 PM
us.setMinutos(30);
us.setSegundos(45);

System.out.println(us.getTime()); // 03:30:45 PM
======================================================================================================
🔹 Classe Main
Demonstra o funcionamento dos relógios e das conversões:

código:

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHoras(15);
        brlClock.setMinutos(30);
        brlClock.setSegundos(45);

        System.out.println("BRLClock: " + brlClock.getTime());

        Clock usClock = new USClock().convert(brlClock);
        System.out.println("USClock: " + usClock.getTime());

        Clock brlFromUs = new BRLClock().convert(usClock);
        System.out.println("BRLClock convertido de US: " + brlFromUs.getTime());
    }
}
========================================================================================
Saída esperada:

BRLClock: 15:30:45
USClock: 03:30:45 PM
BRLClock convertido de US: 15:30:45

🛠️ Conceitos de POO aplicados
- Encapsulamento → atributos privados com getters/setters e validação.
- Herança → BRLClock e USClock estendem Clock.
- Abstração → Clock define a estrutura genérica de um relógio, sem implementação concreta.
- Polimorfismo → convert(Clock clock) é implementado de forma diferente em cada subclasse.

🚀 Como rodar
1. Compile todas as classes:
javac Main.java Clock.java BRLClock.java USClock.java
2. Execute o programa:
java Main

