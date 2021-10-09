package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String status;

    @JoinColumn(name = "orders_method_id")
    private OrdersMethod ordersMethod;

    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @JoinColumn(name = "address_id")
    private Address address;
}

