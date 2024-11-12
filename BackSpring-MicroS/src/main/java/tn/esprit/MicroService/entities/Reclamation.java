package tn.esprit.MicroService.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Reclamation implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReclamation ;

    private LocalDateTime dateDeReclamation;

    private String titre;

    private String description;

    private boolean status;


    private String image;


}
