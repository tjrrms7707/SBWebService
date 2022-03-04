package org.sb.service.springboot.service;


import lombok.RequiredArgsConstructor;
import org.sb.service.springboot.domain.posts.PostsRepository;
import org.sb.service.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
