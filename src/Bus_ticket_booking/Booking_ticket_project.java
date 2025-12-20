package Bus_ticket_booking;

import java.util.*;

class Bus {
	String source;
	String destination;
	int busId;
	int totalSeats;
	int availableSeats;
	double price;

	public Bus(String source, String destination, int busId, int totalSeats, int availableSeats, double price) {

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

public class Booking_ticket_project {
	static ArrayList<Bus> busList = new ArrayList<>();

	public static void main(String args[]) {
		addBusData();
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("1.Show Buses");
				System.out.println("2. Book Ticket");
				System.out.println("3. Exit");

				System.out.println("Enter Your Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					showBusList();
					break;
				case 2:
					bookTicket();
					break;
				case 3:
					System.out.println(0);
					break;
				default:
					System.out.println("Invalid Choice");

				}
			}
		}

	}

	static void addBusData() {

		busList.add(new Bus("Pune", "Mumbai", 101, 20, 40, 500));
		busList.add(new Bus("Beed", "SambhajiNagar", 102, 40, 50, 600));
		busList.add(new Bus("Nagar", "Goa", 103, 20, 40, 700));
		busList.add(new Bus("Beed","Ambajogai",105,20,40,250.00));
	}

	static void showBusList() {

		System.out.println("------- Available Buses ---------");
		for (Bus b : busList) {
			System.out.println(b.busId + "|" + b.source + " -> " + b.destination + "| Seats: " + b.availableSeats
					+ "| Price: " + b.price);
		}
	}

	static void bookTicket() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Bus Id: ");
			int id = sc.nextInt();

			Bus selectedBus = null;
			for (Bus b : busList) {
				if (b.busId == id) {
					selectedBus = b;
					break;
				}
			}
			if (selectedBus == null) {
				System.out.println("Bust Not Found");
				return;
			}
			System.out.println("How many Sets to book: ");
			int seats = sc.nextInt();

			if (selectedBus.availableSeats < seats) {
				System.out.println("Seats Not Available");
				return;
			}
			ArrayList<Passenger> plist = new ArrayList<>();

			for (int i = 1; i <= seats; i++) {
				System.out.println("Peassenger " + i);
				sc.nextLine();
				
				System.out.println("Full Name: ");
				String name = sc.nextLine();
				
				System.out.println("Age: ");
				int age = sc.nextInt();
				
				System.out.println("Gender: ");
				String gender = sc.next();

				plist.add(new Passenger(name, age, gender));
			}
			selectedBus.availableSeats -= seats;
			double total = seats * selectedBus.price;

			System.out.println("⛳ Ticket Bookes Successfully");
			System.out.println("Total Amoumt: " + total);
		}
	}
}