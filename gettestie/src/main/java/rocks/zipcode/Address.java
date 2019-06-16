package rocks.zipcode;

public class Address implements Comparable<Address>{
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

    public int compareTo(Address other){
        int countryCompare = this.country.compareTo(other.country);
        if(countryCompare!=0)return countryCompare;
        int postalCompare = this.postCode.compareTo(other.postCode);
        if(postalCompare!=0)return postalCompare;
        int townCompare = this.town.compareTo(other.town);
        if(townCompare!=0)return townCompare;
        return this.street.compareTo(other.street);
    }
}
