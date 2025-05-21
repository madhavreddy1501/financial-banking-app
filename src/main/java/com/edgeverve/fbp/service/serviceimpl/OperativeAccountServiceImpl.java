package com.edgeverve.fbp.service.serviceimpl;

import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.repository.OperativeAccountRepo;
import com.edgeverve.fbp.service.OperativeAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class OperativeAccountServiceImpl implements OperativeAccountService {
    private final OperativeAccountRepo bankAccountRepo;
    public OperativeAccount saveBankAccount(OperativeAccount operativeAccount) {
        log.info("@@@");
        bankAccountRepo.save(operativeAccount);
        return operativeAccount;
    }

    public OperativeAccount findAccountById(Long id) {
        return bankAccountRepo.findById(id).get();
    }
    public List<OperativeAccount> fetchAllBankAccounts() {
        return bankAccountRepo.findAll();
    }
}
