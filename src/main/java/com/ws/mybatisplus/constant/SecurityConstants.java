package com.ws.mybatisplus.constant;

/**
 * @author KevinChen
 * @since 2018/5/3
 */
public interface SecurityConstants {
  String USER_HEADER = "x-user-header";
  String ROLE_HEADER = "x-role-header";
  String USER_ID_HEADER = "x-user-id-header";

  String DETAILS_USER_ID = "user_id";
  String DETAILS_TENANT_ID = "tenant_id";
  String DETAILS_ROLES = "roles";
  String DETAILS_PWD_SET = "is_pwd_set";

  String MALT_LICENSE = "made by malt";

  /** 内部 */
  String FROM_IN = "Y";

  /** 标志 */
  String FROM = "from";

  String BASE_ROLE = "ROLE_USER";

  /** 角色前缀 */
  String ROLE = "ROLE_";
  String ROLE_ANONYMOUS = ROLE + "ANONYMOUS";
  /** 前缀 */
  String MALT_PREFIX = "malt_";
  /** oauth 相关前缀 */
  String OAUTH_PREFIX = "oauth:";

  // grant type
  String AUTHORIZATION_CODE = "authorization_code";
  String PASSWORD = "password";
  String REFRESH_TOKEN = "refresh_token";

  // oauth token url
  String OAUTH_TOKEN_URL = "/oauth/token";

  String OAUTH_CHECK_TOKEN_URL = "/oauth/check_token";

  String MOBILE_TOKEN_URL = "/mobile/token";
  /** 手机号登录URL */
  String SMS_TOKEN_URL = "/mobile/token/sms";
  /** 邮箱验证码登录 */
  String MAIL_CODE_URL = "/mail/code";
  /** 验证码登录 */
  String VERIFICATION_TOKEN_URL = "/verification/token";

  long SERIAL_VERSION_ID = 420L;

  /** {bcrypt} 加密的特征码 */
  String BCRYPT = "{bcrypt}";
  /** sys_oauth_client_details 表的字段，不包括client_id、client_secret */
  String CLIENT_FIELDS =
      "client_id, CONCAT('{noop}',client_secret) as client_secret, resource_ids, scope, "
          + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
          + "refresh_token_validity, additional_information, autoapprove";

  /** JdbcClientDetailsService 查询语句 */
  String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS + " from sys_oauth_client_details";
  /** 默认的查询语句 */
  String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";

  /** 按条件client_id 查询 */
  String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";

  /** 资源服务器默认bean名称 */
  String RESOURCE_SERVER_CONFIGURER = "resourceServerConfigurerAdapter";

  /** 客户端模式 */
  String CLIENT_CREDENTIALS = "client_credentials";
  /** oauth 客户端信息 */
  String CLIENT_DETAILS_KEY = "malt_oauth:client:details";
}
