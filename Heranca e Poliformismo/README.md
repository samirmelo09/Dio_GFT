🧑‍💼 Sistema de Funcionários – Employee, Manager e Salesman

🎯 Objetivo do Projeto
Este projeto tem como objetivo demonstrar o uso de Herança, Classes Abstratas, Classes Seladas (sealed) e Encapsulamento em Java.
Ele simula um sistema de funcionários de uma empresa, com diferentes papéis (Manager e Salesman), herdando atributos e comportamentos da classe base Employee.

📚 Conceitos Envolvidos
- Abstração → a classe Employee representa o conceito genérico de um funcionário.
- Encapsulamento → todos os atributos são privados e acessados apenas por meio de métodos get e set.
- Herança → Manager e Salesman herdam de Employee.
- Sealed Classes (Java 17+) → Employee é sealed, restringindo quem pode herdar dela (Manager e Salesman).
- Polimorfismo → permite que diferentes tipos de funcionários (Manager ou Salesman) sejam tratados como Employee.

📜 Código:

📌 Classe Main.java

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Joao");
        manager.setLogin("joao");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}

📌 Classe Employee.java

public sealed abstract class Employee permits Manager, Salesman {

    private String code;
    private String name;
    private String address;
    private int age;
    private double salary;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

📌 Classe Manager.java

public non-sealed class Manager extends Employee {

    private String login;
    private String password;
    private double comission;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }
    public void setComission(double comission) {
        this.comission = comission;
    }
}

📌 Classe Salesman.java
public non-sealed class Salesman extends Employee {

    private double percentPersold;

    public double getPercentPersold() {
        return percentPersold;
    }
    public void setPercentPersold(double percentPersold) {
        this.percentPersold = percentPersold;
    }
}


📖 Explicação Linha por Linha (resumida)
- Employee
sealed abstract class Employee permits Manager, Salesman → define uma classe abstrata que só pode ser herdada por Manager e Salesman.

- Atributos: code, name, address, age, salary.

- Métodos get e set controlam o acesso (encapsulamento).

- Manager
Herda de Employee.

- Atributos próprios: login, password, comission.

- Permite autenticação e controle de comissões.

- Salesman
Herda de Employee.

- Atributo próprio: percentPersold, que representa a comissão percentual sobre as vendas.

- Main
Cria um objeto Manager.

- Define os valores usando setName, setLogin e setPassword.

- Exibe os dados com System.out.println().

▶️ Exemplo de Saída
Joao
joao
123456

📌 Esse projeto é um ótimo exemplo para estudar Programação Orientada a Objetos (POO) em Java com Herança, Encapsulamento e Sealed Classes.






