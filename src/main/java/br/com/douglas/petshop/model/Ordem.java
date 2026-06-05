package br.com.douglas.petshop.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordem")
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dtOrdem;

    private String observacao;

    @Transient
    private Pet pet;

    @Column(name = "id_pet", nullable = false)
    private Long idPet;

    @Transient
    private List<Servico> servicos = new ArrayList<Servico>();

    public Ordem(LocalDateTime dtOrdem, String observacao, Pet pet, Long idPet, List<Servico> servicos) {
        this.dtOrdem = dtOrdem;
        this.observacao = observacao;
        this.pet = pet;
        this.idPet = idPet;
        this.servicos = servicos;
    }

}
