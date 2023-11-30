package org.demo.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

/**
 * 模版方法模式-回调
 * JDBC 查询示例
 *
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
@Slf4j
public class SimpleJdbcQueryTemplate {

  public <T> T query(String queryString, ResultSetHandler<T> rsHandler) {

    try (Connection connection = DriverManager.getConnection("");
         PreparedStatement stmt = connection.prepareStatement(queryString)) {

      ResultSet resultSet = stmt.executeQuery();
      return rsHandler.handle(resultSet);

    } catch (SQLException e) {
      log.error("sql error", e);
    }
    return null;
  }

}
