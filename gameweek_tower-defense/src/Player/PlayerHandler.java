package Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PlayerHandler implements KeyboardHandler {

    public Keyboard keyboard;

    public Player player;


    public PlayerHandler(Player player) {
        this.player = player;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }
    public void createKeyboardEvents() {
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        /*switch (keyboardEvent.getKey()){
            case


            case


            case


            case
        }
    }
    */
    } @Override
        public void keyReleased(KeyboardEvent keyboardEvent){

        }

    }

