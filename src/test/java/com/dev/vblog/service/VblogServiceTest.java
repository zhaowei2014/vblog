package com.dev.vblog.service;

import com.dev.vblog.pojo.Blog;
import com.dev.vblog.repository.BlogRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO:DOCUMENT ME!
 *
 * @author zw
 * @date 2020/8/31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class VblogServiceTest {
    @Autowired
    BlogRepository repository;

    @Test
    void pageList() {
        Page<Blog> all = repository.findAll(PageRequest.of(0, 2));
        all.getContent().forEach(System.out::println);
    }
}
