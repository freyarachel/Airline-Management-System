package airline.management.system;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Update_Flight_Details extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Update_Flight_Details(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("Update_Flight_Details");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel FlightCode = new JLabel("Enter FLIGHT CODE of the flight to be updated");
            FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            FlightCode.setBounds(40, 100, 450, 27);
            add(FlightCode);
            
            textField = new JTextField();
            textField.setBounds(420, 100, 150, 27);
            add(textField);
	
            JLabel Capacity = new JLabel("FLIGHT CAPACITY");
            Capacity.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Capacity.setBounds(150, 140, 150, 27);
            add(Capacity);
			
            textField_1 = new JTextField();
            textField_1.setBounds(300, 140, 150, 27);
            add(textField_1);
            
            JLabel ClassCode = new JLabel("CLASS CODE");
            ClassCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            ClassCode.setBounds(150, 180, 150, 27);
            add(ClassCode);
			
            textField_2 = new JTextField();
            textField_2.setBounds(300, 180, 150, 27);
            add(textField_2);
            		
            JLabel ClassName = new JLabel("CLASS NAME");
            ClassName.setFont(new Font("Tahoma", Font.PLAIN, 17));
            ClassName.setBounds(150, 220, 150, 27);
            add(ClassName);
			
            textField_3 = new JTextField();
            textField_3.setBounds(300, 220, 150, 27);
            add(textField_3);
	
            JLabel FlightName = new JLabel("FLIGHT NAME");
            FlightName.setFont(new Font("Tahoma", Font.PLAIN, 17));
            FlightName.setBounds(150, 260, 150, 27);
            add(FlightName);
	
            textField_4 = new JTextField();
            textField_4.setBounds(300, 260, 150, 27);
            add(textField_4);
            
            JLabel Source = new JLabel("SOURCE");
            Source.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Source.setBounds(150, 300, 150, 27);
            add(Source);

            textField_5 = new JTextField();
            textField_5.setBounds(300, 300, 150, 27);
            add(textField_5);

            JLabel dst = new JLabel("DESTINATION");
            dst.setFont(new Font("Tahoma", Font.PLAIN, 17));
            dst.setBounds(150, 340, 150, 27);
            add(dst);

            textField_6 = new JTextField();
            textField_6.setBounds(300, 340, 150, 27);
            add(textField_6);
            
            JButton Next = new JButton("UPDATE");
            Next.setBounds(230, 400, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
            
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("UPDATE FLIGHT DETAILS");
            AddPassengers.setForeground(Color.YELLOW);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(145, 24, 442, 35);
            add(AddPassengers);

            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String flight_code = textField.getText();
                    String capacity = textField_1.getText();
                    String class_code =  textField_2.getText();
                    String class_name = textField_3.getText();
                    String f_name = textField_4.getText();
                    String src = textField_5.getText();
                    String dst = textField_6.getText();
                    String f_code = textField.getText();

                    try {
                        conn c = new conn();
                        String str = "UPDATE sector SET capacity = '"+capacity+"',class_code = '"+class_code+"',class_name = '"+class_name+"' WHERE flight_code = '"+flight_code+"'";
                        String str1 = "UPDATE flight SET f_name = '"+f_name+"',src = '"+src+"',dst = '"+dst+"' WHERE f_code = '"+f_code+"'";
                        c.s.executeUpdate(str);
                        c.s.executeUpdate(str1);
                        JOptionPane.showMessageDialog(null,"Details Updated");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(630,510);
            setVisible(true);
            setLocation(300,70);
			
	}
        
    public static void main(String[] args){
        new Update_Flight_Details();
    }   
}
