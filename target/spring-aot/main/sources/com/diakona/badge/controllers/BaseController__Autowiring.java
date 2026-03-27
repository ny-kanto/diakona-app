package com.diakona.badge.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BaseController}.
 */
@Generated
public class BaseController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BaseController apply(RegisteredBean registeredBean, BaseController instance) {
    AutowiredFieldValueResolver.forRequiredField("baseService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
