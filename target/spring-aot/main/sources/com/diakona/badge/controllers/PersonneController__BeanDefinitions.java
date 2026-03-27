package com.diakona.badge.controllers;

import com.diakona.badge.services.CategorieService;
import com.diakona.badge.services.GroupeService;
import com.diakona.badge.services.PersonneService;
import com.diakona.badge.utils.IdGenerator;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PersonneController}.
 */
@Generated
public class PersonneController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'personneController'.
   */
  private static BeanInstanceSupplier<PersonneController> getPersonneControllerInstanceSupplier() {
    return BeanInstanceSupplier.<PersonneController>forConstructor(PersonneService.class, GroupeService.class, CategorieService.class, IdGenerator.class)
            .withGenerator((registeredBean, args) -> new PersonneController(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'personneController'.
   */
  public static BeanDefinition getPersonneControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PersonneController.class);
    beanDefinition.setInstanceSupplier(getPersonneControllerInstanceSupplier());
    return beanDefinition;
  }
}
