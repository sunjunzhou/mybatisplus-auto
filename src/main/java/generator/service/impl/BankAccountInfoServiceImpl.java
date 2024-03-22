package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.BankAccountInfo;
import generator.service.BankAccountInfoService;
import generator.mapper.BankAccountInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Gigawork
* @description 针对表【bank_account_info(银行账户信息表)】的数据库操作Service实现
* @createDate 2022-12-27 09:43:53
*/
@Service
public class BankAccountInfoServiceImpl extends ServiceImpl<BankAccountInfoMapper, BankAccountInfo>
    implements BankAccountInfoService{

}




