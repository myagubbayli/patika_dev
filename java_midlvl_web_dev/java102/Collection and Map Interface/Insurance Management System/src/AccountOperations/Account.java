package AccountOperations;

import Addresses.*;
import InsuranceOperations.Insurance;
import UserOperations.User;
import exception.InvalidAuthenticationException;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    protected Scanner scanner=new Scanner(System.in);
    private User user;
    private ArrayList<Individual> individualList;
    private AuthenticationStatus status = AuthenticationStatus.FAIL;

    enum AuthenticationStatus{
        FAIL,
        SUCCESS;
    }

    public Account(User user){
        this.user=user;
    }

    public void addAddress(){
        AddressManager.addAddress(this.user);
    }

    public void deleteAddress(){
        printAddresses();
        System.out.print("Type the id number of the address you want to delete: ");
        int id=scanner.nextInt();
        AddressManager.deleteAddress(user,id);
    }

    public void login(String email,String password,Account account) throws InvalidAuthenticationException {
        if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){
            status=AuthenticationStatus.SUCCESS;
        }
        else throw new InvalidAuthenticationException("Login failed.");
    }

    public final void showUserInfo(){
        System.out.println("Username surname: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail() + " Job: " + user.getJob());
        System.out.println("Age: " + user.getAge() + " Last Login: " + user.getLastEntry() + 
                           " Membership type: " + user.getMembership());
        printInsurances();
        printAddresses();
    }
    public void printAddresses(){
        for (Address address: user.getAddressList()){
            address.showAddressInfo();
        }
    }

    public void printInsurances(){
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Insurane type: " + insurance.getName() + ", Price: " + insurance.getPrice() +
                               ", Start date: " + insurance.getStartDate() + ", End date: " + insurance.getFinishDate());
        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}