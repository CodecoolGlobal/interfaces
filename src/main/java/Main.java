import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Credit loan = new Loan(1000000);
        Credit mortage = new Mortage(20000000);

        int totalValueOfCredit = loan.getTotalValueOfCredit();


        UserDAO userCSVDao = new UserCSVDao();
        UserDAO userSQLDao = new UserSQLDao();


        UserManagementService userManagementService = new UserManagementService(userSQLDao);


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
    }
}
