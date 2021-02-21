package com.example._2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    //mappedBy에는 @JoinColumn name에 적어준 컬럼이 속한 엔티티를 적어준다?
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
