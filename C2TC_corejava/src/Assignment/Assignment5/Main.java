package Assignment.Assignment5;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] ticketDetails = sc.nextLine().split(",");
	        String stageEvent = ticketDetails[0].trim();
	        String customer = ticketDetails[1].trim();
	        int noOfSeats = Integer.parseInt(ticketDetails[2].trim());

	        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

	        int choice = Integer.parseInt(sc.nextLine());

	        switch (choice) {
	            case 1:
	                double amountCash = Double.parseDouble(sc.nextLine());
	                booking.displayDetails();
	                booking.makePayment(amountCash);
	                break;

	            case 2:
	                double amountWallet = Double.parseDouble(sc.nextLine());
	                String walletNumber = sc.nextLine().trim();
	                booking.displayDetails();
	                booking.makePayment(amountWallet, walletNumber);
	                break;

	            case 3:
	                String holderName = sc.nextLine().trim();
	                double amountCard = Double.parseDouble(sc.nextLine());
	                String creditCardType = sc.nextLine().trim();
	                String ccv = sc.nextLine().trim();
	                booking.displayDetails();
	                booking.makePayment(holderName, amountCard, creditCardType, ccv);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}



