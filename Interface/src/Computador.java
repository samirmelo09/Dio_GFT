public class Computador implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O Computador está tocando música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador está com a música pausada");

    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador parou a música");

    }

    @Override
    public void playVideo() {
        System.out.println("O Computador está reproduzindo o video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador está com o video pausada");

    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador parou o video");

    }
}
