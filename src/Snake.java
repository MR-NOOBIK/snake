
import java.awt.EventQueue;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Snake extends JFrame {

    public Snake() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake 2");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new Snake();
                ex.setVisible(true);
            }
        });
    }
}
