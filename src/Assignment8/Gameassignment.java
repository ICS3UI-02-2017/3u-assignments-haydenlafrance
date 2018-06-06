package Assignment8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
public class Gameassignment extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 1000;

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

   
 //GAME VARIABLES:
    
    //new colours of the game
    Color grass = new Color(77, 163, 40);
    Color darkgrass = new Color(48, 104, 25);
    Color powergreen = new Color(6, 204, 0);
    
    //power bar and power bar speed 
    int hit = 175;
    int hitPower = 15;
    
    //initail ball position 
    double ballX = 193;
    double ballY = 240;
    
    //find the x and Y of the mouse 
    int mouseX = 0;
    int mouseY = 0;
    
    //speed of the ball
    double r = 0;
    
    //the angle that follows the mouse 
    double angle = 0;
    
    //if ball goes in 
    int ScreenX = 0;
    int ScreenY = 0;
    
    Rectangle ball = new Rectangle((int)ballX,(int)ballY,15,15);
    Rectangle wall4 = new Rectangle (300,200, 400, 200);
    Rectangle wall2 = new Rectangle (900, 200, 200, 400);
    
    Rectangle wall3 = new Rectangle (0,0, 1000, 200);
    Rectangle wall1 = new Rectangle (0,0, 100, 700);
    Rectangle wall5 = new Rectangle (100,600, 900, 100);
           
    
 
    
    //move the power bar
    boolean powerBar = false;
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Gameassignment(){
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
        g.setColor(Color.RED);
        g.fillRect(0,0, 1000, 1000);
        
        g.setColor(Color.BLACK);
        g.drawRect(99, 199, 201, 401);
        g.drawRect(699, 199, 201, 401);
        g.drawRect(99,399, 801, 201); 
        g.drawRect(174,699, 326, 51); 
        
        
        g.setColor(grass);
        g.fillRect(100, 200, 200, 400);
        g.fillRect(700, 200, 200, 400);
        g.fillRect(100,400, 800, 200);
        
       
        g.setColor(darkgrass);
        g.fillRect(175,225, 50, 50);
        
        g.setColor(Color.BLACK);
        g.fillOval(796, 250, 20, 20);
        
        g.setColor(Color.WHITE);
        g.fillOval(ball.x, ball.y, ball.width, ball.height);
        g.fillRect(804,213, 5, 50);
        
        g.setColor(Color.RED);
        int[] triangleT = {807,820,807};
        int[] triangleB = {215,225,235};
        g.fillPolygon(triangleT,triangleB,3);
        
        g.setColor(grass);
        g.fillRect(175,700, 60, 50);
        
        g.setColor(powergreen);
        g.fillRect(235,700, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillRect(285,700, 40, 50);
        
        g.setColor(Color.RED);
        g.fillRect(325,700, 25, 50);
        
        g.setColor(Color.YELLOW);
        g.fillRect(350,700, 40, 50);
        
        g.setColor(powergreen);
        g.fillRect(390,700, 50, 50);
        
        g.setColor(grass);
        g.fillRect(440,700, 60, 50);
        
        g.setColor(Color.BLACK);
        g.fillRect(hit,700, 5, 50);
        
        g.setColor(Color.RED);
        g.drawLine(((int)ballX+7), ((int)ballY + 7) , mouseX, mouseY);
		
	g.setColor(Color.BLACK);
        g.fillRect(0,0, ScreenX ,ScreenY);	
        
 
        
      
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
      detectpowervalue();
      moveball();
      checkforcollison();
      checkforstrokes();
      checkforballinhole();
      
    
    }

    private void detectpowervalue() {
        //make power bar move
        if(powerBar){
        hit = hit + hitPower;}
        if(hit > 485){
            hitPower = -15;}
        if(hit < 180){
            hitPower = 15;}
      
        
        if (powerBar == false && r <= 0){
                
      angle = (int)Math.toDegrees(Math.atan2(mouseY - ballY, mouseX - ballX));
        }
        //power of the ball dectection 
        if(powerBar == false){
            if(hit >= 170 && hit < 175){
                r = 0;}}
        if (powerBar == false){
            if(hit >= 180 && hit < 230 || hit >= 440 && hit <= 490)
                r = 4;}
        if (powerBar == false){
            if(hit >= 235 && hit < 285 || hit >= 390 && hit <440)
                r = 8;}
        if (powerBar == false){
            if(hit >= 285 && hit < 325 || hit >= 350 && hit <390)
                r = 12;}
        if (powerBar == false){
            if(hit >= 325 && hit < 350)
                r = 16;}
        
        //frivtion 
        if (r > 0){
            r = r -.1;
               }
        if(r <0.1 ){
            r = 0;
        }
        
        //reset powerbar to 175 once ball stops
        if (r > 0){
        hit = 175;}
       
    }

    private void moveball() {
        
    
           
      double newAngle = Math.toRadians(angle);
      
      double moveX = r* Math.cos(newAngle);
      double moveY = r* Math.sin(newAngle);
      
      
      ballX = ballX +  moveX;
      ballY = ballY +  moveY;
     
      ball.x = (int)ballX;
      ball.y = (int)ballY;
    }

    private void checkforcollison() {
            if (ball.intersects(wall2)){
           angle = (180 + angle * -1) % 360 ;   
        }
            if (ball.intersects(wall1)){
           angle = (180 + angle * -1) % 360 ;   
        }
                if (ball.intersects(wall3)){
           angle = (180 + angle * -1) % 360 ;   
        }
                    if (ball.intersects(wall4)){
           angle = (180 + angle * -1) % 360 ;   
        }
       if (ball.intersects(wall5)){
           angle = (90 + angle * -1) % 360 ;   
        }
       if(ball.y < 200){
           angle = ( angle * -1 - 90); 
        }
       if (ball.y > 600){
            angle = (angle * -1 - 90);
       }
       if (ball.y < 400 && ball.x >= 300 && ball.x <= 700){
           angle = ( angle * -1 -90);
       }
      
        
    }

    private void checkforstrokes() {
        
        
        
        
    }

    private void checkforballinhole() {
     //  if(ballX >= 795 && ballX <= 800 && ballY >= 250 && ballY >= 255){
        //ScreenX = WIDTH;
       // ScreenY = HEIGHT;
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
           mouseX = e.getX();
           mouseY = e.getY();  
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            
       int keyCode = e.getKeyCode();
          
          if (keyCode == KeyEvent.VK_SPACE){
              powerBar = true; 
        }  
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
                       
          int keyCode = e.getKeyCode();
          
          if (keyCode == KeyEvent.VK_SPACE){
              powerBar = false; 
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
        Gameassignment game = new Gameassignment();
    }
}


