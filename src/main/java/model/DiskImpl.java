package model;

/**
 * Created by vasya on 05.04.2017.
 */
public class DiskImpl implements Disk{
    private String id;
    private String name;
    private User owner;

    public DiskImpl(String id, String name, User owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public DiskImpl(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public DiskImpl() {
    }
}
