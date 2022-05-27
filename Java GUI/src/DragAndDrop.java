import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class MyFrame1 extends JFrame {

    DragPanel dragPanel = new DragPanel();

    MyFrame1() {

        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Drag and Drop Demo");
        this.setVisible(true);
    }
}

class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("rocket.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel() {

        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(draglistener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
}

public class DragAndDrop {
    public static void main(String[] args) {

        MyFrame1 myFrame = new MyFrame1();
    }
}
