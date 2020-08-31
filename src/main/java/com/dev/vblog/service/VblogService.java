package com.dev.vblog.service;

import com.dev.vblog.pojo.Blog;
import com.dev.vblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * TODO:DOCUMENT ME!
 *
 * @author zw
 * @date 2020/8/31
 */
@Service
public class VblogService {
    @Autowired
    private BlogRepository repository;

    public Page<Blog> pageList(Integer page, Integer size) {
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("", ExampleMatcher.GenericPropertyMatchers.exact());
//        Example<Blog> example = Example.of(new Blog(), matcher);
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }


}
