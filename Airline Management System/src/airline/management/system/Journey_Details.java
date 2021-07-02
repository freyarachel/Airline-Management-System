
package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Journey_Details extends JFrame{  

    JTable table;
    JLabel ReservationDetails,Pnrno,Ticketid,Fcode,Jnydate,Jnytime,Source,Destination,label,label1;
    JButton Show;
    private JTextField textField;

    public static void main(String[] args){
        new Journey_Details();
    }
    
    public Journey_Details(){

        setTitle("JOURNEY_DETAILS");
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(null);
		
	JLabel Source = new JLabel("SOURCE");
	Source.setFont(new Font("Tahoma", Font.PLAIN, 19));
	Source.setBounds(60, 100, 150, 27);
	add(Source);
	
        JLabel Destination = new JLabel("DESTINATION");
	Destination.setFont(new Font("Tahoma", Font.PLAIN, 19));
	Destination.setBounds(350, 100, 150, 27);
	add(Destination);

	JButton Show = new JButton("SHOW");
	Show.setBounds(680, 100, 100, 30);
	add(Show);
	
	JLabel ReservationDetails = new JLabel("JOURNEY DETAILS");
	ReservationDetails.setForeground(Color.BLUE);
	ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ReservationDetails.setBounds(280, 27, 359, 31);
	add(ReservationDetails);

	String[] items1 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
	JComboBox comboBox = new JComboBox(items1);
	comboBox.setBounds(150, 100, 150, 27);
	add(comboBox);
	
	String[] items2 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
	JComboBox comboBox_1 = new JComboBox(items2);
	comboBox_1.setBounds(500, 100, 150, 27);
	add(comboBox_1);

	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		try{
                    String src  = (String) comboBox.getSelectedItem();
                    String dst  = (String) comboBox_1.getSelectedItem();
                    
                    conn c = new conn();
                    
                    String str = "select pnr_no,ticket_id,f_code,jny_date,jny_time,src,dst from reservation where src = '"+src+"' and dst = '"+dst+"'";
                    ResultSet rs=c.s.executeQuery(str);
                    
                    table.setModel(DbUtils.resultSetToTableModel(rs));

		}catch(Exception e){}
            }
	});
        
        table = new JTable();
        table.setBackground(Color.WHITE);
	table.setBounds(23, 300, 800, 300);
 
        JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 170, 800, 350);
        pane.setBackground(Color.WHITE);
        add(pane);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(860,600);
        setLocation(210,30);
	setVisible(true);
		
    }
}
