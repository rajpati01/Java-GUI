import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NewWindow {

    NewWindow() {

        JButton button1 = new JButton();
        button1.setBackground(Color.green);
        button1.setFocusable(false);
        button1.setText("HELLO!!!!");
        button1.setOpaque(true);
        button1.setBounds(150, 150, 100, 25);

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 400);
        frame1.setVisible(true);
        frame1.setLayout(null);

        frame1.add(button1);
    }
}

class LunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton();
    JLabel label = new JLabel();
    JPanel panel = new JPanel();

    LunchPage() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java GUI");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.add(button);
        frame.add(label);
        frame.add(panel);

        label.setBounds(100, 100, 150, 100);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);

        button.setBackground(Color.green);
        button.setFocusable(false);
        button.setText("Click here");
        button.setOpaque(true);
        button.setBounds(120, 140, 100, 25);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        LunchPage lunchPage = new LunchPage();
    }
}
