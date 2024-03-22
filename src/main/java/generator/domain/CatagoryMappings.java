package generator.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 财务分类映射表
 * @TableName catagory_mappings
 */
@Data
public class CatagoryMappings implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 类别
     */
    private String catagory;

    /**
     * 第三方类别id
     */
    private String thirdCatagoryId;

    /**
     * 第三方类别名称
     */
    private String thirdCatagoryName;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 组织id区别不同三方
     */
    private String vendor;

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