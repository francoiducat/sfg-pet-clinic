package net.ducatillon.sfgpetclinic.services.map;

import java.util.Set;
import net.ducatillon.sfgpetclinic.model.Vet;
import net.ducatillon.sfgpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
    super.save(object.getId(), object);
    return object;
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
