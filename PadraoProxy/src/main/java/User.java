import java.util.Arrays;
import java.util.List;

public class User implements  IUser {

    private String password;
    private String passwordProxy;


    public User(String password) {
        this.password = password;
        this.passwordProxy = "1234";
    }


    public User(String password, String passwordProxy) {
        this.password = password;
        this.passwordProxy = passwordProxy;
    }



    public String getPasswordProxy() {
        return passwordProxy;
    }

    public void setPasswordProxy(String passwordProxy) {
        this.passwordProxy = passwordProxy;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public List<String> getInfo() {
        return Arrays.asList(this.password, this.passwordProxy);
    }

    @Override
    public Double withdrawMoney(Bank bank) {
        return bank.getMoney();
    }

}
