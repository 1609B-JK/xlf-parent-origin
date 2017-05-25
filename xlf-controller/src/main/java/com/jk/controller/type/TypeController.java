package com.jk.controller.type;

import com.jk.pojo.ResultData;
import com.jk.pojo.type.MovieTypeResponse;
import com.jk.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
@Controller
@RequestMapping("/type/")
public class TypeController {
    @Autowired
    private TypeService typeService;


    @RequestMapping("select_movie_type_list")
    @ResponseBody
    public ResultData select_movie_type_list() {
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        List<MovieTypeResponse> listType = typeService.select_movie_type_list();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(listType);
        return rd;
    }
}
