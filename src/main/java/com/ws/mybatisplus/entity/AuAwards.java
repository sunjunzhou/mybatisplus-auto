package com.ws.mybatisplus.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * AU Awards
 *
 * @TableName au_awards
 */
@Data
public class AuAwards implements Serializable {
    /**
     *
     */
    @TableId("award_id")
    private Integer awardId;

    /**
     *
     */
    private Integer awardFixedId;

    /**
     *
     */
    private Date awardOperativeFrom;

    /**
     *
     */
    private Date awardOperativeTo;

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    @JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    private LocalDateTime lastModifiedDatetime;

    /**
     *
     */
    private String publishedYear;

    /**
     *
     */
    private Integer versionNumber;

    private static final long serialVersionUID = 1L;
}