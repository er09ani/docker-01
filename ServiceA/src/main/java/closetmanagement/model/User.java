package closetmanagement.model;

public class User {
    String id;
    String name;
    String lastName;
    String emailId;
    UserType userType;
    Closet closet;

    public enum UserType {
        USER,
        ADMIN;
    }
}
