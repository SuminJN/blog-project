package com.blog.api.repository;

import com.blog.api.domain.Post;
import com.blog.api.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
