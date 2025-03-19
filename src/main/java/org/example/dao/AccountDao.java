package org.example.dao;

import org.example.model.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {

    public static final String JDBC_Driver = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/master";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "admin";
    public Connection getConnection(){
        try{
            Class.forName(JDBC_Driver);
            return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        }
        catch (Exception e){
            throw new RuntimeException("Cannot connect to database " + e.getMessage());
        }
    }


    public List<Account> getAccountsFromDb() throws SQLException {
        List<Account> accountList = new ArrayList<>();
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM accounts")){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("last_name");
                String dateOfBirth = resultSet.getString("dob");
                String phoneNumber = resultSet.getString("phone_number");
                String countryCode = resultSet.getString("country_code");
                String email = resultSet.getString("email");
                int postcode = resultSet.getInt("postcode");
                String ipAddress = resultSet.getString("ip_address");
                String addressLine = resultSet.getString("address_line");
                Account account = new Account.AccountBuilder()
                        .withID(id)
                        .withName(name)
                        .withLastName(lastName)
                        .withDateOfBirth(dateOfBirth)
                        .withPhoneNumber(phoneNumber)
                        .withCountryCode(countryCode)
                        .withEmail(email)
                        .withPostCode(postcode)
                        .withIpAddress(ipAddress)
                        .withAddressLine(addressLine)
                        .build();
                accountList.add(account);
            }

        }

        return accountList;
    }

}
