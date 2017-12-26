package com.kodilla.patterns.builder.bigmac;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter

public enum Rol {
    roolWithsesame("roll with sesame"), rollWithoutSesame("Roll OFF sesame");
    final String roll;
}
