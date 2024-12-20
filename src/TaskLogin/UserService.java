package TaskLogin;

public class UserService {

    private final UserRepository userRepository;
    private final String encryptionKey;


    public UserService(UserRepository userRepository, String encryptionKey) {
        this.userRepository = userRepository;
        this.encryptionKey = encryptionKey;
    }

    private String encryptPassword(String password) {
        return password + encryptionKey;
    }

    private String decryptPassword(String encryptedPassword) {
        return encryptedPassword.replace(encryptionKey, "");
    }

    

}

