package org.example.service;

import lombok.Setter;

@Setter
public class AccountMatcherService {

    private CandidateRulesService candidateRulesService;
    private MatchingRulesService matchingRulesService;
    private LinkedAccountRulesService linkedAccountRulesService;

    public void accountMatchingStart(){
        try{
           /* candidateRulesService.candidateRule1();
            candidateRulesService.candidateRule2();
            candidateRulesService.candidateRule3();
            candidateRulesService.candidateRule4();
            candidateRulesService.candidateRule5();
            matchingRulesService.matchingRule1();
            matchingRulesService.matchingRule2();
            matchingRulesService.matchingRule3();
            matchingRulesService.matchingRule4();
            linkedAccountRulesService.linkedRule1();
            linkedAccountRulesService.linkedRule5();*/
            if(candidateRulesService.candidateRule1() != 0 &&
                    candidateRulesService.candidateRule1() == matchingRulesService.matchingRule1()){
                System.out.println("There is a matching account alert CR1/MR1 with account id: " + candidateRulesService.candidateRule1());
            }
            if(candidateRulesService.candidateRule1() != 0 &&
                    candidateRulesService.candidateRule1() == matchingRulesService.matchingRule2()){
                System.out.println("There is a matching account alert CR1/MR2 with account id: " + candidateRulesService.candidateRule1());
            }
            if(candidateRulesService.candidateRule1() != 0 &&
                    candidateRulesService.candidateRule1() == matchingRulesService.matchingRule3()){
                System.out.println("There is a matching account alert CR1/MR3 with account id: " + candidateRulesService.candidateRule1());
            }
            if(candidateRulesService.candidateRule1() != 0 &&
                    candidateRulesService.candidateRule1() == matchingRulesService.matchingRule4()){
                System.out.println("There is a matching account alert CR1/MR4 with account id: " + candidateRulesService.candidateRule1());
            }
            if(candidateRulesService.candidateRule2() != 0 &&
                    candidateRulesService.candidateRule2() == matchingRulesService.matchingRule1()){
                System.out.println("There is a matching account alert CR2/MR1 with account id: " + candidateRulesService.candidateRule2());
            }
            if(candidateRulesService.candidateRule2() != 0 &&
                    candidateRulesService.candidateRule2() == matchingRulesService.matchingRule2()){
                System.out.println("There is a matching account alert CR2/MR2 with account id: " + candidateRulesService.candidateRule2());
            }
            if(candidateRulesService.candidateRule2() != 0 &&
                    candidateRulesService.candidateRule2() == matchingRulesService.matchingRule3()){
                System.out.println("There is a matching account alert CR2/MR3 with account id: " + candidateRulesService.candidateRule2());
            }
            if(candidateRulesService.candidateRule2() != 0 &&
                    candidateRulesService.candidateRule2() == matchingRulesService.matchingRule4()){
                System.out.println("There is a matching account alert CR2/MR4 with account id: " + candidateRulesService.candidateRule2());
            }
            if(candidateRulesService.candidateRule3() != 0 &&
                    candidateRulesService.candidateRule3() == matchingRulesService.matchingRule1()){
                System.out.println("There is a matching account alert CR3/MR1 with account id: " + candidateRulesService.candidateRule3());
            }
            if(candidateRulesService.candidateRule3() != 0 &&
                    candidateRulesService.candidateRule3() == matchingRulesService.matchingRule2()){
                System.out.println("There is a matching account alert CR3/MR2 with account id: " + candidateRulesService.candidateRule3());
            }
            if(candidateRulesService.candidateRule3() != 0 &&
                    candidateRulesService.candidateRule3() == matchingRulesService.matchingRule3()){
                System.out.println("There is a matching account alert CR3/MR3 with account id: " + candidateRulesService.candidateRule3());
            }
            if(candidateRulesService.candidateRule3() != 0 &&
                    candidateRulesService.candidateRule3() == matchingRulesService.matchingRule4()){
                System.out.println("There is a matching account alert CR3/MR4 with account id: " + candidateRulesService.candidateRule3());
            }
            if(candidateRulesService.candidateRule4() != 0 &&
                    candidateRulesService.candidateRule4() == matchingRulesService.matchingRule1()){
                System.out.println("There is a matching account alert CR4/MR1 with account id: " + candidateRulesService.candidateRule4());
            }
            if(candidateRulesService.candidateRule4() != 0 &&
                    candidateRulesService.candidateRule4() == matchingRulesService.matchingRule2()){
                System.out.println("There is a matching account alert CR4/MR2 with account id: " + candidateRulesService.candidateRule4());
            }
            if(candidateRulesService.candidateRule4() != 0 &&
                    candidateRulesService.candidateRule4() == matchingRulesService.matchingRule3()){
                System.out.println("There is a matching account alert CR4/MR3 with account id: " + candidateRulesService.candidateRule4());
            }
            if(candidateRulesService.candidateRule4() != 0 &&
                    candidateRulesService.candidateRule4() == matchingRulesService.matchingRule4()){
                System.out.println("There is a matching account alert CR4/MR4 with account id: " + candidateRulesService.candidateRule4());
            }
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
