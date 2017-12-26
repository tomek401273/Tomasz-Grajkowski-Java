package com.kodilla.rps;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GameAttribute {
    Paper(3, new Paper()),Scissors(2, new Scissors()),Rock(1, new Rock());
    final int id;
    final Data data;
}
