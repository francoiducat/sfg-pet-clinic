package net.ducatillon.sfgpetclinic.boostrap;

import net.ducatillon.sfgpetclinic.model.Owner;
import net.ducatillon.sfgpetclinic.model.PetType;
import net.ducatillon.sfgpetclinic.model.Vet;
import net.ducatillon.sfgpetclinic.services.OwnerService;
import net.ducatillon.sfgpetclinic.services.PetTypeService;
import net.ducatillon.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Francois on 04/05/2019.
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;

  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) throws Exception {

    PetType dog = new PetType();
    dog.setName("Dogy");
    petTypeService.save(dog);
    PetType cat = new PetType();
    cat.setName("Datty");
    petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    ownerService.save(owner1);
    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    ownerService.save(owner2);
    System.out.println("Loaded owners ...");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet2);
    System.out.println("Loaded vets ...");


  }
}
