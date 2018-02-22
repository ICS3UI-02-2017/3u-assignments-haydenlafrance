/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class B1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE steven = new RobotSE(kw, 3, 0, Direction.EAST);

        //create hurdle track
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);

        //create ending line
        new Thing(kw, 3, 9);

        //move steven over hurdles to finish line
        steven.move();
        while (!steven.canPickThing()) {
            if (steven.frontIsClear()) {
                steven.move();
            } else {
                steven.turnLeft();
                steven.move();
                steven.turnRight();
                steven.move();
                steven.turnRight();
                steven.move();
                steven.turnLeft();

            }

        }

    }
}
