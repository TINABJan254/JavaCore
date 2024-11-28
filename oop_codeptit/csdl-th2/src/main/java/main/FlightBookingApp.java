package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class FlightBookingApp {

    private Connection connect(){
        try {
            String host = "localhost",
                    port = "3306",
                    user = "root",
                    password = "123456",
                    name = "csdl_th2";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jbdc = "mysql";
            String url;
            url = String.format("jdbc:%s://%s:%s/%s", jbdc, host, port, name);
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect to database successfully!");
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("You haven't installed driver mysql");
            System.out.println(e.toString());
            throw new RuntimeException("MySQL driver not found!", e);
        } catch (SQLException e) {
            System.out.println("Failed to connect to database!");
            System.out.println(e.toString());
            throw new RuntimeException("Failed to connect to the database!", e);
        }
    }
    
    public void findFlights(String originCity, String destCity){
         String sql = "SELECT f.fid, f.year, m.month, f.day_of_month, w.day_of_week, c.name as carrier_name, f.flight_num, "
               + "f.origin_city, f.origin_state, f.dest_city, f.dest_state, f.departure_delay, f.taxi_out, f.arrival_delay, "
               + "f.canceled, f.actual_time, f.distance "
               + "FROM Flights f "
               + "JOIN Months m ON f.month_id = m.mid "
               + "JOIN Carriers c ON f.carrier_id = c.cid "
               + "JOIN Weekdays w ON f.day_of_week_id = w.did "
               + "WHERE f.origin_city = ? AND f.dest_city = ?";
        
        try {
            Connection conn = this.connect();
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, originCity);
            statement.setString(2, destCity);
            ResultSet rs = statement.executeQuery();
            
            System.out.println("\n-----------Result--------------");
            
            while (rs.next()) {
                System.out.println("Flight ID: " + rs.getInt("fid")
                                   + "\n Year: " + rs.getInt("year")
                                   + "\n Month: " + rs.getString("month")
                                   + "\n Day of Month: " + rs.getInt("day_of_month")
                                   + "\n Day of Week: " + rs.getString("day_of_week")
                                   + "\n Carrier: " + rs.getString("carrier_name")
                                   + "\n Flight Number: " + rs.getInt("flight_num")
                                   + "\n Origin City: " + rs.getString("origin_city")
                                   + "\n Origin State: " + rs.getString("origin_state")
                                   + "\n Destination City: " + rs.getString("dest_city")
                                   + "\n Destination State: " + rs.getString("dest_state")
                                   + "\n Departure Delay: " + rs.getDouble("departure_delay")
                                   + "\n Taxi Out: " + rs.getDouble("taxi_out")
                                   + "\n Arrival Delay: " + rs.getDouble("arrival_delay")
                                   + "\n Canceled: " + rs.getInt("canceled")
                                   + "\n Actual Time: " + rs.getDouble("actual_time")
                                   + "\n Distance: " + rs.getDouble("distance") + " miles");
                System.out.println("");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void bookingFlight(int customerId, int flightId){
        String sql = "INSERT INTO Bookings(customer_id, flight_id, booking_date, status) VALUES(?,?,?,?)";
       
        try {
            Connection conn = this.connect();
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, customerId);
            statement.setInt(2, flightId);
            statement.setDate(3, new java.sql.Date(System.currentTimeMillis()));
            statement.setString(4, "Confirmed");
            
            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Booking successful.");
            } else {
                System.out.println("Booking failed.");
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void viewBookings(int customerId){
        String sql = "SELECT * FROM Bookings "
                + "WHERE customer_id = ?";
        
        try {
            Connection conn = this.connect();
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, customerId);
            
            ResultSet rs = statement.executeQuery();
            
            System.out.println("\n-----------Result--------------");
            
            while (rs.next()){
                System.out.println("Booking ID: " + rs.getInt("booking_id"));
                System.out.println("Flight ID: " + rs.getInt("flight_id"));
                System.out.println("Booking date" + rs.getDate("booking_date"));
                System.out.println("");
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        FlightBookingApp app = new FlightBookingApp();
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("---------------------------------");
            System.out.println("|   1. Tim chuyen bay           |");
            System.out.println("|   2. Dat chuyen bay           |");
            System.out.println("|   3. Xem dat cho              |");
            System.out.println("|   4. Thoat khoi chuong trinh  |");
            System.out.println("---------------------------------");
            System.out.print("Vui long chon mot chuc nang: ");
            
            int choice = sc.nextInt();
            
            if (choice == 1){
                sc.nextLine();
                System.out.print("Nhap thanh pho bat dau: ");
                String origin = sc.nextLine();
                System.out.print("Nhap thanh pho den: ");
                String destination = sc.nextLine();
                app.findFlights(origin, destination);
                
            } else if (choice == 2){
                System.out.print("Nhap id khach hang: ");
                int customerId = sc.nextInt();
                System.out.print("Nhap id chuyen bay: ");
                int flightId = sc.nextInt();
                
                app.bookingFlight(customerId, flightId);
                
            } else if (choice == 3) {
                System.out.print("Nhap id khach hang: ");
                int customerId = sc.nextInt();
                app.viewBookings(customerId);
            } else {
                break;
            }
        }
        
    }
}   