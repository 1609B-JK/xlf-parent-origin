package com.jk.service.banner.impl;


import com.jk.mapper.banner.BannerDao;
import com.jk.pojo.banner.BannerResponse;
import com.jk.service.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<BannerResponse> select_banner_list() {
        return bannerDao.select_banner_list();
    }
}
