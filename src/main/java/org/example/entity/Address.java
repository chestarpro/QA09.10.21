package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String city;

    @Column(length = 20)
    private String street;

    @Column(unique = true)
    private int home;

    @Column(length = 20)
    private String apartmentOffice;

    @Column(unique = true)
    private int porch;

    @Column(unique = true)
    private int floor;
}
