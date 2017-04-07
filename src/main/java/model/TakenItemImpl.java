package model;

/**
 * Created by vasya on 05.04.2017.
 */
public class TakenItemImpl implements TakenItem {
    private Disk disk;
    private User userWhoTaken;

    public TakenItemImpl(Disk disk, User userWhoTaken) {
        this.disk = disk;
        this.userWhoTaken = userWhoTaken;
    }

    public TakenItemImpl() {
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public User getUserWhoTaken() {
        return userWhoTaken;
    }

    public void setUserWhoTaken(User userWhoTaken) {
        this.userWhoTaken = userWhoTaken;
    }
}
