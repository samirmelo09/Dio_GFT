public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O Smartphone está tocando música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("O Smartphone está com a música pausada");

    }

    @Override
    public void stopMusic() {
        System.out.println("O Smartphone parou a música");

    }

    @Override
    public void playVideo() {
        System.out.println("O Smartphone está reproduzindo o video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("O Smartphone está com o video pausada");

    }

    @Override
    public void stopVideo() {
        System.out.println("O Smartphone parou o video");

    }
}
