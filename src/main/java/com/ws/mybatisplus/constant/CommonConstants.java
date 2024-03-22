package com.ws.mybatisplus.constant;
import java.time.Duration;
import static com.ws.mybatisplus.constant.SecurityConstants.ROLE;

/**
 * 常量
 *
 * @author KevinChen
 * @since 2018/5/5
 */
public interface CommonConstants {
  /** header 中租户ID */
  String TENANT_ID = "TENANT_ID";
  /** 删除 */
  String STATUS_DEL = "1";
  /** 正常 */
  String STATUS_NORMAL = "0";
  /** 锁定 */
  String STATUS_LOCK = "9";

  String ADMIN_USER_ID = "00000000-0000-0000-1001-000000000001";

  /** const tenant id */
  String ADMIN_TENANT_ID = "00000000-0000-0000-1000-000000000001";

  String GLOBAL_TENANT_ID = "00000000-0000-0000-1000-000000000002";

  /** const role id */
  String MANAGER_ROLE_ID = "00000000-0000-0000-1002-000000000002";

  String HR_ROLE_ID = "00000000-0000-0000-1002-000000000003";
  String PAYROLL_ROLE_ID = "00000000-0000-0000-1002-000000000004";
  String LEAVE_ROLE_ID = "00000000-0000-0000-1002-000000000005";
  String ATTENDANCE_ROLE_ID = "00000000-0000-0000-1002-000000000006";
  String EMPLOYEE_PROFILE_ROLE_ID = "00000000-0000-0000-1002-000000000007";
  String DIRECTOR_ROLE_ID = "00000000-0000-0000-1002-000000000008";
  String EMPLOYEE_ROLE_ID = "00000000-0000-0000-1002-000000000009";

  /** const role code */
  String ADMINISTRATOR_ROLE = ROLE + "ADMINISTRATOR";

  String MANAGER_ROLE = ROLE + "MANAGER";
  String HR_ROLE = ROLE + "HR";
  String PAYROLL_ROLE = ROLE + "PAYROLL";
  String LEAVE_ROLE = ROLE + "LEAVE";
  String ATTENDANCE_ROLE = ROLE + "ATTENDANCE";
  String EMPLOYEE_PROFILE_ROLE = ROLE + "EMPLOYEE_PROFILE";
  String DIRECTOR_ROLE = ROLE + "DIRECTOR";
  String EMPLOYEE_ROLE = ROLE + "EMPLOYEE";

  String REQ_HEADER = "Authorization";
  String TOKEN_SPLIT = "Bearer";

  String SIGN_KEY = "MALT";
  String UTF8 = "UTF-8";
  String CONTENT_TYPE = "application/json;charset=utf-8";

  String PERMISSION_PAGE = "menu";

  String PERMISSION_OPERATION = "button";

  /** 路由存放 */
  String ROUTE_KEY = "gateway_route_key";

  /** 用户缓存前缀 */
  String USER_CACHE_PREFIX = "user_details";

  /** spring boot admin 事件key */
  String EVENT_KEY = "event_key";

  /** 验证链接默认时效: 24 hours */
  Duration VERIFY_URL_DEFAULT_DURATION = Duration.ofHours(24);

  /** 短链接前缀 */
  String SHORT_URL_KEY = "SHORT_URL_";

  /** 短链接默认时效: 24 hours */
  Duration SHORT_URL_DEFAULT_DURATION = VERIFY_URL_DEFAULT_DURATION;

  /** 验证码前缀 */
  String DEFAULT_CODE_KEY = "DEFAULT_CODE_KEY_";

  /** 注册验证码前缀 */
  String REGISTER_CODE_KEY = "REGISTER_CODE_KEY_";

  /** 验证码60秒标记 */
  String CODE_REQUEST_TIME_LIMIT_KEY = "CODE_REQUEST_TIME_LIMIT_KEY_";

  /** 验证码有效期 (秒） */
  int CODE_TIMEOUT = 30 * 60;
  /** 请求时间限制 */
  int CODE_REQUEST_TIME_LIMIT = 60;
  /** 验证码长度 */
  int CODE_SIZE = 6;
  /** 验证码参数名 */
  String CODE_PARAM_KEY = "code";

  /**
   * 短信模板 - 验证码 使用
   *
   * <p>{@link StrUtil#format} 格式化字符串
   *
   * @param code 验证码
   */
  String SMS_TEMPLATE_VERIFICATION_CODE =
      "Workstem\n\nYour Workstem verification code is {code}. Valid for "
          + CODE_TIMEOUT / 60
          + " minutes.";

  /**
   * 短信模板 - 邀请用户
   *
   * <p>{@link StrUtil#format} 格式化字符串
   *
   * @param company_name
   * @param link
   */
  String SMS_TEMPLATE_INVITE_USER =
      "Workstem\n"
          + "\n"
          + "Click the below link to verify your account, the link will expire after 24hrs:\n"
          + "\n"
          + "{link}";

  /**
   * 短信模板 - 用户验证成功
   *
   * <p>{@link StrUtil#format} 格式化字符串
   *
   * @param email
   */
  String SMS_TEMPLATE_INVITE_SUCCESSFUL =
      "[Workstem]"
          + "\n\n"
          + "您的帳戶已成功激活。您現在可以開始用電子郵箱 ({email}) 作為登錄用戶名，通過該賬戶關聯的手機號碼收取驗證碼進行登錄。"
          + "\n\n"
          + "Your account has been successfully activated. When logging in, use your email address ({email}) as "
          + "the username and get the one-time verification code sent to your mobile number.";

  String DEFAULT_MESSAGE_TEMPLATE =
      "Your Workstem verification code is [%s]. Valid for " + CODE_TIMEOUT / 60 + " minutes.";

  /** 成功标记 */
  Integer SUCCESS = 0;

  /** 失败标记 */
  Integer FAIL = 1;

  String DEFAULT_PASSWORD = "111111";

  /** 薪酬任务总数 */
  String PAYROLL_TOTAL_KEY = "payroll_total_key";

  /** 薪酬运算进度 REDIS 前缀 */
  String PAYROLL_CALCULATE_PROGRESS_KEY = "payroll_calculate_progress_key";

  /** 薪酬运算总数 */
  String PAYROLL_CALCULATE_TOTAL_KEY = "payroll_calculate_total_key";
  /** redis分布式锁 */
  String PAYROLL_CALCULATE_KEY = "payroll_calculate_key";

  /** 默认时区 */
  String DEFAULT_ZONE = "Asia/Hong_Kong";

  /** redis时区前缀 */
  String TENANT_ZONE_KEY_PREFIX = "zone:tenant:";

  /** xero同步任务总数 */
  String XERO_TOTAL_KEY = "xero_total_key";

  /** xero bill同步总数 */
  String XERO_SYNC_TOTAL_KEY = "xero_sync_total_key";

  /** redis分布式锁 */
  String XERO_SYNC_KEY = "xero_sync_key";
}
