package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GroupeService}.
 */
@Generated
public class GroupeService__BeanDefinitions {
  /**
   * Get the bean definition for 'groupeService'.
   */
  public static BeanDefinition getGroupeServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GroupeService.class);
    InstanceSupplier<GroupeService> instanceSupplier = InstanceSupplier.using(GroupeService::new);
    instanceSupplier = instanceSupplier.andThen(GroupeService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
