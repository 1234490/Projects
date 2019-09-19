import java.util.*;

class Customer {
	private String _name;
	private String _address;
	private String _creditCardNumber;
	private int _bags;
	private int _reservationNumber;
	private boolean _reservationStatus; // True is ongoing, false if cancelled.
	private int _busNumber;
	private String _fareType;
	private double _bagCost;
	private double _totalCost;
	

	public Customer(String _name, String _address, String _creditCardNumber, int _bags, int _reservationNumber,
			boolean _reservationStatus, int _busNumber, String _fareType) {
		super();
		this._name = _name;
		this._address = _address;
		this._creditCardNumber = _creditCardNumber;
		this._bags = _bags;
		this._reservationNumber = _reservationNumber;
		this._reservationStatus = _reservationStatus;
		this._busNumber = _busNumber;
		this._fareType = _fareType;
		this._bagCost = 0;
		this._totalCost = 0;
	}
	
	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * @param _name the _name to set
	 */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * @return the _address
	 */
	public String get_address() {
		return _address;
	}
	/**
	 * @param _address the _address to set
	 */
	public void set_address(String _address) {
		this._address = _address;
	}
	/**
	 * @return the _creditCardNumber
	 */
	public String get_creditCardNumber() {
		return _creditCardNumber;
	}
	/**
	 * @param _creditCardNumber the _creditCardNumber to set
	 */
	public void set_creditCardNumber(String _creditCardNumber) {
		this._creditCardNumber = _creditCardNumber;
	}
	/**
	 * @return the _bags
	 */
	public int get_bags() {
		return _bags;
	}
	/**
	 * @param _bags the _bags to set
	 */
	public void set_bags(int _bags) {
		this._bags = _bags;
	}
	/**
	 * @return the _reservationNumber
	 */
	public int get_reservationNumber() {
		return _reservationNumber;
	}
	/**
	 * @param _reservationNumber the _reservationNumber to set
	 */
	public void set_reservationNumber(int _reservationNumber) {
		this._reservationNumber = _reservationNumber;
	}
	/**
	 * @return the _reservationStatus
	 */
	public boolean is_reservationStatus() {
		return _reservationStatus;
	}
	/**
	 * @param _reservationStatus the _reservationStatus to set
	 */
	public void set_reservationStatus(boolean _reservationStatus) {
		this._reservationStatus = _reservationStatus;
	}
	/**
	 * @return the _busNumber
	 */
	public int get_busNumber() {
		return _busNumber;
	}

	/**
	 * @param _busNumber the _busNumber to set
	 */
	public void set_busNumber(int _busNumber) {
		this._busNumber = _busNumber;
	}

	/**
	 * @return the _fareType
	 */
	public String get_fareType() {
		return _fareType;
	}
	/**
	 * @param _fareType the _fareType to set
	 */
	public void set_fareType(String _fareType) {
		this._fareType = _fareType;
	}
	/**
	 * @return the _bagCost
	 */
	public double get_bagCost() {
		return _bagCost;
	}
	/**
	 * @param _bagCost the _bagCost to set
	 */
	public void set_bagCost(double _bagCost) {
		this._bagCost = _bagCost;
	}
	/**
	 * @return the _totalCost
	 */
	public double get_totalCost() {
		return _totalCost;
	}
	/**
	 * @param _totalCost the _totalCost to set
	 */
	public void set_totalCost(double _totalCost) {
		this._totalCost = _totalCost;
	}

	
	@Override
	public String toString() {
		return "Customer [_name=" + _name + ", _address=" + _address + ", _creditCardNumber=" + _creditCardNumber
				+ ", _bags=" + _bags + ", _reservationNumber=" + _reservationNumber + ", \n_reservationStatus="
				+ _reservationStatus + ", _busNumber=" + _busNumber + ", _fareType=" + _fareType + ", _bagCost="
				+ _bagCost + ", _totalCost=" + _totalCost + "]";
	}
}

class Trip {
	private int _reservationNumber;
	private int _tripDay;
	private int _tripMonth;
	private int _tripYear;
	private int _busNumber;
	private int _seatNumber;
	
