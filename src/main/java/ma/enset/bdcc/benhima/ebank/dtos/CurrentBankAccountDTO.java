package ma.enset.bdcc.benhima.ebank.dtos;

import lombok.Data;
import ma.enset.bdcc.benhima.ebank.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
