/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class B1Q5BONUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE steven = new RobotSE(kw, 0, 0, Direction.EAST);
       
        new Wall(kw, 1, 1, Direction.EAST);
    }
}
