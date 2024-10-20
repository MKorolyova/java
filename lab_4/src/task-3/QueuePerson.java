public class QueuePerson {
    private String lastName;
    private String firstName;
    private String midleName;
    private AddressValue address;
    private int priority;

    public QueuePerson(String lastName, String firstName, String midleName, AddressValue address, int priority){
        this.lastName = lastName;
        this.firstName = firstName;
        this.midleName = midleName;
        this.address = address;
        this.priority = priority;

    }
    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMidleName(){
        return midleName;
    }

    public AddressValue getAddress(){
        return address;
    }

    public int getPriority(){
        return priority;
    }
    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        QueuePerson person = (QueuePerson) obj;

        return this.priority == person.priority &&
        this.lastName.equals(person.lastName) &&
        this.firstName.equals(person.firstName) &&
        this.midleName.equals(person.midleName) &&
        this.address.equals(person.address);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + midleName + " (" + address + "), Priority: " + priority;
    }

  
}
