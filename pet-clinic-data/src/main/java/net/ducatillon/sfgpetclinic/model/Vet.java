package net.ducatillon.sfgpetclinic.model;

import java.util.Set;
import lombok.Data;

@Data
public class Vet extends Person {

  private Set<Speciality> specialities;
}
