
/*
 * A student portal provides user to register their profile. 
 * During registration the system needs to validate the user should be located in India. 
 * If not the system should throw an exception.Step 
 * 1: Create a user defined exception class named “InvalidCountryException”.Step 
 * 2: Overload the respective constructors.Step 
 * 3: Create a main class “UserRegistration”, add the following method,void registerUser(String username,String userCountry) with the below implementation• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”• if userCountry is equal to “India”, print the message “User registration done successfully”Invoke the method registerUser from the main method with the data specified
 * 
 */

class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        // Test case 1: User in India
        try {
            registration.registerUser("Rashmi", "India");
        } catch (InvalidCountryException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test case 2: User outside India
        try {
            registration.registerUser("Robert", "Canada");
        } catch (InvalidCountryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