	public Trip(int _reservationNumber, int _tripDay, int _tripMonth, int _tripYear, int _busNumber, int _seatNumber) {
		super();
		this._reservationNumber = _reservationNumber;
		this._tripDay = _tripDay;
		this._tripMonth = _tripMonth;
		this._tripYear = _tripYear;
		this._busNumber = _busNumber;
		this._seatNumber = _seatNumber;
	}
	
	/**
	 * @return the _reservationNumber
	 */
	public int get_reservationNumber() {
		return _reservationNumber;
	}
	/**
	 * @param _reservationNumber the _reservationNumber to set
	 */
	public void set_reservationNumber(int _reservationNumber) {
		this._reservationNumber = _reservationNumber;
	}
	/**
	 * @return the _tripDay
	 */
	public int get_tripDay() {
		return _tripDay;
	}
	/**
	 * @param _tripDay the _tripDay to set
	 */
	public void set_tripDay(int _tripDay) {
		this._tripDay = _tripDay;
	}
	/**
	 * @return the _tripMonth
	 */
	public int get_tripMonth() {
		return _tripMonth;
	}
	/**
	 * @param _tripMonth the _tripMonth to set
	 */
	public void set_tripMonth(int _tripMonth) {
		this._tripMonth = _tripMonth;
	}
	/**
	 * @return the _tripYear
	 */
	public int get_tripYear() {
		return _tripYear;
	}
	/**
	 * @param _tripYear the _tripYear to set
	 */
	public void set_tripYear(int _tripYear) {
		this._tripYear = _tripYear;
	}
	/**
	 * @return the _busNumber
	 */
	public int get_busNumber() {
		return _busNumber;
	}
	/**
	 * @param _busNumber the _busNumber to set
	 */
	public void set_busNumber(int _busNumber) {
		this._busNumber = _busNumber;
	}

	/**
	 * @return the _seatNumber
	 */
	public int get_seatNumber() {
		return _seatNumber;
	}

	/**
	 * @param _seatNumber the _seatNumber to set
	 */
	public void set_seatNumber(int _seatNumber) {
		this._seatNumber = _seatNumber;
	}

	@Override
	public String toString() {
		return "Trip [_reservationNumber=" + _reservationNumber + ", _tripDay=" + _tripDay + ", _tripMonth="
				+ _tripMonth + ", _tripYear=" + _tripYear + ", _busNumber=" + _busNumber + ", _seatNumber="
				+ _seatNumber + "]";
	}
}

class Bus {
	private String _busType;
	private double _premiumFare;
	private double _businessFare;
	private double _coachFare;
	private double _pricePerBag;
	private int _busNumber;
	private int _numSeats;
	private HashMap<Integer, Boolean> _seatMap;
	
	public Bus(String _busType, int _busNumber, int _numSeats, HashMap<Integer, Boolean> _seatMap) {
		super();
		this._busType = _busType;
		
		if (_busType.equals("Rocket")) {
			this._premiumFare = 50.00;
			this._businessFare = 35.00;
			this._coachFare = 20.00;
			this._pricePerBag = 7.00;
		} else {
			this._premiumFare = 100.00;
			this._businessFare = 70.00;
			this._coachFare = 50.00;
			this._pricePerBag = 15.00;
		}
		
		this._busNumber = _busNumber;
		this._numSeats = _numSeats;
		this._seatMap = _seatMap;
	}

	
	/**
	 * @return the _busType
	 */
	public String get_busType() {
		return _busType;
	}

	/**
	 * @param _busType the _busType to set
	 */
	public void set_busType(String _busType) {
		this._busType = _busType;
	}

	/**
	 * @return the _premiumFare
	 */
	public double get_premiumFare() {
		return _premiumFare;
	}

	/**
	 * @param _premiumFare the _premiumFare to set
	 */
	public void set_premiumFare(double _premiumFare) {
		this._premiumFare = _premiumFare;
	}

	/**
	 * @return the _businessFare
	 */
	public double get_businessFare() {
		return _businessFare;
	}

