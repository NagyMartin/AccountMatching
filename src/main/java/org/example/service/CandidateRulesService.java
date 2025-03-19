package org.example.service;

import lombok.Getter;
import lombok.Setter;
import org.example.model.Account;


import java.util.List;

@Getter
@Setter
public class CandidateRulesService implements FieldMatcher {

    private Account account;
    private List<Account> accountList;

    public int candidateRule1(){
        int id = lastNameMatch();
        try{
            if(id == postCodeMatch()){
                System.out.println("CR1 condition, found similar last name and " +
                        "post code with account id: " + id);
                return id;
            }else {
                return 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public int candidateRule2(){
        int id = dateOfBirthMatch();
        try{
            if(id == postCodeMatch() && id == countryCodeMatch()){
                System.out.println("CR2 condition, found similar dob, country code and " +
                        "post code with account id: " + id);
                return id;
            }else {
                return 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public int candidateRule3(){
        int id = ipAddressMatch();
        try{
            if(id != 0){
                System.out.println("CR3 condition, found similar IP with account id: " + id);
                return id;
            }else {
                return 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public int candidateRule4(){
        int id = emailMatch();
        try{
            if(id == postCodeMatch()){
                System.out.println("CR4 condition, found similar email address with account id: " + id);
                return id;
            }else {
                return 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public int candidateRule5(){
        int id = phoneNumberMatch();
        try{
            if(id == postCodeMatch()){
                System.out.println("CR5 condition, found similar phone number with account id: " + id);
                return id;
            }
            else {
                return 0;
            }
        } catch (Exception e) {
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
