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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Create a City for the Robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 1, 2, Direction.SOUTH);
        
        // create square of walls with a door
        new Wall(kw,1,1, Direction.NORTH);
        new Wall(kw,1,2, Direction.NORTH);
        new Wall(kw,2,1, Direction.SOUTH);
        new Wall(kw,1,2,Direction.SOUTH);
        new Wall(kw,1,2, Direction.EAST);
        new Wall(kw,1,1, Direction.WEST);
        new Wall(kw,2,1, Direction.WEST);
        
        // add new thing outside house
        new Thing(kw, 2, 2) ;
        
         // mopve karel to newspaper
        karel.turnRight();
        karel.move(); //
        karel.turnLeft();
        karel.move(); //
      karel.turnLeft();
       karel.move(); //
       
       karel.pickThing();
       //move karel back to bed
   karel.turnLeft();
    karel.turnLeft();
     karel.move(); //
     karel.turnRight();
      karel.move(); //
      karel.turnRight();
      karel.move(); //
       karel.turnRight();
    }
        // TODO code application logic here
    }

