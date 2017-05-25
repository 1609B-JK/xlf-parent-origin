package com.jk.service.banner;

import com.jk.pojo.banner.BannerResponse;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
public interface BannerService {
    List<BannerResponse> select_banner_list();
}
