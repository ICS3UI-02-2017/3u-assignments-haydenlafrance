/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author lafrh7794
 */
public class C1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //make city for my robot
      City kw = new City();
      
      //make robot named steven
      RobotSE steven= new RobotSE(kw, 3 ,3, Direction.SOUTH);
      
      //make 4 blocks of walls
      new Wall(kw,1,1,Direction.WEST);
      new Wall(kw,2,1,Direction.WEST);
      new Wall(kw,4,1,Direction.WEST);
      new Wall(kw,5,1,Direction.WEST);
      new Wall(kw,1,4,Direction.WEST);
      new Wall(kw,2,4,Direction.WEST);
      new Wall(kw,4,4,Direction.WEST);
      new Wall(kw,5,4,Direction.WEST);
      new Wall(kw,5,5,Direction.EAST);
      new Wall(kw,4,5,Direction.EAST);
      new Wall(kw,1,2,Direction.EAST);
      new Wall(kw,2,2,Direction.EAST);
      new Wall(kw,4,2,Direction.EAST);
      new Wall(kw,5,2,Direction.EAST);
      new Wall(kw,2,5,Direction.EAST);
      new Wall(kw,1,5,Direction.EAST);
      new Wall(kw,1,1,Direction.NORTH);
      new Wall(kw,1,2,Direction.NORTH);
      new Wall(kw,1,4,Direction.NORTH);
      new Wall(kw,1,5,Direction.NORTH);
      new Wall(kw,4,2,Direction.NORTH);
      new Wall(kw,4,1,Direction.NORTH);
      new Wall(kw,4,4,Direction.NORTH);
      new Wall(kw,4,5,Direction.NORTH);
      new Wall(kw,2,1,Direction.SOUTH);
      new Wall(kw,2,2,Direction.SOUTH);
      new Wall(kw,2,4,Direction.SOUTH);
      new Wall(kw,2,5,Direction.SOUTH);
      new Wall(kw,5,4,Direction.SOUTH);
      new Wall(kw,5,5,Direction.SOUTH);
      new Wall(kw,5,1,Direction.SOUTH);
      new Wall(kw,5,2,Direction.SOUTH);
      
      //move steven around all 4 blocks
      for (int i = 0; i < 4; i++) {
         for (int x = 0; x <3; x++) {
          steven.move(3);
          steven.turnLeft();
         }
         steven.move(3);
      }
    }
}
