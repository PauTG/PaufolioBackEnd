
package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @NotNull
  private String nombre;
  @NotNull
  private String apellido;
   @NotNull
  private String titulo;
    @NotNull
  private String img;
}
