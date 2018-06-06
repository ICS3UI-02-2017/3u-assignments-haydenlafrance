package Examples;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
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
public class Pongexample extends JComponent implements ActionListener {

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
    Rectangle paddel1 = new Rectangle(50, 250, 25, 100);
    Rectangle paddel2 = new Rectangle(725, 250, 25, 100);
    
    //ball
   Rectangle ball = new Rectangle(395, 295, 10, 10);
   
   //polar cordnates
   int ballAngle = 45;
   int ballspeed = 6;

   
   boolean paddle1up = false;
   boolean paddle1down = false; 
   boolean paddle2up = false; 
   boolean paddle2down = false ;
   int paddlespeed = 5;
   
   //score variable
   int score1 = 0;
   int score2 = 0;
   
   //new font 
   Font biggerFont = new Font("arial", Font.BOLD, 36)

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Pongexample(){
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

        // GAME DRAWING GOES HERE
        
        //draw backround
        g.setColor(Color.BLACK);
        g.fillRect (0,0, WIDTH, HEIGHT);
        
        //draw the score 
        g.setFont (biggerFont);
        g.drawString("" + score1, WIDTH/2 -150, 50);
        g.drawString("" + score2, WIDTH/2 +150, 50);
        
        
        //draw playersa and ball
        g.setColor(Color.WHITE);
        g.fillRect(paddel1.x, paddel1.y, paddel1.width, paddel1.height);
        g.fillRect(paddel2.x, paddel2.y, paddel2.width, paddel2.height);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
		
		
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
        
        moveBall();
        MovePaddles();
        checkforCollision();
        checkforGoal();
        
    }

    private void moveBall() {
        //convert bal;l angle to radians 
      double newAngle = Math.toRadians(ballAngle);
      //determine how much to move ball x and ball y
      //using trig

      
      double moveX = ballspeed* Math.cos(newAngle);
      double moveY = ballspeed* Math.cos(newAngle);
      
      ball.x = ball.x + (int) moveX;
      ball.y = ball.y + (int) moveY;
    }

    private void MovePaddles() {
        
      if(paddle1up){
          paddel1.y = paddel1.y - paddlespeed;
      }  
      else if(paddle1down){
          paddel1.y = paddel1.y - paddlespeed;
      }  
      if (paddel1.y < 0){
          paddel1.y = 0;
      }
      else if (paddel1.y + paddel1.height > HEIGHT){
          paddel1 
      }
        if(paddle1up){
          paddel2.y = paddel2.y - paddlespeed;
      }  
      else if(paddle1down){
          paddel2.y = paddel2.y - paddlespeed;
      }  
        
        
    }

    private void checkforCollision() {
       
    }

    private void checkforGoal() {
        if (ball.x < 0){
            //add to player two score
            score2++;
            //put ball back at the center 
            ball.x = WIDTH/2 -ball.width/2;
            
        }
        if (ballx + ball.width > WIDTH){
            //add to player 1 score 
            ball.x 
            ball.y
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

          int keyCode = e.getKeyCode();
          if (keyCode == KeyEvent.VK_W){
              paddle1up = true;
          }
            if (keyCode == KeyEvent.VK_S){
              paddle1down = true;
          }
              if (keyCode == KeyEvent.VK_UP){
              paddle2up = true;
          }
                if (keyCode == KeyEvent.VK_DOWN){
              paddle2up = true;
          }
            
            
            
            
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
 int keyCode = e.getKeyCode();
          if (keyCode == KeyEvent.VK_W){
              paddle1up = false;
          }
            if (keyCode == KeyEvent.VK_S){
              paddle1down = false;
          }
              if (keyCode == KeyEvent.VK_UP){
              paddle2up = false;
          }
                if (keyCode == KeyEvent.VK_DOWN){
              paddle2down = false;
          }
            
            
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
        Pongexample game = new Pongexample();
    }
}

