package edu.xiyou.BCS.service;


import edu.xiyou.BCS.model.CrawlBlog;

import java.util.List;

/**
 * Created by andrew on 15-12-8.
 */

//为操作博客提供服务
public interface CrawlBlogService {
    List<CrawlBlog> selectByselective(CrawlBlog record);

}
