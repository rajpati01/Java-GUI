import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    Image image;

    MyPanel() {
        this.setPreferredSize(new Dimension(420, 420));
        image = new ImageIcon("aurora.png").getImage();
    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, 0, 0, null);

        g2D.setPaint(Color.GREEN);
        g2D.setStroke(new BasicStroke(4));
        //g2D.drawLine(0, 0, 500, 500);

//        g2D.drawRect(50,50, 200, 101);
//        g2D.setPaint(Color.magenta);
//        g2D.fillRect(200,200, 200, 101);

//        g2D.setPaint(Color.CYAN);
//        g2D.drawOval(25, 29, 150, 150);
//        g2D.fillOval(60, 60, 100, 100);

//        g2D.setPaint(Color.BLACK);
//        g2D.fillArc(70,70,100, 100,0, 180);
//        //g2D.drawArc(70,70,100, 100,0, 180);
//        g2D.setPaint(Color.magenta);
//        g2D.fillArc(70,70,100, 100,180, 180);
//        //g2D.drawArc(70,70,100, 100, 180, 180);

//        int[] xPoints = {150, 250, 350};
//        int[] yPoints = {300, 250, 100};
//        g2D.setPaint(Color.blue);
//        g2D.drawPolygon(xPoints, yPoints,3);
//        g2D.fillPolygon(xPoints, yPoints, 3);

//        g2D.setPaint(Color.MAGENTA);
//        g2D.setFont(new Font("Ink Free", Font.BOLD,30));
//        g2D.drawString("U R AWESOME : D", 50, 50);
    }
}

class Paint extends JFrame {

    MyPanel myPanel = new MyPanel();

    Paint() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(myPanel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }
}

public class Painting2D {
    public static void main(String[] args) {

        Paint paint = new Paint();
    }
}
