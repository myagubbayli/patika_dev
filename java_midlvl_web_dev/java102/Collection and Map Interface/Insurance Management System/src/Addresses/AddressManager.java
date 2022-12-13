package Addresses;

import java.util.Scanner;
import UserOperations.User;

public class AddressManager {
   private static Scanner scanner=new Scanner(System.in);

    public static void addAddress(User user){
        Address newAddress;
        System.out.println("Add new address field");
        System.out.print("1- Home Address \n2- Work Address\nEnter the address selection: ");
        int address=scanner.nextInt();
        System.out.print("Enter city:");
        String city = scanner.next();
        System.out.print("Enter your district: ");
        String district = scanner.next();
        scanner.nextLine();
        System.out.print("Enter street: ");
        String street=scanner.nextLine();
        System.out.print("Please write the detailed address: ");
        String detailAddress= scanner.nextLine();
        if(address==1){
             newAddress=new HomeAddress(city,district,street,detailAddress);
        }
        else {
            newAddress = new BusinessAddress(city,district,street,detailAddress);
        }
        user.setAddressList(newAddress);
    }

    public static void deleteAddress(User user,int id){
        user.getAddressList().remove(id - 1);
        System.out.println("The deletion has taken place.");
    }
}