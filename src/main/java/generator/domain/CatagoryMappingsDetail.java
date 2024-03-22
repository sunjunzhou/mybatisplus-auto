package generator.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 财务分类映射明细表
 * @TableName catagory_mappings_detail
 */
@Data
public class CatagoryMappingsDetail implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 财务分类映射id
     */
    private String catagoryMappingId;

    /**
     * 映射明细名称
     */
    private String itemId;

    /**
     * 映射明细编号
     */
    private String itemCode;

    /**
     * 财务核算映射值
     */
    private String accountingMappingValue;

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