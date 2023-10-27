
public class PhoneNUmber {
	
    private String areaCode; // first 3 digits
    private String prefix; // next 3 digits
    private String number; // last 4 digits

    public void PhoneNumber(String phoneNumber) {
        String[] parts = phoneNumber.split("-");
        if (parts.length == 3) {
            areaCode = parts[0];
            prefix = parts[1];
            number = parts[2];
        } else {
            // Handle invalid input
            System.err.println("Invalid phone number format: " + phoneNumber);
        }
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return "(" + areaCode + ") " + prefix + "-" + number;
    }

    public static void main(String[] args) {
        PhoneNUmber n = new PhoneNUmber("818-555-1234");
        System.out.println("Area code: " + n.getAreaCode());
        System.out.println(n);
    }
}

}