	/**
	 * @param _businessFare the _businessFare to set
	 */
	public void set_businessFare(double _businessFare) {
		this._businessFare = _businessFare;
	}

	/**
	 * @return the _coachFare
	 */
	public double get_coachFare() {
		return _coachFare;
	}

	/**
	 * @param _coachFare the _coachFare to set
	 */
	public void set_coachFare(double _coachFare) {
		this._coachFare = _coachFare;
	}
	/**
	 * @return the _pricePerBag
	 */
	public double get_pricePerBag() {
		return _pricePerBag;
	}

	/**
	 * @param _pricePerBag the _pricePerBag to set
	 */
	public void set_pricePerBag(double _pricePerBag) {
		this._pricePerBag = _pricePerBag;
	}

	/**
	 * @return the _busNumber
	 */
	public int get_busNumber() {
		return _busNumber;
	}

	/**
	 * @param _busNumber the _busNumber to set
	 */
	public void set_busNumber(int _busNumber) {
		this._busNumber = _busNumber;
	}

	/**
	 * @return the _numSeats
	 */
	public int get_numSeats() {
		return _numSeats;
	}

	/**
	 * @param _numSeats the _numSeats to set
	 */
	public void set_numSeats(int _numSeats) {
		this._numSeats = _numSeats;
	}

	/**
	 * @return the _seatMap
	 */
	public HashMap<Integer, Boolean> get_seatMap() {
		return _seatMap;
	}

	/**
	 * @param _seatMap the _seatMap to set
	 */
	public void set_seatMap(HashMap<Integer, Boolean> _seatMap) {
		this._seatMap = _seatMap;
	}


	
	@Override
	public String toString() {
		return "Bus [_busType=" + _busType + ", _premiumFare=" + _premiumFare + ", _businessFare=" + _businessFare
				+ ", _coachFare=" + _coachFare + ", _pricePerBag=" + _pricePerBag + ", _busNumber=" + _busNumber
				+ ", _numSeats=" + _numSeats + ", _seatMap=" + _seatMap + "]";
	}
}

public class SimpleJavaProject {
	static ArrayList<Customer> customers = new ArrayList<Customer>();
	static ArrayList<Trip> trips = new ArrayList<Trip>();
	static ArrayList<Bus> buses = new ArrayList<Bus>();
	static int reservationNumber = 1;
	
