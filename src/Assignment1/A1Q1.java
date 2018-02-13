/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author lamon
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Create a City for the Robot
        City kw = new City();
        
        // put a robot in KW
        RobotSE karel = new RobotSE(kw, 0, 2, Direction.WEST);
        
        // create square of walls
        new Wall(kw,1,1, Direction.NORTH);
        new Wall(kw,1,2, Direction.NORTH);
        new Wall(kw,2,1, Direction.SOUTH);
        new Wall(kw,2,2, Direction.SOUTH);
        new Wall(kw,1,2, Direction.EAST);
        new Wall(kw,2,2, Direction.EAST);
        new Wall(kw,1,1, Direction.WEST);
        new Wall(kw,2,1, Direction.WEST);
        
        // move the robot forward 2 space
        karel.move(2); //
        // turn the robot to the left
        karel.turnLeft();
           // move the robot forward 3 space
        karel.move(3); //
           // turn the robot to the left
        karel.turnLeft();
              // move the robot forward 3 space
        karel.move(3); //
          // turn the robot to the left
        karel.turnLeft();
              // move the robot forward 3 space
        karel.move(3); //
          // turn the robot to the left
        karel.turnLeft();
              // move the robot forward 1 space
        karel.move(); //
  
    }
    
}
