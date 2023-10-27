import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	    private HashMap<String, PhoneNUmber> book;

	    public PhoneBook() {
	        book = new HashMap<>();
	    }

	    public void addEntry(String name, String phoneNumber) {
	        PhoneNUmber newPhoneNumber = new PhoneNUmber(PhoneNUmber);
	        book.put(name, newPhoneNumber);
	    }

	    public PhoneNUmber lookUp(String name) {
	        return book.get(name);
	    }

	    public void printListings() {
	        for (Map.Entry<String, PhoneNUmber> entry : book.entrySet()) {
	            String name = entry.getKey();
	            PhoneNUmber phoneNumber = entry.getValue();
	            System.out.println(name + ": " + phoneNumber);
	        }
	    }

	    public void printAreaCode(String areaCode) {
	        for (Map.Entry<String, PhoneNUmber> entry : book.entrySet()) {
	            PhoneNUmber phoneNumber = entry.getValue();
	            if (phoneNumber.getAreaCode().equals(areaCode)) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        PhoneBook pb = new PhoneBook();
	        pb.addEntry("Frodo Baggins", "718-912-0807");
	        pb.addEntry("Bilbo Baggins", "303-476-3907");
	        pb.addEntry("Samwise Gamgee", "718-087-9136");
	        pb.addEntry("Peregrin Took", "718-555-1234");
	        pb.addEntry("Meriadoc Brandybuck", "442-967-1313");

	        pb.printListings();

	        System.out.println("\nBilbo: " + pb.lookUp("Bilbo Baggins"));

	        System.out.println("\nHobbits in 718:");
	        pb.printAreaCode("718");
	    }
	}

