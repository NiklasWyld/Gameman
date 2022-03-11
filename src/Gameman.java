/**
 * Gameman
 * 
 * @author NiklasWyld
 * @version 0.1
 */

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;

// x, y, width, height

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
        
        JButton liebes_test = new JButton("Liebes Test");
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
        
        // Window listener
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                    "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        frame.add(liebes_test);
        frame.add(click_game);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public static void liebesTestGame(JFrame mainframe) {
        mainframe.hide();
        
        JFrame frame = new JFrame("Gameman: Liebes Test");
        
        // Components
        
        JLabel name1_info;
        JLabel name2_info;
        JTextField name1;
        JTextField name2;
        JButton name_test;
        JLabel love_int;
        
        // Components settings
        
        name1 = new JTextField();
        name2 = new JTextField();
        name1_info = new JLabel("Dein Name:");
        name2_info = new JLabel("Der Name deiner Liebe:");
        name_test = new JButton("Liebestest starten");
        love_int = new JLabel("");
        
        // Actions
        
        name_test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                // I know it's not efficient, but you can rewrite it and then make a pull request.
				if(name1.getText().equals("") && name2.getText().equals("")) {
					love_int.setText("");
				} else if(name1.getText().equals("")) {
					love_int.setText("");
				} else if(name2.getText().equals("")) {
					love_int.setText("");
				} else {
					int love_int_integer = ThreadLocalRandom.current().nextInt(0, 100 + 1);
					love_int.setText(love_int_integer + "%");
				}
				
			}
		});
        
        // Set bounds of components
        
        name1.setBounds(250, 100, 150, 30);
        name2.setBounds(250, 150, 150, 30);
        name1_info.setBounds(170, 100, 100, 30);
        name2_info.setBounds(100, 150, 150, 30);
        name_test.setBounds(250, 300, 150, 30);
        love_int.setBounds(290, 200, 150, 30);
        
        // Components settings #2
        
        love_int.setFont(new Font("Serif", Font.PLAIN, 30));
        
        // Window listener
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                    "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } 
            }
        });
        
        // Frame settings
        
        frame.add(love_int);
        frame.add(name_test);
        frame.add(name1_info);
        frame.add(name2_info);
        frame.add(name1);
        frame.add(name2);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setResizable(false);
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
        
        // Window listener
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                    "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        // Frame settings
        
        frame.add(cps_clicker);
        frame.add(cps);
        frame.add(reset_cps);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
