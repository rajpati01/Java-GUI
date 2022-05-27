import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 10));
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        slider.setOrientation(SwingConstants.VERTICAL);
        //slider.setOrientation(SwingConstants.CENTER);
        label.setText("C = " + slider.getValue());
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C = " + slider.getValue());
    }
}

class TextField extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    TextField() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setBackground(Color.BLACK);
        textField.setText("user name");
        textField.setForeground(Color.magenta);
        textField.setFont(new Font("Consolas", Font.PLAIN, 25));
        textField.setCaretColor(Color.WHITE);

        this.setSize(400, 400);
        this.setVisible(true);
        //this.pack();
        this.add(textField);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}

class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 10;
        }
        bar.setString("Done! :)");
    }
}

class CheckBoxDemo extends JFrame implements ActionListener {

    JButton button;
    JCheckBox box;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    CheckBoxDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(420, 420);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("cross.png");
        checkIcon = new ImageIcon("tick.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        box = new JCheckBox();
        box.setText("I am not a robot");
        box.setFocusable(false);
        box.setFont(new Font("MV Boli", Font.PLAIN, 25));
        box.setIcon(xIcon);
        box.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(box);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(box.isSelected());
        }
    }
}

class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton Pizza;
    JRadioButton HamBurger;
    JRadioButton Sandwich;

    RadioButtonDemo() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        Pizza = new JRadioButton("Pizza");
        HamBurger = new JRadioButton("Ham-burger");
        Sandwich = new JRadioButton("Sandwich");

        Pizza.addActionListener(this);
        HamBurger.addActionListener(this);
        Sandwich.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(Pizza);
        group.add(HamBurger);
        group.add(Sandwich);

        this.add(Pizza);
        this.add(HamBurger);
        this.add(Sandwich);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Pizza) {
            System.out.println("You ordered Pizza");
        } else if (e.getSource() == HamBurger) {
            System.out.println("You ordered Ham-Burger");
        } else if (e.getSource() == Sandwich) {
            System.out.println("You ordered Sandwich");
        }
    }
}

class ComboBoxDemo extends JFrame implements ActionListener {

    JComboBox comboBox;
    JComboBox comboBox1;

    ComboBoxDemo() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        Integer[] num = {1, 2, 3, 4};
        comboBox1 = new JComboBox(num);

        String[] animals = {"Cat", "Dog", "Cow"};
        comboBox = new JComboBox(animals);
        comboBox.setBackground(Color.green);
        comboBox.addActionListener(this);

//        comboBox.setEditable(true);
//        System.out.println(comboBox.getItemCount());
//        comboBox.addItem("horse");
//        comboBox.insertItemAt("pig", 0);
//        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("Cat");
//        comboBox.removeItemAt(1);
//

        this.add(comboBox1);
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.print(comboBox.getSelectedIndex() + ". ");
            System.out.println(comboBox.getSelectedItem());
        }
    }
}

class MenuBarDemo extends JFrame implements ActionListener {

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MenuBarDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("folder.png");
        saveIcon = new ImageIcon("disk.png");
        exitIcon = new ImageIcon("logout.png");

        JMenuBar menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help
        loadItem.setMnemonic(KeyEvent.VK_L); // L to load file
        saveItem.setMnemonic(KeyEvent.VK_S); // S to save file
        exitItem.setMnemonic(KeyEvent.VK_E); // E to exit file

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("File Loaded");
        }
        if (e.getSource() == saveItem) {
            System.out.println("File Saved");
        }
        if (e.getSource() == exitItem) {
            System.out.println("Exiting.....");
            System.exit(0);
        }
    }
}

class FileChooseDemo extends JFrame implements ActionListener {

    JButton button;

    FileChooseDemo() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));
            //int response = fileChooser.showOpenDialog(null); // select file to open
            int response1 = fileChooser.showSaveDialog(null); // select file to choose

            if (response1 == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}

class ColorChooserDemo extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooserDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color for text", Color.BLACK);
            Color color2 = JColorChooser.showDialog(null, "Pick a color for background", Color.WHITE);
            label.setForeground(color);
            label.setBackground(color2);
        }
    }
}

class KeyListenerDemo extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    KeyListenerDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 400, 400);
        label.setIcon(icon);
        //label.setBackground(Color.RED);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = invoked when a key is typed. uses keyChar, char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = invoked when a physical jey is pressed down. uses keyCode, int output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released

//        System.out.println("you pressed key: "+ e.getKeyChar());
//        System.out.println("You pressed key code: "+ e.getKeyCode());
    }

}

class MouseListenerDemo extends JFrame implements MouseListener {

    JLabel label;

    MouseListenerDemo() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");
        label.setBackground(Color.white);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("you entered the component");
        label.setBackground(Color.MAGENTA);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exist a component
        System.out.println("you exited the component");
        label.setBackground(Color.red);
    }
}

public class Learn {
    public static void main(String[] args) {

        //SliderDemo sliderDemo = new SliderDemo();
        //TextField textField = new TextField();
        //ProgressBarDemo progress = new ProgressBarDemo();
        //CheckBoxDemo checkBox = new CheckBoxDemo();
        //RadioButtonDemo  RButton = new RadioButtonDemo();
        //ComboBoxDemo comboBox = new ComboBoxDemo();
        //MenuBarDemo menuBar = new MenuBarDemo();
        //FileChooseDemo fileChoose = new FileChooseDemo();
        //ColorChooserDemo colorChooser = new ColorChooserDemo();
        //KeyListenerDemo keyListener = new KeyListenerDemo();
        MouseListenerDemo mouseListener = new MouseListenerDemo();

/*        JOptionPane.showMessageDialog(null, "This is info", "hello",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is info", "hello",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is info", "hello",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is info", "hello",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is info", "hello",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "what is your name?", "bio", JOptionPane.YES_NO_CANCEL_OPTION)
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello "+ name);

        ImageIcon image = new ImageIcon("signature.jpg");
        JOptionPane.showOptionDialog(null, "exit", "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);
 */
    }
}
