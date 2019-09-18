package net.ducatillon.sfgpetclinic.services.map;

import java.util.Set;
import net.ducatillon.sfgpetclinic.model.Speciality;
import net.ducatillon.sfgpetclinic.model.Vet;
import net.ducatillon.sfgpetclinic.services.SpecialityService;
import net.ducatillon.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialityService specialityService;

  public VetServiceMap(SpecialityService specialityService) {
    this.specialityService = specialityService;
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet object) {

    if (object.getSpecialities().size() > 0) {
      object.getSpecialities().forEach(speciality -> {
        if (speciality.getId() == null) {
          Speciality savedSpeciality = specialityService.save(speciality);
          speciality.setId(savedSpeciality.getId());
        }
      });
    }
    return super.save(object);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);

  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
