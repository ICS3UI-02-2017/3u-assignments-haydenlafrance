/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    // Create a City for the Robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 3, 0, Direction.EAST);
        
        // create mountain of walls
        new Wall(kw,1,3, Direction.NORTH);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,1,3, Direction.WEST);
        new Wall(kw,2,3, Direction.WEST);
        new Wall(kw,3,2, Direction.WEST);
        new Wall(kw,1,3, Direction.EAST);
        new Wall(kw,2,4, Direction.EAST);
        new Wall(kw,3,4, Direction.EAST);
        
        // add new thing outside house
        new Thing(kw, 2, 2) ;
        
         // mopve karel to over moutain
          karel.move(); //
         karel.turnLeft();
          karel.move(); //
             karel.turnRight();
           karel.move(); //
           karel.pickThing();
          karel.turnLeft();
              karel.move(2); //
            karel.turnRight();
             karel.move(1); //
             karel.putThing();
              karel.move(1); //
            karel.turnRight();
            karel.move(); //
       karel.turnLeft();
            karel.move(); //
       karel.turnRight();
     karel.move(2); //
  karel.turnLeft();
    }
}
