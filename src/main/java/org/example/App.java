package org.example;

import org.example.dao.AccountDao;
import org.example.model.Account;
import org.example.service.AccountMatcherService;
import org.example.service.CandidateRulesService;
import org.example.service.LinkedAccountRulesService;
import org.example.service.MatchingRulesService;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );
        AccountDao accountDao = new AccountDao();
        System.out.println(accountDao.getAccountsFromDb());

        Account testAccount = new Account.AccountBuilder()
                .withID(1)
                .withName("Andrei")
                .withLastName("Pop")
                .withPhoneNumber("0742333444")
                .build();
        System.out.println("Test account is: " + testAccount);

        CandidateRulesService candidateRulesService = new CandidateRulesService();
        candidateRulesService.setAccountList(accountDao.getAccountsFromDb());
        candidateRulesService.setAccount(testAccount);

        LinkedAccountRulesService linkedAccountRulesService = new LinkedAccountRulesService();
        linkedAccountRulesService.setAccountList(accountDao.getAccountsFromDb());
        linkedAccountRulesService.setAccount(testAccount);

        MatchingRulesService matchingRulesService = new MatchingRulesService();
        matchingRulesService.setAccountList(accountDao.getAccountsFromDb());
        matchingRulesService.setAccount(testAccount);

        AccountMatcherService accountMatcherService = new AccountMatcherService();
        accountMatcherService.setCandidateRulesService(candidateRulesService);
        accountMatcherService.setLinkedAccountRulesService(linkedAccountRulesService);
        accountMatcherService.setMatchingRulesService(matchingRulesService);

        accountMatcherService.accountMatchingStart();
    }
}
