package org.spielhagen;
/**

 Die Main-Klasse ist die Hauptklasse des Programms und enthält den Einstiegspunkt für die Ausführung.
 In der main-Methode werden verschiedene Medien abgespielt, indem Objekte der Klassen MusicPlayer und VideoPlayer
 erstellt und an den MediaController übergeben werden.
 Die MediaController-Klasse ist für die Steuerung der Medienwiedergabe zuständig und enthält die play()-Methode,
 die ein Playable-Objekt als Parameter akzeptiert und die play()-Methode des übergebenen Objekts aufruft.
 Das Playable-Interface definiert die play()-Methode, die von den implementierenden Klassen (MusicPlayer und VideoPlayer)
 überschrieben werden muss. Die MusicPlayer- und VideoPlayer-Klassen implementieren das Playable-Interface und
 definieren das spezifische Verhalten für das Abspielen von Musik bzw. Videos.

 */

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