public sealed abstract class Clock permits BRLClock, USClock {

    private int horas;
    private int minutos;
    private int segundos;

    // Getters e Setters com validação
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 0 || horas > 23) {
            this.horas = 0;
        } else {
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            this.minutos = 0;
        } else {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            this.segundos = 0;
        } else {
            this.segundos = segundos;
        }
    }

    // Método abstrato para conversão
    public abstract Clock convert(Clock clock);

    // Formatação da saída
    private String format(int value){
        return (value < 10 ? "0" : "") + value;
    }

    public String getTime() {
        return format(horas) + ":" + format(minutos) + ":" + format(segundos);
    }
}
