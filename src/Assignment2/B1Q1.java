/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author lafrh7794
 */
public class B1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();

        // create Robot steven
        RobotSE steven = new RobotSE(kw, 1, 1, Direction.EAST);

        //create 10 things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        //make steven pick up 7 things but leave 3
        steven.move();
        while (steven.frontIsClear()) {
            if (steven.canPickThing()) {
                if (steven.countThingsInBackpack() <= 6) {
                    steven.pickThing();
                }



                //when front is clear
                steven.move();
            }
        }
    }
}