	/**
	 *  Create a new customer and trip from the user's input.
	 */
	public static void createUserCustomerAndTrip() {
		Scanner cUScan = new Scanner(System.in);
		/* GET CUSTOMER INFORMATION */
		// Customer name.
		System.out.println("Enter a name: ");
		String name = "";
		name = cUScan.nextLine();
		
		// Customer address.
		System.out.println("Enter an address: ");
		String address = "";
		address = cUScan.nextLine();
		
		// Customer credit card number
		System.out.println("Enter a credit card number (no dashes): ");
		String creditCardNumber = "";
		creditCardNumber = cUScan.nextLine();
		
		// Customer bag number
		System.out.println("Enter the number of bags (max 5): ");
		int bags = -1;
		while (true) {
			try {
				bags = cUScan.nextInt();
				
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
			
			if (0 <= bags && bags <= 5) {
				break;
			} else {
				System.out.println("Please enter an integer between 0-5");
				
				continue;
			}
		}
		
		// Customer bus number
		System.out.println("Pick a bus (504 for Rocket and 787 for Deluxe)");
		int busNumber = -1;
		while (true) {
			try {
				busNumber = cUScan.nextInt();
				
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
			
			if (busNumber == 504 || busNumber == 787) {
				break;
			} else {
				System.out.println("Please enter either 504 or 787");
				
				continue;
			}
		}
		
		// Customer fare type.
		System.out.println("Enter a fareType (P for premium, B for business, or C for coach)");
		String fareType = "";
		while (true) {
			fareType = cUScan.nextLine();
			fareType = fareType.toUpperCase();
			
			if (fareType.equals("P") || fareType.equals("B") || fareType.equals("C")) {
				break;
			} else {
				System.out.println("Please enter either P, B, C");
				
				continue;
			}
		}
		
		// Customer created.
		Customer newUserCustomer = new Customer(name, address, creditCardNumber, bags,
			reservationNumber, true, busNumber, fareType);
		
		/* GET TRIP INFORMATION */
		// Trip day.
		System.out.println("Enter only the numbered day of the trip: ");
		int tripDay = -1;
		while (true) {
			try {
				tripDay = cUScan.nextInt();
				
				break;
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
		}
		
		// Trip month.
		System.out.println("Enter only the numbered month of the trip: ");
		int tripMonth = -1;
		while (true) {
			try {
				tripMonth = cUScan.nextInt();
				
				break;
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
		}
		
		// Trip year.
		System.out.println("Enter only the numbered year of the trip: ");
		int tripYear = -1;
		while (true) {
			try {
				tripYear = cUScan.nextInt();
				
				break;
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
		}
		
		// Trip seat number.
		System.out.println("Enter an available seat number from the given map: ");
		HashMap<Integer, Boolean> seatMap = null;
		int busI = -1;
		for (int i = 0; i < buses.size(); i++) {
			if (buses.get(i).get_busNumber() == busNumber) {
				seatMap = buses.get(i).get_seatMap();
				busI = i;
			}
		}
		System.out.println(seatMap);
		int seatNumber = -1;
		while (true) {
			try {
				seatNumber = cUScan.nextInt();
			} catch (Exception e) {
				System.out.println("Integers only.");
				cUScan.nextLine();
				
				continue;
			}
			
			if (seatNumber < 1 || seatNumber >= seatMap.size() || seatMap.get(seatNumber) == false) {
				System.out.println("Invalid choice. Please pick again.");
				
				continue;
			} else {
				buses.get(busI).get_seatMap().put(seatNumber, false);
				
				break;
			}
		}
		
		// New trip created.
		Trip newUserTrip = new Trip(reservationNumber, tripDay, tripMonth, tripYear, busNumber, seatNumber);
		
		// Adding newUserCustomer and newUserTrip to the others.
		customers.add(newUserCustomer);
		trips.add(newUserTrip);
		reservationNumber++;
		// Print out all customers and trips.
		System.out.println(customers);
		System.out.println(trips + "\n");
	}
	
	/**
	 * Allows the user to change their reservation status.
	 */
	public static void changeReservationStatus() {
		Scanner choose = new Scanner(System.in);
		System.out.println(customers + "\nChoose user by reservation number");
		int rN = -1;
		
		while (true) {
			try {
				rN = choose.nextInt();
			} catch (Exception e) {
				System.out.println("Integers only.");
				choose.nextLine();	
				
				continue;
			}
			
			boolean notFound = true;
			
			for (int i = 0; i < customers.size(); i++) {
				if (customers.get(i).get_reservationNumber() == rN) {
					notFound = false;
					customers.get(i).set_reservationStatus(!customers.get(i).is_reservationStatus());
					System.out.println("Reservation changed from " + !customers.get(i).is_reservationStatus() +
						" to " + customers.get(i).is_reservationStatus());
					
					int seatNumber = trips.get(customers.get(i).get_reservationNumber() - 1).get_seatNumber();
					
					for (int j = 0; j < buses.size(); j++) {
						if (buses.get(j).get_busNumber() == customers.get(i).get_busNumber()) {
							if (customers.get(i).is_reservationStatus()) {
								Boolean temp = buses.get(j).get_seatMap().put(seatNumber, false);
							} else {
								Boolean temp = buses.get(j).get_seatMap().put(seatNumber, true);
							}
						}
					}
					
					break;
				}
			}
			
			if (notFound) {
				System.out.println("Chosen reservation number is not assigned to a customer.");
				
				continue;
			} else {
				break;
			}
		}
	}
	
	/**
	 *  Calculates every customer's bag cost and total cost.
	 */
	public static void calculateTotal(ArrayList<Customer> c, ArrayList<Bus> b) {
		for (int i = 0; i < c.size(); i++) { // Loop through every customer.
			double fareCost = -1; // Depends on customer's fareType and bus's fare costs.
			double pricePerBagCost = -1; // Depends on bus's pricePerBag cost.
			
			for (int j = 0; j < b.size(); j++) { // Find the correct bus.
				if (b.get(j).get_busNumber() == c.get(i).get_busNumber()) {
					if (c.get(i).get_fareType().equals("Premium")) {
						fareCost = b.get(j).get_premiumFare();
					} else if (c.get(i).get_fareType().equals("Business")) {
						fareCost = b.get(j).get_businessFare();
					} else  {
						fareCost = b.get(j).get_coachFare();
					}
					
					pricePerBagCost = b.get(j).get_pricePerBag();
				}
			}
			
			c.get(i).set_bagCost(pricePerBagCost * c.get(i).get_bags());
			c.get(i).set_totalCost(c.get(i).get_bagCost() + fareCost);
			System.out.println("\nCustomer Name: " + c.get(i).get_name() +
				"\nBags: " + c.get(i).get_bags() + "\nBag Cost: " + c.get(i).get_bagCost() +
				"\nTotal Cost: " + c.get(i).get_totalCost());
		}
	}
	
	public static void main(String[] args) {
		// Hard-coded Buses.
		HashMap<Integer, Boolean> rocketSeatMap = new HashMap<Integer, Boolean>();
		HashMap<Integer, Boolean> deluxeSeatMap = new HashMap<Integer, Boolean>();
		
		for (int i = 1; i <= 10; i++) { // Fill up seat map.
			rocketSeatMap.put(i, i % 3 == 0 ? false : true); // Decide to make some seats unavailable.
			deluxeSeatMap.put(i, i % 2 == 0 ? false : true);
		}
		
		Bus rocket = new Bus("Rocket", 504, 10, rocketSeatMap);
		Bus deluxe = new Bus("Deluxe", 787, 10, deluxeSeatMap);
		buses.add(rocket);
		buses.add(deluxe);
		
		// Hard-coded example customers.
		Customer cust1 = new Customer("John Doe", "Address 100", "123-456-789", 5, reservationNumber, true, 787, "Premium");
		Trip trip1 = new Trip(reservationNumber, 9, 10, 2019, 504, 1);
		customers.add(cust1);
		trips.add(trip1);
		buses.get(1).get_seatMap().put(1, false);
		reservationNumber++;
		
		Customer cust2 = new Customer("Susan Smith", "Address 200", "111-456-789", 2, reservationNumber, true, 504, "Business");
		Trip trip2 = new Trip(reservationNumber, 11, 22, 2019, 787, 7);
		customers.add(cust2);
		trips.add(trip2);
		buses.get(0).get_seatMap().put(7, false);
		reservationNumber++;
		
		while (true) { // Continuously get user input
			Scanner in = new Scanner(System.in);
			System.out.println("\nPress a number to choose an option:\n1) Enter new customer and trip" +
				"\n2) Show bus seat maps\n3) Change reservation status\n4) Get total charges" + 
				"\n5) Show all customers\n6) Show all trips\n7) Show all buses\n8) Quit");
			int choice = -1;
			
			while (true) {
				choice = in.nextInt();
				
				if (1 <= choice && choice <= 8) {
					break;
				} else {
					System.out.println("Please enter an integer between 1-8");
					
					continue;
				}
			}
				
			switch(choice) {
				case 1:
					createUserCustomerAndTrip();
					
					break;
				case 2:
					for (int i = 0; i < buses.size(); i++) {
						System.out.println("Bus: " + buses.get(i).get_busType() +
							"\nBus Seat Map:\n" + buses.get(i).get_seatMap());
					}
					
					break;
				case 3:
					changeReservationStatus();
					
					break;
				case 4:
					calculateTotal(customers, buses);
					
					break;
				case 5:
					System.out.println(customers);
					
					break;
				case 6:
					System.out.println(trips);
					
					break;
				case 7:
					System.out.println(buses);
					
					break;
				case 8:
					System.out.println("Program terminated.");
					System.exit(0);
				default:
			}
		}
	}
}