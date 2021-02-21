package com.example._2.domain;

import javax.persistence.Embeddable;

@Embeddable
public enum OrderStatus {
    IN_CARD , ORDERED , CANCLED
}
