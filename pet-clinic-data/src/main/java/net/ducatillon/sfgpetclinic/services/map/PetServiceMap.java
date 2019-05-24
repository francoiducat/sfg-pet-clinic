package net.ducatillon.sfgpetclinic.services.map;

import java.util.Set;
import net.ducatillon.sfgpetclinic.model.Pet;
import net.ducatillon.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet object) {
    return super.save(object);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);

  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
