/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author lafrh7794
 */
public class B1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE steven = new RobotSE(kw, 7, 8, Direction.EAST);

        do {
            steven.turnRight();
        } while (!steven.isFacingNorth());
        {
        }
        do {
            steven.move();}
        
            while (steven.getAvenue() != 0);
            {
            }


            do
            {
            steven.turnLeft();
             steven.move();
            } 
            while (steven.getStreet() != 0);{
                
               }
            }
        }
    
