package com.edgeverve.fbp.service.serviceimpl;

import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.model.OperativeAccountDto;
import com.edgeverve.fbp.repository.OperativeAccountRepo;
import com.edgeverve.fbp.service.OperativeAccountService;
import com.edgeverve.fbp.utils.MapperUtil;
import com.edgeverve.fbp.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OperativeAccountServiceImpl implements OperativeAccountService {
    @Autowired
    private OperativeAccountRepo operativeAccountRepo;
    @Autowired
    private Utils utils;
    @Autowired
    private MapperUtil mapperUtil;
    public OperativeAccountDto createOperativeAccount(OperativeAccountDto operativeAccountDto) {
//        log.info("@@@@@@@@@@@ createOperativeAccount ServiceImpl");
        /**
         * generating Account Number and setting to accountDetails
         */
        operativeAccountDto.getAccountDetails().setAccountNumber(utils.generateAccountNumber());
        OperativeAccount operativeAccount=mapperUtil.mapOperativeAccountDtoToOperativeAccount(operativeAccountDto);
        return mapperUtil.mapOperativeAccountToOperativeAccountDto(operativeAccountRepo.save(operativeAccount));
    }

    public OperativeAccountDto findAccountById(Long id) {
//        return bankAccountRepo.findById(id).get();
        return null;
    }
    public List<OperativeAccountDto> fetchAllBankAccounts() {
//        return bankAccountRepo.findAll();
        return null;
    }
}
