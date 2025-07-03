package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start , back;
    Rules(String name){
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
         heading.setBounds(50 , 20 , 700 , 30);
         heading.setFont(new Font("Viner Hand ITC" , Font.BOLD , 28));
         heading.setForeground( new Color(30 , 144 , 250));
         add(heading);
         
         JLabel rules = new JLabel();
         rules.setBounds(20 , 90 , 700 , 350);
         rules.setFont(new Font("Tahoma" , Font.PLAIN , 16));
         rules.setText(
         "<html>"+
                 "1. Please log in or register before starting the quiz." + "<br><br>" +
                 "2. Do not close or refresh the application during the quiz." + "<br><br>" +
                 "3. You are allowed only one attempt per quiz."+ "<br><br>"+
                 "4. Complete the quiz within the given time limit." + "<br><br>"+
                 "5. All questions must be answered before submission." + "<br><br>" + 
                 "6. External help or cheating is strictly prohibited." + "<br><br>" +
                 "7. Do not switch windows while taking the quiz." + "<br><br>" +
                 "8. Review your answers before submitting." + "<br><br>"+
                 "9. Misuse of the application may lead to disqualification." +"<br><br>" +
                 "<html>"
         );
         add(rules);
     
     back = new JButton("Back");
     back.setBounds(400, 500, 100, 30);
     back.setBackground(new Color(30, 144 , 255));
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);
     
     start = new JButton("Start");
     start.setBounds(250, 500, 100, 30);
     start.setBackground(new Color(30, 144 , 255));
     start.setForeground(Color.WHITE);
     start.addActionListener(this);
     add(start);
     
        setSize(800 , 650);
        setLocation(350 , 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }           
}
