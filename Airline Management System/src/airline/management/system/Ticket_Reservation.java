
package airline.management.system;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Ticket_Reservation extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Ticket_Reservation(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("Journey_Info");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel PnrNo = new JLabel("PNR NO");
            PnrNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PnrNo.setBounds(150, 100, 150, 27);
            add(PnrNo);
            
            textField = new JTextField();
            textField.setBounds(300, 100, 150, 27);
            add(textField);
	
            JLabel TicketId = new JLabel("TICKET ID");
            TicketId.setFont(new Font("Tahoma", Font.PLAIN, 17));
            TicketId.setBounds(150, 340, 150, 27);
            add(TicketId);
			
            textField_1 = new JTextField();
            textField_1.setBounds(300, 340, 150, 27);
            add(textField_1);
            
            JLabel JnyDate = new JLabel("JORNEY DATE");
            JnyDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
            JnyDate.setBounds(150, 180, 150, 27);
            add(JnyDate);
			
            textField_2 = new JTextField();
            textField_2.setBounds(300, 180, 150, 27);
            add(textField_2);
            		
            JLabel JnyTime = new JLabel("JORNEY TIME");
            JnyTime.setFont(new Font("Tahoma", Font.PLAIN, 17));
            JnyTime.setBounds(150, 220, 150, 27);
            add(JnyTime);
			
            textField_3 = new JTextField();
            textField_3.setBounds(300, 220, 150, 27);
            add(textField_3);
	
            JLabel src = new JLabel("SOURCE");
            src.setFont(new Font("Tahoma", Font.PLAIN, 17));
            src.setBounds(150, 260, 150, 27);
            add(src);
	
            textField_4 = new JTextField();
            textField_4.setBounds(300, 260, 150, 27);
            add(textField_4);
            
            JLabel dst = new JLabel("DESTINATION");
            dst.setFont(new Font("Tahoma", Font.PLAIN, 17));
            dst.setBounds(150, 300, 150, 27);
            add(dst);

            textField_5 = new JTextField();
            textField_5.setBounds(300, 300, 150, 27);
            add(textField_5);

            JLabel FlightCode = new JLabel("FLIGHT CODE");
            FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            FlightCode.setBounds(150, 140, 150, 27);
            add(FlightCode);

            textField_6 = new JTextField();
            textField_6.setBounds(300, 140, 150, 27);
            add(textField_6);
            
            JButton Next = new JButton("SUBMIT");
            Next.setBounds(230, 400, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
            
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD JOURNEY DETAILS");
            AddPassengers.setForeground(Color.YELLOW);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(130, 24, 442, 35);
            add(AddPassengers);

            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String pnr_code = textField.getText();
                    String ticket_id = textField_1.getText();
                    String f_code = textField_6.getText();
                    String jny_date =  textField_2.getText();
                    String jny_time = textField_3.getText();
                    String src = textField_4.getText();
                    String dst = textField_5.getText();
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO reservation values( '"+pnr_code+"', '"+ticket_id+"', '"+f_code+"', '"+jny_date+"', '"+jny_time+"', '"+src+"', '"+dst+"')";
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Details Inserted");
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
        new Ticket_Reservation();
    }   
}
