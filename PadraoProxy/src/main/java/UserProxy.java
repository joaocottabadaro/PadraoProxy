import java.util.List;

public class UserProxy implements IUser{

    private User user;
    private String password;

    public UserProxy(String password) {
        this.password = password;
    }

    public List<String> getInfo() {
        if(this.user == null) {
            this.user = new User(this.password);
        }
        return this.user.getInfo();
    }

    @Override
    public Double withdrawMoney(Bank bank) {
        if(this.user == null) {
            this.user = new User(this.password);
        }

        if(bank.getPassword() != this.user.getPasswordProxy()) {
            throw new IllegalArgumentException("Acesso negado.");
        }
        return this.user.withdrawMoney(bank);
    }
}
