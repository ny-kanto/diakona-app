package com.diakona.badge;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BadgeApplication}.
 */
@Generated
public class BadgeApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'badgeApplication'.
   */
  public static BeanDefinition getBadgeApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BadgeApplication.class);
    beanDefinition.setInstanceSupplier(BadgeApplication::new);
    return beanDefinition;
  }
}
