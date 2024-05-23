package dev.codeshare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //GenerationType.IDENTITY 같은 경우 mysql 에서 자동으로 id를 부여해주는 방법이다.
    private Long id;

    //기본적으로 열을 표기 안 하고 하면 필드 이름과 같이 데이터베이스에 저장된다.
    private String content;

}
