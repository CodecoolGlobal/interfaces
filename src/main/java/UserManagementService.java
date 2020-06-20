import java.util.ArrayList;
import java.util.List;

public class UserManagementService {

    private UserDAO userDAO;

    public UserManagementService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getUsersFromGivenCity(String city) {
        List<User> users = userDAO.getUsers();
        /**
         * Data processsing...
         */

        return new ArrayList<>();
    }

}
