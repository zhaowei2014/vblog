package com.dev.vblog.repository;

import com.dev.vblog.pojo.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 底层接口
 *
 * @author zw
 * @date 2020/8/31
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
