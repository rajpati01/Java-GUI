import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnimationDemo1 extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 280;
    Image ufo;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 4;
    int yVelocity = 3;
    int x = 0;
    int y = 0;

    AnimationDemo1() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        ufo = new ImageIcon("ufo.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g); // will paint our background
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(ufo, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x >= PANEL_WIDTH - ufo.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if (y >= PANEL_HEIGHT - ufo.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}

class AnimationDemo extends JFrame {

    AnimationDemo1 animationDemo1;

    AnimationDemo() {

        animationDemo1 = new AnimationDemo1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(animationDemo1);
        this.pack();
        this.setPreferredSize(null);
        this.setVisible(true);
    }

}

public class Animation {
    public static void main(String[] args) {

        AnimationDemo animationDemo = new AnimationDemo();
    }
}
