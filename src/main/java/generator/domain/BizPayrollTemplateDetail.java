package generator.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * biz_payroll_template_detail
 * @TableName biz_payroll_template_detail
 */
@Data
public class BizPayrollTemplateDetail implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * payroll_template_id
     */
    private String payrollTemplateId;

    /**
     * 薪酬项目id
     */
    private String payrollItemId;

    /**
     * 薪酬项目类型id
     */
    private String payrollItemTypeId;

    /**
     * 比例数
     */
    private BigDecimal percentage;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 覆盖 0否 1是
     */
    private String override;

    /**
     * 状态 0禁用 1启用
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 租户id
     */
    private String tenantId;

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