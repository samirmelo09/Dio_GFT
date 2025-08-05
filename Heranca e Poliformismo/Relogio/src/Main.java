public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHoras(15);
        brlClock.setMinutos(30);
        brlClock.setSegundos(45);

        System.out.println("BRLClock: " + brlClock.getTime());

        Clock usClock = new USClock().convert(brlClock);
        System.out.println("USClock: " + usClock.getTime());

        // Convertendo de volta
        Clock brlFromUs = new BRLClock().convert(usClock);
        System.out.println("BRLClock convertido de US: " + brlFromUs.getTime());
    }
}

