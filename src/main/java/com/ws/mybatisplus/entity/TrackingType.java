package com.ws.mybatisplus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 分类类型
 *
 */
@AllArgsConstructor
public enum TrackingType {
  name("name"),
  address("address");
  @Getter @Setter private String typeName;



  /**
   * 根据类型的名称，返回类型的枚举实例。
   *
   * @param typeName 类型名称
   */
  public static TrackingType fromTypeName(String typeName) {
    for (TrackingType type : TrackingType.values()) {
      if (type.getTypeName().equals(typeName)) {
        return type;
      }
    }
    return null;
  }
}
