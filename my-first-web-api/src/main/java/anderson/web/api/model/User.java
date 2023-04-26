package anderson.web.api.model;

public class User {
    private String login;
    private String password;
    private Number id;
    public User() {}
    public User(String login, String password, Number id) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id= " + id + '\'' +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
