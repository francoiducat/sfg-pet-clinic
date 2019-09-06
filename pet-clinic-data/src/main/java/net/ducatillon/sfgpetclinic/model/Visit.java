package net.ducatillon.sfgpetclinic.model;

import java.time.LocalDate;
import lombok.Data;

/**
 * Created by Francois on 09/06/2019.
 */
@Data
public class Visit extends BaseEntity {

  private LocalDate date;
  private String description;
  private Pet pet;

}
