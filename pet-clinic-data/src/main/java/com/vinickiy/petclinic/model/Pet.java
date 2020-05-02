package com.vinickiy.petclinic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@ApiModel
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Builder
    public Pet(Long id, PetType petType, Owner owner, LocalDate birthDate, String name, Set<Visit> visits) {
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
        this.name = name;
        if (visits == null || visits.size() > 0 ) {
            this.visits = visits;
        }
    }
    @ApiModelProperty(example = "Cat")
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ApiModelProperty(example = "12233")
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ApiModelProperty(example = "10/10/2020")
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @ApiModelProperty(example = "Diki")
    @Column(name = "name")
    private String name;

    @ApiModelProperty(example = "Visits")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

}
