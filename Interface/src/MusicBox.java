public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A caixa de musica está tocando música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está com a música pausada");

    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música parou a música");

    }

}
