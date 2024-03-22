package com.ws.mybatisplus.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Role implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("user_id")
    private Integer userid;
    /**
     * 姓名
     */
    private String name;

    /**
     * 授权大区
     */
    private String autharea;

    /**
     * 授权城市
     */
    private String authcity;

    private static final long serialVersionUID = 1L;
}