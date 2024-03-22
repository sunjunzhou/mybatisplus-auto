package generator.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * biz_payroll_template
 * @TableName biz_payroll_template
 */
@Data
public class BizPayrollTemplate implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态 0禁用 1启用
     */
    private String status;

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