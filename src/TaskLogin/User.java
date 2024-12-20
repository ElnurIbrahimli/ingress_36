package TaskLogin;

public class User {
    private String firstName;
    private  String lastName;
    private int age;
    private String country;
    private String city;
    private String username;
    private final String email;
    private String password;
    private String phoneNumber;

    public User(String email) {
        this.email = email;
    }

    public User(String email, String firstName, String lastName, int age, String country, String city, String username, String password, String phoneNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.city = city;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


}
