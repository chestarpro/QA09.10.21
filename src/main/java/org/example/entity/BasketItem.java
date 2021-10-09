package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "basket_item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_count")
    private Long productCount;

    @ManyToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;
}