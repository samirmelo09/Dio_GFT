import java.time.OffsetDateTime;
public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear(); //um objeto para trabalhar com data e hora, com o retorno do now e chama-se o get.Year par apegar apenas o ano.

    public Person(String name){
        this.name = name;
        this.age = 1;
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void incAge(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();

    }






}
