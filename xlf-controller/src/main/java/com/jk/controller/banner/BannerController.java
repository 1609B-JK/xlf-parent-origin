package com.jk.controller.banner;

import com.jk.pojo.ResultData;
import com.jk.pojo.banner.Banner;
import com.jk.pojo.banner.BannerRequest;
import com.jk.pojo.banner.BannerResponse;
import com.jk.service.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
@Controller
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("select_banner_list")
    @ResponseBody
    public ResultData selectBannerList(@RequestBody BannerRequest bannerRequest) {
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        List<BannerResponse> listBanner = bannerService.select_banner_list();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(listBanner);
        return rd;
    }
}
