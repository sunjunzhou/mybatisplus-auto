package generator.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * biz_autopay_bank_error_code
 * @TableName biz_autopay_bank_error_code
 */
@Data
public class BizAutopayBankErrorCode implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 银行代码
     */
    private String bankCode;

    /**
     * 代码类型
     */
    private String codeType;

    /**
     * 国家/地区
     */
    private String country;

    /**
     * 错误代码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorDescription;

    /**
     * 原因
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