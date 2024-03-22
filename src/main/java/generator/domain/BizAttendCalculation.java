package generator.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 考勤计算
 * @TableName biz_attend_calculation
 */
@Data
public class BizAttendCalculation implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 考勤日期
     */
    private Date attendDay;

    /**
     * 雇员ID
     */
    private String employeeId;

    /**
     * 迟到分钟数
     */
    private Integer beLateLength;

    /**
     * 早退分钟数
     */
    private Integer leaveEarlyLength;

    /**
     * 迟到次数
     */
    private Integer beLateTime;

    /**
     * 早退次数
     */
    private Integer leaveEarlyTime;

    /**
     * 应出勤时数
     */
    private BigDecimal shiftLabor;

    /**
     * 实际上班
     */
    private Date actualIn;

    /**
     * 实际下班
     */
    private Date actualOff;

    /**
     * 
     */
    private String actualInText;

    /**
     * 
     */
    private String actualOffText;

    /**
     * 考勤状态，0：正常，1：迟到，2：加班，3：早退，4：旷工
     */
    private String attendStatus;

    /**
     * 总出勤时数
     */
    private BigDecimal laborLength;

    /**
     * 最早取卡
     */
    private Date earliestCard;

    /**
     * 最晚取卡
     */
    private Date lateCard;

    /**
     * 打卡确认，1：接受，2：拒绝
     */
    private String confirm;

    /**
     * 调整后时数
     */
    private BigDecimal afterAdjust;

    /**
     * 租户ID
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

    /**
     * 工作日加班
     */
    private BigDecimal workingOvertime;

    /**
     * 休息日加班
     */
    private BigDecimal holidayOvertime;

    /**
     * 法定假日加班
     */
    private BigDecimal dayOffOvertime;

    /**
     * 有薪假
     */
    private Integer paidLeave;

    /**
     * 法定假
     */
    private Integer statutoryLeave;

    /**
     * 年假
     */
    private Integer annualLeave;

    /**
     * 病假
     */
    private Integer sickLeave;

    /**
     * 无薪假
     */
    private Integer unpaidLeave;

    /**
     * 无薪病假
     */
    private Integer unpaidSickLeave;

    /**
     * 调休假
     */
    private Integer adjustmentLeave;

    /**
     * 调整时数
     */
    private BigDecimal adjust;

    /**
     * 类型
     */
    private String type;

    /**
     * 请假时长
     */
    private BigDecimal leaveTime;

    /**
     * 应上班时间
     */
    private String shiftIn;

    /**
     * 应下班时间
     */
    private String shiftOff;

    /**
     * 缺勤时长
     */
    private BigDecimal absenceLength;

    /**
     * 自定义考勤项目1
     */
    private BigDecimal definedItem1;

    /**
     * 自定义考勤项目2
     */
    private BigDecimal definedItem2;

    /**
     * 自定义考勤项目3
     */
    private BigDecimal definedItem3;

    /**
     * 自定义考勤项目4
     */
    private BigDecimal definedItem4;

    /**
     * 自定义考勤项目5
     */
    private BigDecimal definedItem5;

    /**
     * 自定义考勤项目6
     */
    private BigDecimal definedItem6;

    /**
     * 自定义考勤项目7
     */
    private BigDecimal definedItem7;

    /**
     * 自定义考勤项目8
     */
    private BigDecimal definedItem8;

    /**
     * 自定义考勤项目9
     */
    private BigDecimal definedItem9;

    /**
     * 自定义考勤项目10
     */
    private BigDecimal definedItem10;

    /**
     * 普通工作时数
     */
    private BigDecimal ordinaryHours;

    /**
     * 星期六工作时数
     */
    private BigDecimal satHours;

    /**
     * 星期日工作时数
     */
    private BigDecimal sunHours;

    /**
     * 法定假日工作时数
     */
    private BigDecimal publicHolidayHours;

    /**
     * 早班工作时数
     */
    private BigDecimal morningShiftHours;

    /**
     * 午班工作时数
     */
    private BigDecimal afternoonShiftHours;

    /**
     * 夜班工作时数
     */
    private BigDecimal nightShiftHours;

    /**
     * 用餐休息时数
     */
    private BigDecimal mealBreakTimes;

    /**
     * 时限内加班时数
     */
    private BigDecimal otBefore;

    /**
     * 超限加班时数
     */
    private BigDecimal otAfter;

    /**
     * 普通薪资率
     */
    private BigDecimal ordinaryRates;

    /**
     * 星期六薪资率
     */
    private BigDecimal satRates;

    /**
     * 星期日薪资率
     */
    private BigDecimal sunRates;

    /**
     * 法定假日薪资率
     */
    private BigDecimal publicHolidayRates;

    /**
     * 早班薪资率
     */
    private BigDecimal morningShiftRates;

    /**
     * 午班薪资率
     */
    private BigDecimal afternoonShiftRates;

    /**
     * 夜班薪资率
     */
    private BigDecimal nightShiftRates;

    /**
     * 时限内加班薪资率
     */
    private BigDecimal otBeforeRates;

    /**
     * 超限加班薪资率
     */
    private BigDecimal otAfterRates;

    /**
     * 普通津贴
     */
    private BigDecimal ordinaryPenalty;

    /**
     * 星期六津贴
     */
    private BigDecimal satPenalty;

    /**
     * 星期日津贴
     */
    private BigDecimal sunPenalty;

    /**
     * 法定假日津贴
     */
    private BigDecimal publicHolidayPenalty;

    /**
     * 早班津贴
     */
    private BigDecimal morningShiftPenalty;

    /**
     * 午班津贴
     */
    private BigDecimal afternoonShiftPenalty;

    /**
     * 夜班津贴
     */
    private BigDecimal nightShiftPenalty;

    /**
     * 限时内加班津贴
     */
    private BigDecimal otBeforePenalty;

    /**
     * 超限加班津贴
     */
    private BigDecimal otAfterPenalty;

    /**
     * OvertimeSaturdayFirstHours
     */
    private BigDecimal overtimeSaturdayFirstHours;

    /**
     * OvertimeSaturdayAfterHours
     */
    private BigDecimal overtimeSaturdayAfterHours;

    /**
     * OvertimeSundayFirstHours
     */
    private BigDecimal overtimeSundayFirstHours;

    /**
     * OvertimeSundayAfterHours
     */
    private BigDecimal overtimeSundayAfterHours;

    /**
     * OvertimePublicHolidayFirstHours
     */
    private BigDecimal overtimePublicHolidayFirstHours;

    /**
     * OvertimePublicHolidayAfterHours
     */
    private BigDecimal overtimePublicHolidayAfterHours;

    /**
     * OvertimeSaturdayFirstHourlyRate
     */
    private BigDecimal overtimeSaturdayFirstHourlyRate;

    /**
     * OvertimeSaturdayAfterHourlyRate
     */
    private BigDecimal overtimeSaturdayAfterHourlyRate;

    /**
     * OvertimeSundayFirstHourlyRate
     */
    private BigDecimal overtimeSundayFirstHourlyRate;

    /**
     * OvertimeSundayAfterHourlyRate
     */
    private BigDecimal overtimeSundayAfterHourlyRate;

    /**
     * OvertimePublicHolidayFirstHourlyRate
     */
    private BigDecimal overtimePublicHolidayFirstHourlyRate;

    /**
     * OvertimePublicHolidayAfterHourlyRate
     */
    private BigDecimal overtimePublicHolidayAfterHourlyRate;

    /**
     * OvertimeSaturdayFirstHoursPay
     */
    private BigDecimal overtimeSaturdayFirstHoursPay;

    /**
     * OvertimeSaturdayAfterHoursPay
     */
    private BigDecimal overtimeSaturdayAfterHoursPay;

    /**
     * OvertimeSundayFirstHoursPay
     */
    private BigDecimal overtimeSundayFirstHoursPay;

    /**
     * OvertimeSundayAfterHoursPay
     */
    private BigDecimal overtimeSundayAfterHoursPay;

    /**
     * OvertimePublicHolidayFirstHoursPay
     */
    private BigDecimal overtimePublicHolidayFirstHoursPay;

    /**
     * OvertimePublicHolidayAfterHoursPay
     */
    private BigDecimal overtimePublicHolidayAfterHoursPay;

    /**
     * TimeOffInLieu
     */
    private BigDecimal timeOffInLieu;

    private static final long serialVersionUID = 1L;
}