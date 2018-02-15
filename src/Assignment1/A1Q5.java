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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// Create a City for the Robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 3, 3, Direction.EAST);
           RobotSE steven = new RobotSE(kw, 0, 1, Direction.WEST);
           
       //lebel karen and steven
        steven.setLabel("S");
        karel.setLabel("K");
           
        // create house for karel
        new Wall(kw,2,3, Direction.NORTH);
        new Wall(kw,2,3, Direction.WEST);
        new Wall(kw,2,3, Direction.EAST);
        new Wall(kw,3,3, Direction.EAST);
        new Wall(kw,3,3, Direction.SOUTH);
        
        //create Karel's dropped things 
        new Thing(kw, 0,0);
        new Thing(kw, 1,0);
        new Thing(kw, 1,1);
        new Thing(kw, 1,2);
        new Thing(kw, 2,2);
        
     //move steven to end placemnet pick up thinghs as go 
        steven.move();
        steven.pickThing();
        steven.turnLeft();
        steven.move();
        steven.pickThing();
        steven.turnLeft();
        steven.move();
        steven.pickThing();
        
     // mopve karel to end placemnet pick up things as go
       karel.turnLeft();
       karel.turnLeft();
       karel.move(); //
       karel.turnRight();
       karel.move(); //
       karel.pickThing();
       karel.move(); //
       karel.turnLeft();
       karel.pickThing();
            
          
      
    }
}
