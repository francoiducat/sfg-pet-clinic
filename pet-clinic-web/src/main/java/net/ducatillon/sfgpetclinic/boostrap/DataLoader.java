package net.ducatillon.sfgpetclinic.boostrap;

import java.time.LocalDate;
import net.ducatillon.sfgpetclinic.model.Owner;
import net.ducatillon.sfgpetclinic.model.Pet;
import net.ducatillon.sfgpetclinic.model.PetType;
import net.ducatillon.sfgpetclinic.model.Speciality;
import net.ducatillon.sfgpetclinic.model.Vet;
import net.ducatillon.sfgpetclinic.services.OwnerService;
import net.ducatillon.sfgpetclinic.services.PetTypeService;
import net.ducatillon.sfgpetclinic.services.SpecialityService;
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
  private final SpecialityService specialityService;

  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
      SpecialityService specialityService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
    this.specialityService = specialityService;
  }

  @Override
  public void run(String... args) throws Exception {

    int count = petTypeService.findAll().size();
    if (count == 0) {
      loadData();
    }

  }

  private void loadData() {
    PetType dog = new PetType();
    dog.setName("Dogy");
    petTypeService.save(dog);
    PetType cat = new PetType();
    cat.setName("Datty");
    petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    owner1.setAddress("123 Brickerel");
    owner1.setCity("Miami");
    owner1.setPhone("12345565");

    Pet mikesPet = new Pet();
    mikesPet.setPetType(dog);
    mikesPet.setOwner(owner1);
    mikesPet.setBirthDate(LocalDate.now());
    mikesPet.setName("Rosco");

    owner1.getPets().add(mikesPet);

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    owner1.setAddress("123 Brickerel");
    owner1.setCity("Miami");
    owner1.setPhone("123765565");

    Pet fionasPet = new Pet();
    fionasPet.setPetType(cat);
    fionasPet.setOwner(owner2);
    fionasPet.setBirthDate(LocalDate.now());
    fionasPet.setName("Fiona's cat");

    owner2.getPets().add(fionasPet);

    ownerService.save(owner2);

    System.out.println("Loaded owners ...");

    Speciality radiology = new Speciality();
    radiology.setDescription("Radiology");
    Speciality savedRadiology = specialityService.save(radiology);

    Speciality surgery = new Speciality();
    surgery.setDescription("Surgery");
    Speciality savedSurgery = specialityService.save(surgery);

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");
    vet1.getSpecialities().add(savedRadiology);

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vet2.getSpecialities().add(savedSurgery);

    vetService.save(vet2);
    System.out.println("Loaded vets ...");
  }
}
