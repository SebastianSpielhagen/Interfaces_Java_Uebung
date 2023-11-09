package org.spielhagen;


public class Main {

    public static void main(String[] args) {
        MediaController mediaController = new MediaController();

        Playable song = new MusicPlayer();
        mediaController.play(song);

        Playable video = new VideoPlayer();
        mediaController.play(video);

        Playable musicPlayer = new MusicPlayer();
        mediaController.play(musicPlayer);

        Playable videoPlayer = new VideoPlayer();
        mediaController.play(videoPlayer);

    }
}