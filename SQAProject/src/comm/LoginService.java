package comm;
import java.util.HashMap;
import java.util.Map;

public class LoginService {
    private final Map<String, String> users = new HashMap<>();

    public LoginService() {
        users.put("admin", "12345");
        users.put("user", "password");
    }

    public boolean login(String username, String password) {
        if (username == null || password == null) return false;
        return password.equals(users.get(username));
    }
}
