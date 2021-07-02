package airline.management.system;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Payment_Form extends JFrame{

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Payment_Form(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("PAYMENT FORM");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel PNRno = new JLabel("PNR NO");
            PNRno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PNRno.setBounds(150, 100, 150, 27);
            add(PNRno);
            
            textField = new JTextField();
            textField.setBounds(300, 100, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SUBMIT");
            Next.setBounds(230, 360, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel PaidAmount = new JLabel("AMOUNT");
            PaidAmount.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PaidAmount.setBounds(150, 140, 150, 27);
            add(PaidAmount);
			
            textField_1 = new JTextField();
            textField_1.setBounds(300, 140, 150, 27);
            add(textField_1);
            
            JLabel PayDate = new JLabel("PAYMENT DATE");
            PayDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PayDate.setBounds(150, 180, 150, 27);
            add(PayDate);
			
            textField_2 = new JTextField();
            textField_2.setBounds(300, 180, 150, 27);
            add(textField_2);
            		
            JLabel ChequeNo = new JLabel("CHEQUE NO");
            ChequeNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            ChequeNo.setBounds(150, 220, 150, 27);
            add(ChequeNo);
			
            textField_3 = new JTextField();
            textField_3.setBounds(300, 220, 150, 27);
            add(textField_3);
	
            JLabel CardNo = new JLabel("CARD NO");
            CardNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            CardNo.setBounds(150, 260, 150, 27);
            add(CardNo);
	
            textField_4 = new JTextField();
            textField_4.setBounds(300, 260, 150, 27);
            add(textField_4);
	
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD PAYMENT DETAILS");
            AddPassengers.setForeground(Color.YELLOW);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(130, 24, 442, 35);
            add(AddPassengers);

            JLabel PhNo = new JLabel("PHONE NO");
            PhNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PhNo.setBounds(150, 300, 150, 27);
            add(PhNo);

            textField_6 = new JTextField();
            textField_6.setBounds(300, 300, 150, 27);
            add(textField_6);

            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String pnr_no = textField.getText();
                    String ph_no = textField_6.getText();
                    String cheque_no = textField_3.getText();
                    String card_no = textField_4.getText();
                    String paid_amt = textField_1.getText();
                    String pay_date =  textField_2.getText();

                    try {
                        conn c = new conn();
                        String str = "INSERT INTO payment values( '"+pnr_no+"', '"+ph_no+"','"+cheque_no+"', '"+card_no+"', '"+paid_amt+"', '"+pay_date+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Payment Completed");
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
        new Payment_Form();
    }   
}