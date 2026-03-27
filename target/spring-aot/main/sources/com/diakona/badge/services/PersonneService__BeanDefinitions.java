package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PersonneService}.
 */
@Generated
public class PersonneService__BeanDefinitions {
  /**
   * Get the bean definition for 'personneService'.
   */
  public static BeanDefinition getPersonneServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PersonneService.class);
    InstanceSupplier<PersonneService> instanceSupplier = InstanceSupplier.using(PersonneService::new);
    instanceSupplier = instanceSupplier.andThen(PersonneService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
