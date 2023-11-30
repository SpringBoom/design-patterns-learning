package org.demo.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象出父类
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
@Slf4j
public abstract class HappyPeople2 {

  /**
   * 整体的算法框架，即模版
   */
  public void celebrateSpringFestival(){
    subscribeTicket();
    travel();
    celebrate();
  }

  /**
   * 子类实现特殊的方法
   */
  protected abstract void subscribeTicket();
  protected abstract void travel();

  protected final void celebrate(){
    log.info("Happy Chinese new Year!");
  }

}
