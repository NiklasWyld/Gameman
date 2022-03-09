/**
 * Gameman
 * 
 * @author Niklas
 * @version 0.1
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gameman
{   
    static int cps_int = 0;
    
    public static void main(String[] args) {
        openUI();
    }
    
    public static void openUI() {
        JFrame frame = new JFrame("Gameman");
        
        JButton click_game = new JButton("Click Game");
        click_game.setBounds(10, 10, 150, 40);
        
        JButton liebes_test = new JButton("Love test");
        liebes_test.setBounds(10, 60, 150, 40);
        
        liebes_test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liebesTestGame(frame);
            }
        });
        
        click_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickGame(frame);
            }
        });
        
        frame.add(liebes_test);
        frame.add(click_game);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void liebesTestGame(JFrame mainframe) {
        mainframe.hide();
        
        JFrame frame = new JFrame("Gameman: Liebes Test");
        
        // Components
        
        JTextField name1 = new JTextField("Dein Name");
        JTextField name2 = new JTextField("Der Name deiner Liebe");
        
        
        // Actions
        
        // Set bounds of components
        
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void clickGame(JFrame mainframe) {
        mainframe.hide();
        
        JFrame frame = new JFrame("Gameman: Click Game");
        
        // Components
        
        JButton cps_clicker = new JButton("Click Here");
        
        JLabel cps = new JLabel("Clicks: " + cps_int);
        
        JButton reset_cps = new JButton("Reset Clicks");
        
        // Actions
        
        cps_clicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cps_int = cps_int + 1;
                cps.setText("Clicks: " + cps_int);
            }
        });
        
        reset_cps.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cps_int = 0;
                cps.setText("Clicks: " + cps_int);
            }
        });
        
        // Set bounds of components
        
        cps_clicker.setBounds(10, 10, 120, 40);
        cps.setBounds(150, 10, 300, 40);
        reset_cps.setBounds(10, 60, 120, 40);
        
        frame.add(cps_clicker);
        frame.add(cps);
        frame.add(reset_cps);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
