package model;

/**
 * Created by vasya on 05.04.2017.
 */
public class UserImpl implements User{
    private int id;
    private String login;

    public UserImpl(int id, String name) {
        this.id = id;
        this.login = name;
    }

    public UserImpl() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
