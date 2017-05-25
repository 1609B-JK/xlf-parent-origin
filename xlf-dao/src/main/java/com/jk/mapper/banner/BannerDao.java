package com.jk.mapper.banner;

import com.jk.pojo.banner.BannerResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
public interface BannerDao {
    @Select(" select t_id as \"bannerID\", t_title as \"bannerTitle\", t_ImgPath as \"bannerImgPath\",t_linkurl as \"bannerLinkUrl\" from t_banners ")
    List<BannerResponse> select_banner_list();
}
