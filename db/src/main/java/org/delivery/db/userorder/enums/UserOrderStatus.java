package org.delivery.db.userorder.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserOrderStatus {

    REGISTERED("등록"),
    UNREGISTERED("해지"),
    ORDER("주문"),
    ACCEPT("확인"),
    COOKING("요리중"),
    DELIVERY("배달중"),
    RECEIVE("배달 완료")
    ;

    /*UserOrderStatus(String description){
        this.description = description;
    }*/ // lombok 사용 안할때 주석 해제.

    private String description;
}
