import java.awt.*;

public class RootApplet extends javax.swing {
    int number;
    
    @Override
    public void init() {
        number = 225;
    }
    
    @Override
    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.drawString("The square root of " +
            number +
            " is " +
            Math.sqrt(number), 5, 50);
    }
}