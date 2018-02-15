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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Create a City for the Robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.SOUTH);
           RobotSE steven = new RobotSE(kw, 0, 1, Direction.SOUTH);
           
        // create walls to divide cars
        new Wall(kw,1,1, Direction.SOUTH);
        new Wall(kw,0,1, Direction.WEST);
        new Wall(kw,1,1, Direction.WEST);

      
        
         // mopve karel to end placemnet
         karel.move(2); //
         karel.turnLeft();
         karel.move(1); //
          
          // mopve steven to end placemnet
          steven.move();                                                                                 
          steven.turnLeft();
          steven.move();    
          steven.turnRight();
          steven.move();  
          steven.turnRight();
          steven.move();
}
}