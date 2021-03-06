package net.ducatillon.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class Owner extends Person {

  private String address;
  private String city;
  private String phone;
  private Set<Pet> pets = new HashSet<>();

}
