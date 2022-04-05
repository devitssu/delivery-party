package com.deliveryparty.app.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER", "사용자"),
    SHOP("ROLE_SHOP", "가게"),
    ADMIN("ROLE_ADMIN", "운영자");

    private final String key;
    private final String title;
}
