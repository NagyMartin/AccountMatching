package org.example.model;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class Account {

    private final int id;
    private final String name;
    private final String lastName;
    private final String dateOfBirth;
    private final String phoneNumber;
    private final String countryCode;
    private final String email;
    private final int postCode;
    private final String ipAddress;
    private final String addressLine;


    private Account(int id, String name, String lastName, String dateOfBirth, String phoneNumber,
                   String countryCode, String email, int postCode, String ipAddress, String addressLine) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.email = email;
        this.postCode = postCode;
        this.ipAddress = ipAddress;
        this.addressLine = addressLine;
    }

    public static class AccountBuilder {
        private int id;
        private String name;
        private String lastName;
        private String dateOfBirth;
        private String phoneNumber;
        private String countryCode;
        private String email;
        private int postCode;
        private String ipAddress;
        private String addressLine;

        public AccountBuilder withID(int id){
            this.id = id;
            return this;
        }
        public AccountBuilder withName(String name){
            this.name = name;
            return this;
        }
        public AccountBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public AccountBuilder withDateOfBirth(String dob){
            this.dateOfBirth = dob;
            return this;
        }
        public AccountBuilder withPhoneNumber(String number){
            this.phoneNumber = number;
            return this;
        }
        public AccountBuilder withCountryCode(String code){
            this.countryCode = code;
            return this;
        }
        public AccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }
        public AccountBuilder withPostCode(int pCode){
            this.postCode = pCode;
            return this;
        }
        public AccountBuilder withIpAddress(String ipAdd){
            this.ipAddress = ipAdd;
            return this;
        }
        public AccountBuilder withAddressLine(String address){
            this.addressLine = address;
            return this;
        }
        public Account build(){
            return new Account(id, name, lastName, dateOfBirth, phoneNumber,
                    countryCode, email, postCode, ipAddress, addressLine);
        }
    }
}
