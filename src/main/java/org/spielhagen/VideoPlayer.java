package org.spielhagen;
/**

 Die VideoPlayer-Klasse ist eine konkrete Implementierung des Playable-Interfaces und definiert das Abspielen von Videos.
 Die play()-Methode gibt "Spiele ein Video ab" auf der Konsole aus.

 */
public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Spiele ein Video ab");
    }
}
