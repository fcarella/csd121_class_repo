package w23.lecture2.frameExample;

import javax.swing.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
