package tr.com.jowl.utils;

/**
 * The GlobalController  Class
 *
 * @Ashraful Alam Rasel
 * @version 1.0
 * Date 7/10/2018.
 */
public enum Status {
    ACTIVE("ACTIVE"), PASSIVE("PASSIVE");
    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}