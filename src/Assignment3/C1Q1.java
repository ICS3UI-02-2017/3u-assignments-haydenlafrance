/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class C1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create a City for the Robot
       City kw = new City();
       
       //create robot
       RobotSE steven = new RobotSE(kw, 0, 2, Direction.WEST);
       
       //make walls 
       new Wall(kw,1,1,Direction.WEST);
       new Wall(kw,2,1,Direction.WEST);
       new Wall(kw,1,1,Direction.NORTH);
       new Wall(kw,1,2,Direction.NORTH);
       new Wall(kw,2,2,Direction.SOUTH );
       new Wall(kw,2,1,Direction.SOUTH );
       new Wall(kw,1,2,Direction.EAST);
       new Wall(kw,2,2,Direction.EAST);
       
 
        //counted while loop
        int numberOfMoves = 39; 
        
       //make stevn move 2 times around walls 
        while (numberOfMoves > 0){
            numberOfMoves = numberOfMoves - 1;{
            if (steven.frontIsClear()) {
                steven.move();
                steven.turnLeft();
           
            } else {
                steven.turnRight();
          }
        }
       }
        steven.turnRight();
    }
}
