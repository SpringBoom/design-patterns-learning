package org.demo.design.pattern.template;

import java.sql.ResultSet;

/**
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public interface ResultSetHandler<T> {
  T handle(ResultSet rs);
}