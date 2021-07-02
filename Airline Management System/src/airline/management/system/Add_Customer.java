package airline.management.system;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Add_Customer extends JFrame{ 

	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Add_Customer(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD CUSTOMER DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel Passportno = new JLabel("PASSPORT NO");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(150, 120, 150, 27);
            add(Passportno);
            
            textField = new JTextField();
            textField.setBounds(300, 120, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SAVE");
            Next.setBounds(300, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel Pnrno = new JLabel("PNR NO");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Pnrno.setBounds(150, 160, 150, 27);
            add(Pnrno);
			
            textField_1 = new JTextField();
            textField_1.setBounds(300, 160, 150, 27);
            add(textField_1);
            
            JLabel Address = new JLabel("ADDRESS");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(150, 200, 200, 27);
            add(Address);
			
            textField_2 = new JTextField();
            textField_2.setBounds(300, 200, 150, 27);
            add(textField_2);
            		
            JLabel Nationality = new JLabel("NATIONALITY");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(150, 240, 150, 27);
            add(Nationality);
			
            textField_3 = new JTextField();
            textField_3.setBounds(300, 240, 150, 27);
            add(textField_3);
	
            JLabel Name = new JLabel("NAME");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(150, 270, 280, 27);
            add(Name);
	
            textField_4 = new JTextField();
            textField_4.setBounds(300, 280, 150, 27);
            add(textField_4);
	
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(150, 320, 150, 27);
            add(Gender);
		
            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(300, 320, 70, 27);
            add(NewRadioButton);
	
            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(380, 320, 100, 27);
            add(Female);
            
            JLabel Phno = new JLabel("PH NO");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(150, 370, 150, 27);
            add(Phno);
			
            textField_5 = new JTextField();
            textField_5.setBounds(300, 370, 150, 27);
            add(textField_5);
	
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD CUSTOMER DETAILS");
            AddPassengers.setForeground(Color.GREEN);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(125, 24, 442, 35);
            add(AddPassengers);
			
    
            JLabel Flightcode = new JLabel("FLIGHT CODE");
            Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Flightcode.setBounds(150, 80, 150, 27);
            add(Flightcode);

            textField_6 = new JTextField();
            textField_6.setBounds(300, 80, 150, 27);
            add(textField_6);

            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String passport_No = textField.getText();
                    String pnr_no = textField_1.getText();
                    String address =  textField_2.getText();
                    String nationality = textField_3.getText();
                    String name = textField_4.getText();
                    String fl_code = textField_6.getText();
                   
                    String gender = null;
                    String ph_no = textField_5.getText();
                    
                    if(NewRadioButton.isSelected()){
                        gender = "male";
                    
                    }else if(Female.isSelected()){
                        gender = "female";
                    }
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO passenger values( '"+pnr_no+"', '"+address+"', '"+nationality+"','"+name+"', '"+gender+"', '"+ph_no+"','"+passport_No+"', '"+fl_code+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Customer Added");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(630,600);
            setVisible(true);
            setLocation(320,50);
			
	}
        
    public static void main(String[] args){
        new Add_Customer();
    }   
}
