package org.example.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Article;
import org.example.springbootdeveloper.dto.AddArticleRequest;
import org.example.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service //빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    //데이터베이스에 저장되어 있는 글을 모두 가져옴
    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    //데이터베이스에 저장되어 있는 글의 ID를 이용해 글을 조회
    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: + id"));
    }

    //데이터베이스에 저장되어 있는 글의 ID를 이용해 글을 삭제
    public void delete(long id) {
        blogRepository.deleteById(id);
    }
}
