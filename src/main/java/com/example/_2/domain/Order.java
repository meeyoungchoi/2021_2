package com.example._2.domain;

import lombok.Getter;

import javax.persistence.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    //JoinColumn은 Many에서 One 방향으로 접근할때 name에 적힌 fk를 
    //사용하여 접근하겠다는 의미이다
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(mappedBy = "order")
    private Delivery delivery;


    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)//질문 @Embedded 와 @Enumerated의 차이?
    private OrderStatus status;
}


