package ma.enset.bdcc.benhima.ebank.dtos;

import lombok.Data;
import ma.enset.bdcc.benhima.ebank.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

