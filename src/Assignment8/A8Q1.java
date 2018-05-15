package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author lafrh7794
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    // YOUR GAME VARIABLES WOULD GO HERE
    Color brown = new Color(173,133,69);
    Color lbrown = new Color(255,221,168);
     Color pink = new Color(216,147,165);
     
     int rightEye = 335;
     int leftEye = 210;
     int eyeMove = 1;
     int closeEye = 100;
     int blink = 1;
     int closePupil = 50;
     int closeMouth = 375;
     int mouth = 2;
     
    // GAME VARIABLES END HER E    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
       
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        g.setColor(Color.BLACK);
        g.fillArc(100, 500, 400, 400, 0, 180);
        
        g.setColor(Color.WHITE);
        int[] triangleX = {300,225,375};
        int[] triangleY = {650,500,500};
        g.fillPolygon(triangleX,triangleY,3);
        
        g.setColor(Color.BLACK);
        int[] triangleT = {300,275,325};
        int[] triangleB = {650,500,500};
        g.fillPolygon(triangleT,triangleB,3);
        
        g.setColor(brown);
        g.fillOval(60, 150, 250, 200);
        g.fillOval(290, 150, 250, 200);
        
        g.setColor(pink);
        g.fillOval(80, 160, 250, 175);
        g.fillOval(270, 160, 250, 175);
        
        
        g.setColor(brown);
        g.fillOval(100, 100, 400, 400);
        g.fillOval(80, 225, 300, 300);
        g.fillOval(220, 225, 300, 300); 
          
        g.setColor(lbrown);
        g.fillOval(250, 425, 100, 125);
        g.fillOval(275, 375, 150, 150);
        g.fillOval(175, 375, 150, 150);
        g.fillOval(210, 175, 250, 250);
        g.fillOval(135, 175, 250, 250);
        
        
        g.setColor(Color.BLACK);
        g.fillOval(200, 225, 75, closeEye);
        g.fillOval(325, 225, 75, closeEye);
        
        g.setColor(Color.WHITE);
        g.fillOval(leftEye, 235, 25, closePupil);
        g.fillOval(rightEye, 235, 25, closePupil);
        
        g.setColor(pink);
        g.fillArc(200, closeMouth, 200, closeEye, 180, 180);
        
        g.setColor(Color.BLACK);
        g.fillRect(225, 85, 150, 20);
        g.fillRect(263, 30, 75, 75);
        
        g.setColor(Color.WHITE);
        g.fillRect(263,75 ,75, 20);
        
        g.setColor(Color.BLACK);
        g.fillOval(310, 375, 25, 25);
        g.fillOval(260, 375, 25, 25);
        
      
        
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        leftEye = leftEye + eyeMove;
        
        if(leftEye > 230){
            eyeMove = -1;
        }
        
        if(leftEye < 205){
            eyeMove = 1;
        }
        rightEye = rightEye + eyeMove;
        
        closeEye = closeEye + blink;
        if(closeEye > 100){
            blink = -1;
        }
        
        if(closeEye < 1){
            blink = 1;
        }
        closePupil = closePupil + blink;
        
        closeMouth = closeMouth + mouth;
        if(closeMouth > 411){
            mouth = -1;
        }
        
        if(closeMouth < 410){
            mouth = 1;
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}

