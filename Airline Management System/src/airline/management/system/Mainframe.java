
package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel AirlineManagementSystem = new JLabel("WELCOME!");
	AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 40));
	AirlineManagementSystem.setBounds(240, 150, 1000, 55);
	add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
        JMenu FlightDetails = new JMenu("FLIGHT_DETAILS   ");
        FlightDetails.setForeground(Color.BLUE);
	menuBar.add(FlightDetails);
        
        JMenuItem InsertFlightDetails = new JMenuItem("Insert");
	FlightDetails.add(InsertFlightDetails);
        
        JMenuItem UpdateFlightDetails = new JMenuItem("Modify");
	FlightDetails.add(UpdateFlightDetails);
        
        JMenuItem ViewFlightDetails = new JMenuItem("View");
	FlightDetails.add(ViewFlightDetails);
        
        JMenuItem DeleteFlightDetails = new JMenuItem("Delete");
	FlightDetails.add(DeleteFlightDetails);
		
	JMenu PassengerDetails = new JMenu("PASSENGER_DETAILS   ");
        PassengerDetails.setForeground(Color.BLUE);
	menuBar.add(PassengerDetails);
        
        JMenuItem SubmitPassengerDetails = new JMenuItem("Insert");
	PassengerDetails.add(SubmitPassengerDetails);
        
        JMenuItem UpdatePassengerDetails = new JMenuItem("Modify");
	PassengerDetails.add(UpdatePassengerDetails);
        
        JMenuItem DeletePassengerDetails = new JMenuItem("Delete");
	PassengerDetails.add(DeletePassengerDetails);
        
        JMenuItem ViewPassengerDetails = new JMenuItem("View");
	PassengerDetails.add(ViewPassengerDetails);

        JMenu PaymentDetails = new JMenu("PAYMENT_DETAILS   ");
        PaymentDetails.setForeground(Color.BLUE);
	menuBar.add(PaymentDetails);
        
        JMenuItem SubmitPaymentDetails = new JMenuItem("Insert");
	PaymentDetails.add(SubmitPaymentDetails);
        
        JMenuItem UpdatePaymentDetails = new JMenuItem("Modify");
	PaymentDetails.add(UpdatePaymentDetails);
        
        JMenuItem ViewPaymentDetails = new JMenuItem("View");
	PaymentDetails.add(ViewPaymentDetails);	
        
        JMenuItem DeletePaymentDetails = new JMenuItem("Delete");
	PaymentDetails.add(DeletePaymentDetails);
	
        JMenu ReservationDetails = new JMenu("RESERVATION_DETAILS");
        ReservationDetails.setForeground(Color.BLUE);
	menuBar.add(ReservationDetails);
        
        JMenuItem SubmitReservationDetails = new JMenuItem("Insert");
	ReservationDetails.add(SubmitReservationDetails);
        
        JMenuItem UpdateReservationDetails = new JMenuItem("Modify");
	ReservationDetails.add(UpdateReservationDetails);
        
        JMenuItem ViewReservationDetails = new JMenuItem("View");
	ReservationDetails.add(ViewReservationDetails);
        
        JMenuItem DeleteReservationDetails = new JMenuItem("Delete");
	ReservationDetails.add(DeleteReservationDetails);
       
	ViewFlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
        InsertFlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Insert_Flight_Info();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        UpdateFlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Update_Flight_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});

        DeleteFlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Delete_Flight();
            }
	});
        
	SubmitPassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        UpdatePassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Update_Passenger_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        ViewPassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Passenger_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
        
        DeletePassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Delete_Passenger();
            }
	});
        
        SubmitPaymentDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Form();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        UpdatePaymentDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Update_Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        ViewPaymentDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
        
        DeletePaymentDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Delete_Payment();
            }
	});
        
        SubmitReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Ticket_Reservation();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        UpdateReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Update_Journey_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        ViewReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        DeleteReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Delete_Reservation();
            }
	});
	
        setSize(700,500);
        setLocation(285,100);
	setVisible(true);
    }
}
