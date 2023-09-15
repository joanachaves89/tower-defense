package Game;
import Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private int width = 1280;
    private int height = 720;
    public static final int PADDING = 10;

    Picture picturePlayer = new Picture(((width-37)/2),((height-45)/2),"resources/tower.png");
    public void init(){
        Picture background = new Picture(PADDING,PADDING,"resources/grassBackground.jpg");
        background.draw();
       Player player = new Player( "Batata"); // definir nome
        player.draw();
    }



}
