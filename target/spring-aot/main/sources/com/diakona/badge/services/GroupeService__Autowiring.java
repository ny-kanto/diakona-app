package com.diakona.badge.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link GroupeService}.
 */
@Generated
public class GroupeService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static GroupeService apply(RegisteredBean registeredBean, GroupeService instance) {
    AutowiredFieldValueResolver.forRequiredField("groupeRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
