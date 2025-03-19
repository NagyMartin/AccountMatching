package org.example.service;

import lombok.Getter;
import lombok.Setter;
import org.example.model.Account;

import java.util.List;
@Getter
@Setter
public class MatchingRulesService implements FieldMatcher{

    private Account account;
    private List<Account> accountList;


    public int matchingRule1(){
        int id = emailMatch();
        try{
            if(id != 0){
                System.out.println("MR1 condition, found similar email with account id: " + id);
            }else{
                return 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }return id;
    }
    public int matchingRule2(){
        int id = phoneNumberMatch();
        try{
            if(id == dateOfBirthMatch() && id == lastNameMatch()){
                System.out.println("MR2 condition, found similar last name, phone number and " +
                        "date of birth with account id: " + id);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }return id;
    }
    public int matchingRule3(){
        int id = dateOfBirthMatch();
        try{
            if(id == nameMatch() && id == lastNameMatch() && id == postCodeMatch()){
                System.out.println("MR3 condition, found similar name, last name and " +
                        "post code with account id: " + id);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }return id;
    }
    public int matchingRule4(){
        int id = dateOfBirthMatch();
        try{
            if(id == countryCodeMatch() && id == addressLineMatch() && id == emailMatch()){
                System.out.println("MR4 condition, found similar date of birth," +
                        " country code, address and email with account id: " + id);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }return id;
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
