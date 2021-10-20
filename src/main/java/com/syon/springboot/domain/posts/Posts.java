package com.syon.springboot.domain.posts;

import com.syon.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Class 내 모든 Getter method 자동 생성
@Getter
//기본 생성자 자동 추가
@NoArgsConstructor
@Entity
//Setter method 가 없음. Entity method 에서는 절대 Setter 를 생성하지 않는다.
//해당 프로젝트에서는 @Builder 를 통해 제공되는 Builder Class 사용.
public class Posts extends BaseTimeEntity {

    @Id
    //GenerationType.IDENTITY = auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String Content){
        this.title = title;
        this.content = content;
    }


}
