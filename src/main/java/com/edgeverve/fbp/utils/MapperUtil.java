package com.edgeverve.fbp.utils;

import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.model.OperativeAccountDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {
    @Autowired
    private ModelMapper modelMapper;
    public OperativeAccountDto mapOperativeAccountToOperativeAccountDto(OperativeAccount operativeAccount) {
        OperativeAccountDto operativeAccountDto = new OperativeAccountDto();
        modelMapper.map(operativeAccount,operativeAccountDto);
        return  operativeAccountDto;
    }

    public OperativeAccount mapOperativeAccountDtoToOperativeAccount(OperativeAccountDto operativeAccountDto) {
        OperativeAccount operativeAccount = new OperativeAccount();
        modelMapper.map(operativeAccountDto,operativeAccount);
        return operativeAccount;
    }
}
