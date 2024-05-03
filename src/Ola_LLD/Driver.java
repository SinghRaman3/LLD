package Ola_LLD;

public class Driver {
    private String name;
    private int rating;
    boolean availabilty = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean updateAvailabilty() {
        return availabilty = !availabilty;
    }
}
