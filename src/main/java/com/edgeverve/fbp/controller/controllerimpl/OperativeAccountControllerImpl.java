package com.edgeverve.fbp.controller.controllerimpl;

import com.edgeverve.fbp.controller.OperativeAccountController;
import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.service.OperativeAccountService;
import com.edgeverve.fbp.service.serviceimpl.OperativeAccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class OperativeAccountControllerImpl implements OperativeAccountController {

    private final OperativeAccountService operativeAccountService;
    private OperativeAccountServiceImpl bankAccountService;

    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Success");
    }

    public OperativeAccount saveBankAccount(@RequestBody OperativeAccount operativeAccount) {
        return bankAccountService.saveBankAccount(operativeAccount);
    }
    public OperativeAccount findAccountById(@PathVariable("accountId") Long accountId) {
        return bankAccountService.findAccountById(accountId);
    }
    public List<OperativeAccount> fetchAllBankAccounts(){
        return bankAccountService.fetchAllBankAccounts();
    }
}
