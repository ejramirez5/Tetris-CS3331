import controller.*;
import model.*;
import view.*;
import view.animation.*;

public class Tetris {
    public static void main(String[] args){
//        Operations();
//    }
//    public static void Operations() {
    	Controller Jem = new Controller();
    	Jem.init();
    	Jem.curUi = new TetrisUI(args);
    	(Jem.curUi).addKeyListener(Jem);
    	(Jem.curUi).setFocusable(true);
    	Jem.curUi.requestFocusInWindow();
    	Jem.curUi.run();    			
    	
    	
    }
}
