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
public class B1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE steven = new RobotSE(kw, 0, 0, Direction.EAST);

        //build castle 
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);

        //walk stevn around castle
        steven.move();
        while (!steven.canPickThing()) {
            if (steven.frontIsClear()) {
                steven.move();
                steven.turnRight();
            } else {
                steven.turnLeft();


            }
        }
    }
}
