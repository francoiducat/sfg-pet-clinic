package net.ducatillon.sfgpetclinic.services;

import net.ducatillon.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
