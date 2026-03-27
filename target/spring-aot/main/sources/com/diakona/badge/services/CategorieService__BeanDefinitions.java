package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CategorieService}.
 */
@Generated
public class CategorieService__BeanDefinitions {
  /**
   * Get the bean definition for 'categorieService'.
   */
  public static BeanDefinition getCategorieServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CategorieService.class);
    InstanceSupplier<CategorieService> instanceSupplier = InstanceSupplier.using(CategorieService::new);
    instanceSupplier = instanceSupplier.andThen(CategorieService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
