package generator.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 银行账户信息表
 * @TableName bank_account_info
 */
@Data
public class BankAccountInfo implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行分行编号
     */
    private String bankBranchCode;

    /**
     * 银行户口号码
     */
    private String bankAccountNo;

    /**
     * 货币代码
     */
    private String currencyCode;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 付款代码
     */
    private String paymentCode;

    /**
     * 付款参考
     */
    private String paymentReference;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}