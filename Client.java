import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client (int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<Account>();
    }

    public boolean addAccount(Account account){
        this.accounts.add(account);
        return true;
    }

    public boolean removeAccount(int accountId){
        for(Account account : accounts){
            if (account.getAccountId() == accountId){
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s= "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", accounts=" + accounts +
                '}';
        return s + accounts.toString();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}



