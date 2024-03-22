package generator.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 第三方供应商对接任务请求日志表
 * @TableName biz_vendor_exchange_detail
 */
@Data
public class BizVendorExchangeDetail implements Serializable {
    /**
     * 请求id
     */
    private String requestId;

    /**
     * 
     */
    private Long id;

    /**
     * 请求内容
     */
    private Object requestContent;

    /**
     * 响应内容
     */
    private Object responseContent;

    /**
     * 租户id
     */
    private String tenantId;

    private static final long serialVersionUID = 1L;
}