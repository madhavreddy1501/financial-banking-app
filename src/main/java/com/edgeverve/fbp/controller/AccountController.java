package com.edgeverve.fbp.controller;

import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.service.BankAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class AccountController {
    @Autowired
    private BankAccountServiceImpl bankAccountService;//object

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Success");
    }

    @PostMapping("/save")
    public OperativeAccount saveBankAccount(@RequestBody OperativeAccount bankAccount) {
        return bankAccountService.saveBankAccount(bankAccount);
    }

    @GetMapping("/get-account/{accountId}")
    public OperativeAccount findAccountById(@PathVariable("accountId") Long accountId) {
        return bankAccountService.findAccountById(accountId);
    }

    @GetMapping("/")
    public List<OperativeAccount> fetchAllBankAccounts(){
        return bankAccountService.fetchAllBankAccounts();
    }
}
