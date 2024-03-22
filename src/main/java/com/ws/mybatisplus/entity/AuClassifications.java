package com.ws.mybatisplus.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  AU classifications
 * @TableName au_classifications
 */
@Data
public class AuClassifications implements Serializable {
    /**
     * 
     */
    private Integer classificationFixedId;

    /**
     * 
     */
    private Integer publishedYear;

    /**
     * 
     */
    private Integer awardFixedId;

    /**
     * 
     */
    private String basePayRateId;

    /**
     * 
     */
    private BigDecimal baseRate;

    /**
     * 
     */
    private String baseRateType;

    /**
     * 
     */
    private String calculatedPayRateId;

    /**
     * 
     */
    private String calculatedRateType;

    /**
     * 
     */
    private BigDecimal calculatedRate;

    /**
     * 
     */
    private String classification;

    /**
     * 
     */
    private Integer classificationLevel;

    /**
     * 
     */
    private String clauseDescription;

    /**
     * 
     */
    private Integer clauseFixedId;

    /**
     * 
     */
    private String clauses;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String employeeRateTypeCode;

    /**
     * 
     */
    private Date lastModifiedDatetime;

    /**
     * 
     */
    private Integer nextDownClassificationFixedId;

    /**
     * 
     */
    private Integer nextUpClassificationFixedId;

    /**
     * 
     */
    private Date operativeFrom;

    /**
     * 
     */
    private Date operativeTo;

    /**
     * 
     */
    private String parentClassificationName;

    /**
     * 
     */
    private Integer versionNumber;

    private static final long serialVersionUID = 1L;
}