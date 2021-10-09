package org.example.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders_item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrdersItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_count")
    private Long productCount;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;
}
