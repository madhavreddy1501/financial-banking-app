package com.edgeverve.fbp.service;

import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.repository.BankAccountRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BankAccountServiceImpl {

    @Autowired
    private BankAccountRepo bankAccountRepo;

    public OperativeAccount saveBankAccount(OperativeAccount bankAccount) {
        log.info("@@@");
        bankAccountRepo.save(bankAccount);
        return bankAccount;
    }

    public OperativeAccount findAccountById(Long id) {
        return bankAccountRepo.findById(id).get();
    }
    public List<OperativeAccount> fetchAllBankAccounts() {
        return bankAccountRepo.findAll();
    }
}
