package org.demo.design.pattern.obj.single;

/**
 * 最简单的单例模式
 *
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class SimpleSingleton {

  private static final SimpleSingleton SIMPLE_SINGLETON = new SimpleSingleton();

  /**
   * 私有化构造器
   */
  private SimpleSingleton() {
  }

  /**
   * 用于获取到实例的方法
   * @return
   */
  public static SimpleSingleton getInstance() {
    return SIMPLE_SINGLETON;
  }
}
