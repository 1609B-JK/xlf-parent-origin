package com.jk.mapper.type;

import com.jk.pojo.type.MovieTypeResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
public interface TypeMapper {
    @Select(" select t_id as \"typeID\", t_name as \"typeName\", 'http://' as \"typeLink\" from t_movie_types where t_id > 0  ")
    List<MovieTypeResponse> select_movie_type_list();
}
