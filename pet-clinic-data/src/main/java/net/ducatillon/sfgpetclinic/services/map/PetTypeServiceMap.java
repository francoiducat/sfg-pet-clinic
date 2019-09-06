package net.ducatillon.sfgpetclinic.services.map;

import java.util.Set;
import net.ducatillon.sfgpetclinic.model.PetType;
import net.ducatillon.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by Francois on 09/06/2019.
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public PetType findById(Long id) {
    return super.findById(id);
  }

  @Override
  public PetType save(PetType petType) {
    return super.save(petType);
  }

  @Override
  public void delete(PetType petType) {
    super.delete(petType);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
