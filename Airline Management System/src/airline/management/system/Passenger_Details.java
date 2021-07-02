package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Passenger_Details extends JFrame{  

    JTable table;
    JButton Show;
    private JTextField textField;

    public static void main(String[] args){
        new Passenger_Details();
    }
    
    public Passenger_Details(){

        setTitle("Passenger_Details");
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(null);

	JButton Show = new JButton("SHOW");
	Show.setBounds(680, 30, 100, 30);
	add(Show);
	
	JLabel ReservationDetails = new JLabel("PASSENGER DETAILS");
	ReservationDetails.setForeground(Color.BLUE);
	ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ReservationDetails.setBounds(280, 27, 359, 31);
	add(ReservationDetails);

	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		try{

                    conn c = new conn();
                    
                    String str = "select * from passenger";
                    ResultSet rs=c.s.executeQuery(str);
                    
                    table.setModel(DbUtils.resultSetToTableModel(rs));

		}catch(Exception e){}
            }
	});
        
        table = new JTable();
        table.setBackground(Color.WHITE);
	table.setBounds(23, 300, 800, 300);
 
        JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 100, 800, 450);
        pane.setBackground(Color.WHITE);
        add(pane);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(860,600);
        setLocation(210,30);
	setVisible(true);
		
    }
}
