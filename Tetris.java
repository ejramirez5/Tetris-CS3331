
/*****************************************
 * CSS3331: Summer 2019
 * HW 1: Due Sunday June, 16
 * Author: Emilio Ramirez
 *****************************************/
public class Tetris{
    private Board sampleBoard;

    public Tetris(){

    }
    public static void main(String[] args) 
	{
        Tetris gameOne = new Tetris();
        gameOne.sampleBoard = new Board();

        char[] tetrominoList = { 'I', 'J', 'L', 'O', 'S', 'Z', 'T' };


        // following code prints every tetromino in: default position, after two left rotations, and after one right roation 
        for(int i = 0; i < tetrominoList.length ; i++){

        
            gameOne.sampleBoard.currentTetromino = new Tetromino(tetrominoList[i]);
            gameOne.sampleBoard.placeTetromino();         
            System.out.println("Showing Tetromino is Default position:");
            gameOne.sampleBoard.printBoard();
            gameOne.sampleBoard.removeTetromino();
            gameOne.sampleBoard.currentTetromino.rotateLeft();
            gameOne.sampleBoard.currentTetromino.rotateLeft();
            gameOne.sampleBoard.placeTetromino();
            System.out.println("Showing Tetromino After two left rotations:");
            gameOne.sampleBoard.printBoard();
            gameOne.sampleBoard.removeTetromino();                
            gameOne.sampleBoard.currentTetromino.rotateRight();
            gameOne.sampleBoard.placeTetromino();
            System.out.println("Showing Tetromino After a right rotation:");
            gameOne.sampleBoard.printBoard();
            gameOne.sampleBoard.removeTetromino();       
        }

        // Following Code shows what happens when attempting to place a tetromino on an invalid position
        System.out.println("Attempting to place Tetromino Piece over Tetromino shown Below");
        gameOne.sampleBoard.placeTetromino();
        gameOne.sampleBoard.printBoard();
        gameOne.sampleBoard.placeTetromino();         
    } 
}