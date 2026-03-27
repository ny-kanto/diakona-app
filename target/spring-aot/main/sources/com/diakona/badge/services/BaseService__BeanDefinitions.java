package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BaseService}.
 */
@Generated
public class BaseService__BeanDefinitions {
  /**
   * Get the bean definition for 'baseService'.
   */
  public static BeanDefinition getBaseServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BaseService.class);
    InstanceSupplier<BaseService> instanceSupplier = InstanceSupplier.using(BaseService::new);
    instanceSupplier = instanceSupplier.andThen(BaseService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
