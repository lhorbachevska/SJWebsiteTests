package pages;

/**
 * Created by SJ on 18.01.2017.
 */
public class Data {
    public String email;
    public String password;
    public String name;
    public String confirmPassw;

    public Data (String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Data (String name, String email, String password, String confirmPassw){
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassw = confirmPassw;
    }
}
