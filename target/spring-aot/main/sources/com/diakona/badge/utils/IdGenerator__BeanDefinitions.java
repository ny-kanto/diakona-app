package com.diakona.badge.utils;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IdGenerator}.
 */
@Generated
public class IdGenerator__BeanDefinitions {
  /**
   * Get the bean definition for 'idGenerator'.
   */
  public static BeanDefinition getIdGeneratorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IdGenerator.class);
    InstanceSupplier<IdGenerator> instanceSupplier = InstanceSupplier.using(IdGenerator::new);
    instanceSupplier = instanceSupplier.andThen(IdGenerator__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
