package Addresses;

public class HomeAddress implements Address<HomeAddress>{
    private int addressId;
    private String city;
    private String district;
    private String street;
    private String addressDetails;

    public HomeAddress(String city, String district, String street, String addressDetails) {
        addressId = AddressId.id;
        this.city = city;
        this.district = district;
        this.street = street;
        this.addressDetails = addressDetails;
    }

    @Override
    public void showAddressInfo() {
        System.out.println("Home Address: ");
        System.out.println("Id: " + this.getAddressId() + "- City: " + this.getCity() +
                           ", District: " + this.getDistrict() + ", Street: " + this.getStreet());
        System.out.println("Detailed address: " + this.getAddressDetails());
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }
}
