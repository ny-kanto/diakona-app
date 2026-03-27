package com.diakona.badge.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BaseController}.
 */
@Generated
public class BaseController__BeanDefinitions {
  /**
   * Get the bean definition for 'baseController'.
   */
  public static BeanDefinition getBaseControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BaseController.class);
    InstanceSupplier<BaseController> instanceSupplier = InstanceSupplier.using(BaseController::new);
    instanceSupplier = instanceSupplier.andThen(BaseController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
