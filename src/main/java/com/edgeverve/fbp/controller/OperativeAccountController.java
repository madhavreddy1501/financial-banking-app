package com.edgeverve.fbp.controller;

import com.edgeverve.fbp.entity.OperativeAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/operative-account")
public interface OperativeAccountController {
    @GetMapping("/ping")
    ResponseEntity<String> ping();
    @PostMapping("/save")
    OperativeAccount saveBankAccount(@RequestBody OperativeAccount operativeAccount);
    @GetMapping("/get-account/{accountId}")
    OperativeAccount findAccountById(@PathVariable("accountId") Long accountId);
    @GetMapping("/")
    List<OperativeAccount> fetchAllBankAccounts();
}
