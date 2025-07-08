package com.metaverse.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 이 두개로 메서드를 안써도 축약됨
@NoArgsConstructor
public class Star {
    String name;
    int age;
}
