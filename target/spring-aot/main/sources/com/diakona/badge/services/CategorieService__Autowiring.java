package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CategorieService}.
 */
@Generated
public class CategorieService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CategorieService apply(RegisteredBean registeredBean, CategorieService instance) {
    AutowiredFieldValueResolver.forRequiredField("categorieRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
