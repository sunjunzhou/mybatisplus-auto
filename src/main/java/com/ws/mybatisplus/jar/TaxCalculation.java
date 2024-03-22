package com.ws.mybatisplus.jar;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 报税计算
 *
 * @author renyu
 * @since 2019-11-01 14:15:05
 */
@Data
@TableName(value = "tax_calculation", autoResultMap = true)
@EqualsAndHashCode(callSuper = true)
public class TaxCalculation extends Model<TaxCalculation> {
  private static final long serialVersionUID = 1L;

  /** id */
  @TableId private String id;
  /** 计算日志id */
  private String logId;
  /** 税表id */
  private String tax;
  /** 税表名称 */
  @TableField(exist = false)
  private String taxName;
//  /** 雇员id */
//  @ExcelConfig(
//      isNeed = true,
//      entityAlias = "com.malt.payroll.service.TaxCalculationService",
//      entityAliasMethodName = "employeeList",
//      entityColumnName = "certificateNumber",
//      soleColumn = true,
//      titles = "{'en-us':'','zh-cn':'*证照号码','zh-hk':''}")
  private String employeeId;
  /** 周期 */
  private String period;
  /** 周期标题 */
  @TableField(exist = false)
  private String periodName;
  /** 入息总额 */
  private BigDecimal rental;
  /** 状态 0:正常;1:锁定;2:关闭 */
  private String status;
  /** 姓 */
  private String surname;
  /** 姓(英文写法) */
  private String surnameEnglish;
  /** 名 */
  private String personalName;
  /** 名(英文写法) */
  private String personalNameEnglish;
  /** 香港身份证号码 */
  private String identityCardHk;
  /** 护照编号 */
  private String passportNumber;
  /** 护照发放地 */
  private String passportIssuingPlace;
  /** 配偶姓名 */
  private String spouseName;
  /** 配偶香港身份证号码 */
  private String spouseIdentityCardHk;
  /** 配偶护照编号 */
  private String spousePassportNumber;
  /** 配偶护照发放地 */
  private String spousePassportIssuingPlace;
  /** 住址 */
  private String address;
  /** 通讯地址 */
  private String postalAddress;
  /** 离职原因 */
  private String reasonsLeave;
  /** 住所信息id */
  private String domicile;
  /** 其他信息id */
  private String other;
  /** 租户id */
  private String tenantId;
  /** 创建人 */
  @TableField(fill = FieldFill.INSERT)
  private String createBy;
  /** 创建时间 */
 // @TableField(fill = FieldFill.INSERT, typeHandler = ZoneTimeTypeHandler.class)
  private LocalDateTime createTime;
  /** 修改人 */
  @TableField(fill = FieldFill.UPDATE)
  private String updateBy;
  /** 修改时间 */
 // @TableField(fill = FieldFill.UPDATE, typeHandler = ZoneTimeTypeHandler.class)
  private LocalDateTime updateTime;
  /** 逻辑删除，0：未删除，1：已删除 */
  @TableLogic private Integer deleted;
  /** 区码 */
  private String regionCode;
  /** 婚姻状况 */
  private String maritalStatus;
  /** 性别 */
  private String sex;
  /** 中文名 */
  private String chineseName;
  /** 56B税表详情编号 */
  private String codeB56;

  /** 头像 */
  @TableField(exist = false)
  private String headFile;
  /** 员工编号 */
  private String code;
  /** 姓名 */
  private String englishName;
  /** 是否提供住宿 */
  @TableField(exist = false)
  private Boolean isOfferAccommodation;
  /** 受雇形式 */
  private String hireType;
  /** 入职日期 */
  private LocalDate entryDate;
  /** 离职日期 */
  private LocalDate lastWorkingDate;
//  /** 明细 */
//  @TableField(exist = false)
//  private List<TaxCalculationDetail> detailList;
//  /** 住所列表 */
//  @TableField(exist = false)
//  private List<TaxAddressInfo> addressInfoList;
//  /** 其他信息 */
//  @TableField(exist = false)
//  //private TaxOtherInfoDetail otherInfoDetail;
//
//  /** 状态筛选 */
//  @TableField(exist = false)
// // @FilterField("status")
//  private String taxCalculationStatusFilter;
  /** 入息额筛选 */
  @TableField(exist = false)
  //@FilterField("rental")
  private String rentalFilter;

  /** 个人所得税 */
 // @ExcelConfig(titles = "{'en-us':'','zh-cn':'减免税额','zh-hk':''}")
  private BigDecimal individualIncomeTax;
  /** 身份证 */
  private String identityCard;
  /** 配偶身份证 */
  private String spouseIdentityCard;
  /** 国籍 */
  private String nationality;
  /** 导入失败原因 */
  @TableField(exist = false)
  private String errorReason;
  /** 证件号码 */
  private String certificateNumber;
  /** 证件类型 */
  private String certificateType;
  /** 生日 */
  private LocalDate birthday;

  /** 生日年 */
  private Integer birthDayOfYear;
  /** 生日月 */
  private Integer birthDayOfMonth;
  /** 生日天 */
  private Integer birthDayOfDate;
  /** 邮箱 */
  private String email;
  /** 中间名 */
  private String middleName;
  /** 电话 */
  private String phone;
  /** 省 */
  private String province;
  /** 市 */
  private String city;
  /** 邮编 */
  private String postcode;
  /** 收入类型 */
  private String calculateSalaryType;
  /** 离职日期 */
  private LocalDate leaveDate;
  /** 税号 */
  private String taxNumber;
  /** 税表定义 */
  private String taxDefinition;
  /** 合同工营业号 */
  private String contractBusinessNumber;
  /** 前工号 */
  private String lastCode;
  /** 涉外收入国家 */
  private String foreignRelatedCountry;

  /** 是否残疾人士 */
  private Boolean isDisabled;
  /** 是否烈属 */
  private Boolean isMartyrDependents;

  /** 薪酬运算id */
  private String payrollPlanId;

  /** 外地雇员身份证（蓝卡）号码 */
  @TableField(exist = false)
  private String nonLocalBlueCardNumber;

  /** 职位名称 */
  @TableField(exist = false)
  private String positionName;

  /** 职业税金额 */
  private BigDecimal occupationTax;

  /** 职业税编号 */
  @TableField(exist = false)
  private String occupationTaxNumber;

  /** 是否外地雇员 */
  @TableField(exist = false)
  private Boolean isForeignEmployees;

  private BigDecimal paygw;
  private BigDecimal gross;
  private BigDecimal paidLeave;
  private BigDecimal allowance;
  private BigDecimal overtime;
  private BigDecimal bonuses;
  private BigDecimal cdep;
  private BigDecimal salarySacrifice;
  private BigDecimal etp;
  private BigDecimal deduction;
  private BigDecimal superPayroll;
  private BigDecimal taxForeign;
  private BigDecimal exemptForeign;
  private BigDecimal fringeBenefits;
  private BigDecimal lumpSum;
  private BigDecimal terminationPay;

}
