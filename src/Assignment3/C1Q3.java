/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author lafrh7794
 */
public class C1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Create a City for the Robot
       City kw = new City();
       
       //create robot
       RobotSE steven = new RobotSE(kw, 1, 1, Direction.EAST,20);
       
           //counted while loop/ make steven place 5 per row
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                steven.putThing();
                steven.move();
            }
            //return him to start of row
            steven.turnAround();
            steven.move(5);
            steven.turnLeft();
            steven.move(1);
            steven.turnLeft();
           }
        }
    }

