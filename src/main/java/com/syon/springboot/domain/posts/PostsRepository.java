package com.syon.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//이 Interface 는 Dao 임.(DB Layer) JPA 에서는 Repository 라고 부르며, Interface 로 생성함.
//@Repository 는 필요 없으며, Entity Class 와 Entity Repository 는 함께 있어야 함.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
