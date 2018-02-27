/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author lafrh7794
 */
public class C1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Create a City for the Robot
       City kw = new City();
       
       //create robot
       RobotSE steven = new RobotSE(kw, 1, 1, Direction.EAST);
       
       //make 10 things to move
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       new Thing(kw,1,2);
       
       steven.move();
       
       //counted while loop
        int numberOfMoves = 10; 
        
       //make stevn pick up 10 things and move them
        while (numberOfMoves > 0){
            numberOfMoves = numberOfMoves - 1;{
            if (steven.canPickThing()){
                steven.pickThing();
                steven.move();
                steven.putThing();
                steven.turnAround();
                steven.move();
                steven.turnAround();
            }
          }
        }
        // move steven over things
        steven.move();
    }
}
