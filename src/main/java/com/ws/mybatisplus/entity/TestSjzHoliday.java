package com.ws.mybatisplus.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class TestSjzHoliday implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
    * id
    */
    private Integer id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 雇员id
    */
    private String employeeId;

    /**
    * 假期类型
    */
    private String holidayType;

    /**
    * 开始日期
    */
    private Date startDate;

    /**
    * 原因
    */
    private String remark;

    /**
    * 请假时长
    */
    private BigDecimal leaveTime;

    /**
    * 审批人
    */
    private String employeename;


}