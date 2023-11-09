package org.spielhagen;
/**

 Die MusicPlayer-Klasse ist eine konkrete Implementierung des Playable-Interfaces und definiert das Abspielen von Musik.
 Die play()-Methode gibt "Spiele ein Lied ab" auf der Konsole aus.

 */
public class MusicPlayer implements Playable {
    @Override
    public void play() {
       System.out.println("Spiele ein Lied ab");
    }
}
