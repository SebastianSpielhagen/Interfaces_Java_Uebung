package org.spielhagen;
/**

 Die MediaController-Klasse ist für die Steuerung der Medienwiedergabe zuständig.
 Die play()-Methode akzeptiert ein Playable-Objekt als Parameter und ruft die play()-Methode des übergebenen Objekts auf.

 */
public class MediaController {
    public void play(Playable media) {
        media.play();
    }
}
