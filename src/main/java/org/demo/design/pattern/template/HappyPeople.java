package org.demo.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 模版方法-从回家过年开始
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
@Slf4j
public class HappyPeople {

  public void celebrateSpringFestival(){
    log.info("Buying ticket...");
    log.info("Travelling by coach...");
    log.info("Happy Chinese new Year!");
  }

}
