
package airline.management.system;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Flight_Info extends JFrame{  

    private JTable table,table1;
    private JTextField textField;
    
    public static void main(String[] args){		 
	new Flight_Info().setVisible(true);    
    }
    
    public Flight_Info(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);

	JLabel FlightDetails = new JLabel("FLIGHT INFORMATION");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	FlightDetails.setForeground(new Color(100, 149, 237));
	FlightDetails.setBounds(160, 20, 570, 35);
	add(FlightDetails);
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnShow.setBounds(520, 20, 120, 30);
	add(btnShow);
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    conn c = new conn();
                    String str = "select * from sector";

                    ResultSet rs = c.s.executeQuery(str);

                    table.setModel(DbUtils.resultSetToTableModel(rs));	
  
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });

        table = new JTable();
        table.setBackground(Color.WHITE);
	table.setBounds(23, 100, 800, 400);
        
        JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 100, 800, 400);
        pane.setBackground(Color.WHITE);
        add(pane);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(850,600);
        setVisible(true);
        setLocation(210,30);
		
    }
}
