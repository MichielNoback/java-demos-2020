package nl.bioinf.java_demos.lesson6;

//immutable
public class Address {
    private final String city;
    private final String street;
    private final int number;
    private final String zipCode;

    public Address(String city, String street, int number, String zipCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //if (o instanceof Address)
        Address address = (Address) o;

        if (number != address.number) return false;
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        return getZipCode() != null ? getZipCode().equals(address.getZipCode()) : address.getZipCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getCity() != null ? getCity().hashCode() : 0;
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        result = 31 * result + number;
        result = 31 * result + (getZipCode() != null ? getZipCode().hashCode() : 0);
        return result;
    }
}
