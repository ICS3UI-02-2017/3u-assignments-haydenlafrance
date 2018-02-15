/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class Conditionsexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// Create a City for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE demarcus = new RobotSE(kw, 2, 1, Direction.EAST);

        //create wall
        new Wall(kw, 2, 5, Direction.EAST);

        //place a few things
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        //move demarcus
        demarcus.move();        //move until front is not clear 
        while (demarcus.frontIsClear()) {
            if (demarcus.canPickThing()) {
                demarcus.pickThing();
            }
            //when front is clear
            demarcus.move();


        }

        demarcus.turnRight();
        if (demarcus.countThingsInBackpack() == 1) {
            demarcus.move();
        } else if (demarcus.countThingsInBackpack() == 2) {
            demarcus.move(2);
        } else {
            demarcus.turnAround();
        }
    }
}
