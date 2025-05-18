package ma.enset.bdcc.benhima.ebankapp.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.bdcc.benhima.ebankapp.entities.Customer;
import ma.enset.bdcc.benhima.ebankapp.services.BankAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {
    private BankAccountService bankAccountService;

    @RequestMapping("/customers")
    public List<Customer> getCustomer(){
        log.info("Customer Rest Controller");
        return bankAccountService.findAllCustomers();
    }
}
