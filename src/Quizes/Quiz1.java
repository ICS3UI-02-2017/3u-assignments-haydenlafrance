/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // create city KW for robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE steven= new RobotSE(kw, 4, 0, Direction.EAST);
        
        // Create staircase for robots to climb
          new Wall(kw,4,2, Direction.WEST);
          new Wall(kw,3,3, Direction.WEST);
          new Wall(kw,2,4, Direction.WEST);
          new Wall(kw,4,7, Direction.EAST);
          new Wall(kw,3,6, Direction.EAST);
          new Wall(kw,2,5, Direction.EAST);
          new Wall(kw,4,7, Direction.NORTH);
          new Wall(kw,3,6, Direction.NORTH);
          new Wall(kw,2,5, Direction.NORTH);
          new Wall(kw,4,2, Direction.NORTH);
          new Wall(kw,3,3, Direction.NORTH);
          new Wall(kw,2,4, Direction.NORTH);
          
          //Make lights for steven to pick up
          new Thing(kw,4,1);
          new Thing(kw,3,2);
          new Thing(kw,2,3);
          new Thing(kw,1,4);
          
          //Move steven to pick up lights and place them on other side of stairs 
          steven.move();
          steven.pickThing();
          steven.turnLeft();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.pickThing();
          steven.turnLeft();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.pickThing();
          steven.turnLeft();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.pickThing();
          steven.move();
          steven.putThing();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.putThing();
          steven.turnLeft();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.putThing();
          steven.turnLeft();
          steven.move();
          steven.turnRight();
          steven.move();
          steven.putThing();
          steven.turnLeft();
          steven.move(); 
    }
}
