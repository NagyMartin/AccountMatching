package org.example.service;

import lombok.Getter;
import lombok.Setter;
import org.example.model.Account;

import java.util.List;
@Getter
@Setter
public class LinkedAccountRulesService implements FieldMatcher{

    private Account account;
    private List<Account> accountList;


    public void linkedRule1(){
        int id = phoneNumberMatch();
        try{
            if(id == countryCodeMatch()){
                System.out.println("LR1 condition, found similar phone number and " +
                        "country code with account id: " + id);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void linkedRule5(){
        int id = nameMatch();
        try{
            if(id == lastNameMatch() && id == addressLineMatch() && id == postCodeMatch()){
                System.out.println("LR5 condition, found similar phone number and " +
                        "country code with account id: " + id);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int nameMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getName)
                    .anyMatch(name ->name.equals(account.getName()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int lastNameMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getLastName)
                    .anyMatch(lastName ->lastName.equals(account.getLastName()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int dateOfBirthMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getDateOfBirth)
                    .anyMatch(dateOfBirth -> dateOfBirth.equals(account.getDateOfBirth()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int phoneNumberMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getPhoneNumber)
                    .anyMatch(phoneNumber ->phoneNumber.equals(account.getPhoneNumber()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int countryCodeMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getCountryCode)
                    .anyMatch(countryCode ->countryCode.equals(account.getCountryCode()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int emailMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getEmail)
                    .anyMatch(email ->email.equals(account.getEmail()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int postCodeMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getPostCode)
                    .anyMatch(postCode ->postCode.equals(account.getPostCode()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int ipAddressMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getIpAddress)
                    .anyMatch(ipAddress ->ipAddress.equals(account.getIpAddress()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int addressLineMatch() {
        try {
            if(accountList.stream()
                    .map(Account::getAddressLine)
                    .anyMatch(addressLine -> addressLine.equals(account.getAddressLine()))){
                return account.getId();
            }
            else {
                return 0;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
