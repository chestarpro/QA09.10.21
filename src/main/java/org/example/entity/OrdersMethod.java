package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders_method")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrdersMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String method;
}