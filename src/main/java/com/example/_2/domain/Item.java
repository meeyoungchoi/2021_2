package com.example._2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //질문 Album , Book , Movie 엔티티가 Item 엔티티를 상속받는 구조로 Item 엔티티가 만들어지는 것인가?
@DiscriminatorColumn(name = "dtype") // dtype으로 자식 엔티티를 구분하겠다
@Getter
@Setter
public abstract class Item { //질문 Item 엔티티를 추상클래스로 작성하는 이유?

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;




}
