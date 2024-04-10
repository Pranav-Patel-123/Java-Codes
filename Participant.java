// Participant.java
public class Participant {
    private String name;
    private long contactNumber;
    private String branch;
    private String registrationId;
    private static long counter;

    static {
        counter = 1000L;
    }

    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        generateRegistrationId();
    }

    private void generateRegistrationId() {
        counter++;
        registrationId = "D" + counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}
