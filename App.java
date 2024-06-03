import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JFrame frame;
    private JLabel background;
    private JButton button_1, button_2, button_3, button_4, button_5, button_6, button_7;

    public App() {
        // Create the frame
        frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.add(layeredPane);

        // Set the initial background image
        background = new JLabel(new ImageIcon(getClass().getResource("resources/pic1.jpg")));
        background.setBounds(0, 0, 1200, 800);

        // BUTTON 1 "start"
        button_1 = new JButton(new ImageIcon(getClass().getResource("resources/button1.png")));
        button_1.setBounds(900, 500, 240, 70);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                // frame.remove(button_1);
                layeredPane.remove(button_1);

                // add button 2 and 3
                button_2.setBounds(400, 400, 240, 70);
                layeredPane.add(button_2, JLayeredPane.PALETTE_LAYER);
                button_3.setBounds(700, 400, 240, 70);
                layeredPane.add(button_3, JLayeredPane.PALETTE_LAYER);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic2.jpg")));
        
                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 2 "canoe rental"
        button_2 = new JButton(new ImageIcon(getClass().getResource("resources/button2.png")));
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                layeredPane.remove(button_2);
                layeredPane.remove(button_3);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic3.jpg")));

                button_4.setBounds(400, 400, 240, 70);
                layeredPane.add(button_4, JLayeredPane.PALETTE_LAYER);
                button_5.setBounds(700, 400, 240, 70);
                layeredPane.add(button_5, JLayeredPane.PALETTE_LAYER);

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 3 "community pool"
        button_3 = new JButton(new ImageIcon(getClass().getResource("resources/button3.png")));
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // delete the button
                layeredPane.remove(button_2);
                layeredPane.remove(button_3);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic4.jpg")));

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 4 "physics"
        button_4 = new JButton(new ImageIcon(getClass().getResource("resources/button4.png")));
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                layeredPane.remove(button_4);
                layeredPane.remove(button_5);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic6.jpg")));

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 5 "moon"
        button_5 = new JButton(new ImageIcon(getClass().getResource("resources/button5.png")));
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                layeredPane.remove(button_4);
                layeredPane.remove(button_5);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic5.jpg")));

                button_6.setBounds(400, 400, 240, 70);
                layeredPane.add(button_6, JLayeredPane.PALETTE_LAYER);
                button_7.setBounds(700, 400, 240, 70);
                layeredPane.add(button_7, JLayeredPane.PALETTE_LAYER);

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 6
        button_6 = new JButton(new ImageIcon(getClass().getResource("resources/button6.png")));
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                layeredPane.remove(button_6);
                layeredPane.remove(button_7);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic8.jpg")));

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // BUTTON 7
        button_7 = new JButton(new ImageIcon(getClass().getResource("resources/button7.png")));
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // delete the button
                layeredPane.remove(button_6);
                layeredPane.remove(button_7);

                // Change the background image
                background.setIcon(new ImageIcon(getClass().getResource("resources/pic7.jpg")));

                // Refresh the frame
                frame.revalidate();
                frame.repaint();
            }
        });

        // initial display setting
        layeredPane.add(background, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(button_1, JLayeredPane.PALETTE_LAYER);
    
        // Display the window
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}