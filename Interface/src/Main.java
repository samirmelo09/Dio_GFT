public class Main {

    public static void main(String[] args) {
        Computador musicPlayer = new Computador();
        runMusic(musicPlayer);
        runVideo(musicPlayer);

    }
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

}