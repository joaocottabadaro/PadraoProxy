import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, User> users = new HashMap<>();

    public static User getUsuario(String password) {
        return users.get(password);
    }

    public static void addUser(User user) {
        users.put(user.getPasswordProxy(), user);
    }
}
