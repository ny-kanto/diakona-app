package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PersonneService}.
 */
@Generated
public class PersonneService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PersonneService apply(RegisteredBean registeredBean, PersonneService instance) {
    AutowiredFieldValueResolver.forRequiredField("personneRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
