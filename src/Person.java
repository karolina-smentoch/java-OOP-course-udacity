public class Person {
    // Fields:
    private String userName;
    private String SSN;

    // PRIVATE method = HELPER method - can be only seen and called by the same class
    private String getID() {
        return SSN + "-" + userName;
    }

    // Two PUBLIC methods - actions that the class can perform, the rest of the program can see and call
    public String getUserName() {
        return userName;
    }

    public boolean isSamePerson(Person p) {
        if (p.getID().equals(this.getID())) {
            return true;
        } else {
            return false;
        }
    }
}
