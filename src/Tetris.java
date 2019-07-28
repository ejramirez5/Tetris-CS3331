package serverSS;
import controller.*;
import model.*;
import view.*;
import view.animation.*;


public class Tetris {
    public static void main(String[] args){
//        Operations();
//    }
//    public static void Operations() {
    	Controller Jem = new Controller(); // change this var name
    	Jem.curUi = new TetrisUI(args);
    	Jem.init();

    	(Jem.curUi).addKeyListener(Jem);
    	(Jem.curUi).setFocusable(true);
    	Jem.curUi.requestFocusInWindow();

    	Jem.curUi.run();    			    	
    
    	
//    	Control Jem;
//    	Jem = new Control(args);
//    	Jem.init();
//    	Jem.addKeyListener(Jem);
//    	Jem.setFocusable(true);
//    	Jem.requestFocusInWindow();
//    	Jem.run();
    	
    	
    	
    	
    }
}
