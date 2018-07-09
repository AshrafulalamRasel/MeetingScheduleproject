package tr.com.jowl.utils;

/**
 * The GlobalController  Class
 *
 * @Ashraful Alam Rasel
 * @version 1.0
 * Date 7/10/2018.
 */
public enum TaskCategories {
    MEETING("MEETING"),
    PROJECT("PROJECT"),
    SHOPPING("SHOPPING"),
    LESSON("LESSON"),
    OUTDOOR("OUTDOOR");
    private String value;

    TaskCategories(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
