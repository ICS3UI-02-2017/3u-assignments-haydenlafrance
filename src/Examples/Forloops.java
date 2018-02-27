/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author lafrh7794
 */
public class Forloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make city named kw
        City kw = new City();
        
        //Make robot
       RobotSE steven = new RobotSE(kw, 1, 1, Direction.EAST);
        
        //counted while loop
        int numberOfMoves = 5 ; 
        //if there is still moves to do so
        while (numberOfMoves > 0){
            steven.move();
            numberOfMoves = numberOfMoves - 1;
        }
        steven.turnAround();
        
        //counting the other way
        numberOfMoves = 0;
        while(numberOfMoves <5){
            steven.move();
            numberOfMoves = numberOfMoves +1;
        }
        steven.turnAround();
        //use a for loop to move]
        for(int x = 0 ; x<5; x++){
        steven.move();
            
        } 
    }
}
