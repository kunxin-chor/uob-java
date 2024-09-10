package Topic06_Exceptions;

// `Exception` is a checked exception: MUST BE SURROUNDED WITH try/catch
// to compile
class IllegalUserNameException extends Exception {
    public IllegalUserNameException(String message) {
        super(message);
    }
}

// does not have to be surrounded with try/catch to compile
class InvalidEmailAddress extends RuntimeException {

}

class User {
    private String userName;
    private String email;

    // define a default constructor if the class has a overloaded constructor
    public User() {
        
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }

    // when we use our custom exception, our method must
    // indicate that we may throw it
    public void setUserName(String userName) throws IllegalUserNameException {
        if (userName.length() < 7) {
            throw new IllegalUserNameException("User name must be at least 7 characters");
        }
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    // since InvalidEmailAddress extends from
    // RuntimeException, which is UNCHECK
    // we don't have to indicate the throws InvalidEmailAddress
    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new InvalidEmailAddress();
        }
        this.email = email;
    }
     
}

public class L05_CustomExceptions {
    public static void main(String[] args) {
        User u = new User();
        try {
            u.setUserName("ABC");
        } catch(IllegalUserNameException e) {
            System.out.println(e);
        }
       
        // no need to surround with try/catch
        // because setEmail might throw a InvalidEmailAddressException
        // which extends RuntimeException, therefore it is unchecked
        u.setEmail("ASD");


    }
}
