public class AddressValue {
    String city;
    String street;
    String houseNumber;
    int flatNumber;

    public AddressValue(String city, String street, String houseNumber, int flatNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    String getCity(){
        return city;
    }

    String getStreet(){
        return street;
    }

    String getHouseNumber(){
        return houseNumber;
    }

    int getflatNumber(){
        return flatNumber;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        AddressValue percen = (AddressValue) obj;

        return this.flatNumber == percen.flatNumber &&
        this.city.equals(percen.city) &&
        this.street.equals(percen.street) &&
        this.houseNumber.equals(percen.houseNumber);
    }

    @Override
    public String toString() {
        return String.format("Address: %s, %s, %s, Apartment %d", 
                              city, street, houseNumber, flatNumber);
    }

}
