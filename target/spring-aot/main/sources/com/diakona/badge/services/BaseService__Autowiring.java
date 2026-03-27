package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BaseService}.
 */
@Generated
public class BaseService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BaseService apply(RegisteredBean registeredBean, BaseService instance) {
    AutowiredFieldValueResolver.forRequiredField("dataSource").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
