package hr.hrsak.sfgpetclinic.services;

import hr.hrsak.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
