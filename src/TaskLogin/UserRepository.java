package TaskLogin;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public  final List<User> users;

    public UserRepository(List<User> users) {
        this.users = new ArrayList<>();
    }
}
