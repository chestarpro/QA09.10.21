package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "basket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
