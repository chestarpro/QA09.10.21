package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String surname;

    @Column(unique = true)
    private int phone;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
