package net.ducatillon.sfgpetclinic.boostrap;

import net.ducatillon.sfgpetclinic.model.Owner;
import net.ducatillon.sfgpetclinic.model.Vet;
import net.ducatillon.sfgpetclinic.services.OwnerService;
import net.ducatillon.sfgpetclinic.services.VetService;
import net.ducatillon.sfgpetclinic.services.map.OwnerServiceMap;
import net.ducatillon.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Francois on 04/05/2019.
 */
@Component
public class Dataloader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;


  public Dataloader() {

    ownerService = new OwnerServiceMap();
    vetService = new VetServiceMap();
  }

  @Override
  public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    ownerService.save(owner1);
    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    ownerService.save(owner2);
    System.out.println("Loaded owners ...");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");
    vetService.save(vet1);
    Vet vet2 = new Vet();
    vet2.setId(1L);
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet2);
    System.out.println("Loaded vets ...");


  }
}
