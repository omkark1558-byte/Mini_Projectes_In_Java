 package Bus_ticket_booking;

import java.util.*;

class Bus {
    String source, destination;
    int busId, totalSeats, availableSeats;
    double price;

    Bus(String source, String destination, int busId, int totalSeats, int availableSeats, double price) {
        this.source = source;
        this.destination = destination;
        this.busId = busId;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.price = price;
    }
}

class Passenger {
    String name;
    int age;
    String gender;

    Passenger(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Ticket {
    int ticketId;
    Bus bus;
    ArrayList<Passenger> passengers;
    double totalAmount;

    Ticket(int ticketId, Bus bus, ArrayList<Passenger> passengers, double totalAmount) {
        this.ticketId = ticketId;
        this.bus = bus;
        this.passengers = passengers;
        this.totalAmount = totalAmount;
    }
}

public class Booking_ticket_project {

    static ArrayList<Bus> busList = new ArrayList<>();
    static ArrayList<Ticket> ticketList = new ArrayList<>();
    static int ticketCounter = 1001;   // ✅ GLOBAL ticket counter
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        addBusData();

        while (true) {
            System.out.println("\n1. Show Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. Show Ticket Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBusList();
                    break;

                case 2:
                    bookTicket();
                    break;

                case 3:
                    showTicketDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using application!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addBusData() {
        busList.add(new Bus("Pune", "Mumbai", 101, 40, 40, 500));
        busList.add(new Bus("Beed", "SambhajiNagar", 102, 50, 50, 600));
        busList.add(new Bus("Nagar", "Goa", 103, 40, 40, 700));
    }

    static void showBusList() {
        System.out.println("\n---- Available Buses ----");
        for (Bus b : busList) {
            System.out.println(b.busId + " | " + b.source + " -> " + b.destination +
                    " | Seats: " + b.availableSeats + " | Price: " + b.price);
        }
    }

    static void bookTicket() {
        System.out.print("Enter Bus ID: ");
        int id = sc.nextInt();

        Bus selectedBus = null;
        for (Bus b : busList) {
            if (b.busId == id) {
                selectedBus = b;
                break;
            }
        }

        if (selectedBus == null) {
            System.out.println("Bus not found!");
            return;
        }

        System.out.print("Number of seats: ");
        int seats = sc.nextInt();

        if (seats <= 0 || seats > selectedBus.availableSeats) {
            System.out.println("Invalid seat count!");
            return;
        }

        ArrayList<Passenger> plist = new ArrayList<>();

        for (int i = 1; i <= seats; i++) {
            sc.nextLine();
            System.out.println("Passenger " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Gender: ");
            String gender = sc.next();

            plist.add(new Passenger(name, age, gender));
        }

        selectedBus.availableSeats -= seats;
        double total = seats * selectedBus.price;

        Ticket t = new Ticket(ticketCounter++, selectedBus, plist, total);
        ticketList.add(t);

        System.out.println("\n🎫 Ticket Booked Successfully!");
        System.out.println("Ticket ID: " + t.ticketId);
        System.out.println("Total Amount: " + total);
    }

    static void showTicketDetails() {
        if (ticketList.isEmpty()) {
            System.out.println("No tickets booked yet!");
            return;
        }

        for (Ticket t : ticketList) {
            System.out.println("\nTicket ID: " + t.ticketId);
            System.out.println("Route: " + t.bus.source + " -> " + t.bus.destination);
            System.out.println("Passengers:");
            for (Passenger p : t.passengers) {
                System.out.println(" - " + p.name + " | " + p.age + " | " + p.gender);
            }
            System.out.println("Total: " + t.totalAmount);
        }
    }
}
