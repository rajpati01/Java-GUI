import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLACK);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0, 0, 500, 500);
        layer.add(label1, Integer.valueOf(1));
        layer.add(label2, Integer.valueOf(2));
        layer.add(label3, Integer.valueOf(3));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(layer);
        //frame.setLayout(new BorderLayout(10, 10));
        //frame.setLayout(new GridLayout(3,3 ,10,10));

/*        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(100, 160));
        panel.setLayout(new FlowLayout());

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

 */

        frame.setVisible(true);
/*
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.orange);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //----------------------sub Panel-----------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel5.setLayout(new BorderLayout(5, 5));

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.magenta);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.cyan);
        panel10.setBackground(Color.white);


        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.SOUTH);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);

        //---------------------sub panel-------------------

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);

 */
    }
}
