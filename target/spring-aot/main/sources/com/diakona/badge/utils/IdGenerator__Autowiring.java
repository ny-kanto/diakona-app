package com.diakona.badge.utils;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link IdGenerator}.
 */
@Generated
public class IdGenerator__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static IdGenerator apply(RegisteredBean registeredBean, IdGenerator instance) {
    AutowiredFieldValueResolver.forRequiredField("dataSource").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
