package br.com.douglas.petshop.model;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ordem_servico")
public class OrdemServico {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "ordem_id", nullable = false)
        private Long ordemId;

        @Column(name = "servico_id", nullable = false)
        private Long servicoId;

        @Column(nullable = false, precision = 10, scale = 2)
        private BigDecimal valor;
}
