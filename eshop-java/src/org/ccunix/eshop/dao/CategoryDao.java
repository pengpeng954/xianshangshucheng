package org.ccunix.eshop.dao;

import org.ccunix.eshop.domian.dto.CategoryVO;
import org.ccunix.eshop.utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
* 数据库中category表进行交互的对象
* */
public class CategoryDao {
    public List<CategoryVO> selectCategoryList(){
        /*
         * 获得商品列表信息
         * */
        List<CategoryVO> list = new ArrayList<>();
        //1-获得数据库连接
        Connection connection = DataSource.getConnection();
        //2-操作数据库
        try {
            //2-1获得sql语句
            String sql = "select id,cateName,cateDesc FROM category";
            //2-2 获得承装sql的容器对象
            PreparedStatement ps = connection.prepareStatement(sql);
            //2-3 执行sql语句
            ResultSet set = ps.executeQuery();
            while (set.next()){
                CategoryVO category = new CategoryVO();
                category.setId(set.getInt("id"));
                category.setCateName(set.getString("cateName"));
                category.setCateDesc(set.getNString("cateDesc"));
                list.add(category);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //3- 关闭数据库
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    };

}
