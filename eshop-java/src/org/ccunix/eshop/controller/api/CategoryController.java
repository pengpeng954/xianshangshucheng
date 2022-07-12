package org.ccunix.eshop.controller.api;

import com.alibaba.fastjson.JSON;
import org.ccunix.eshop.domian.dto.CategoryVO;
import org.ccunix.eshop.service.CategoryServiceIface;
import org.ccunix.eshop.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
 * 商品类型管理  增 删 改 查
 * */
@WebServlet("/api/category")
public class CategoryController extends HttpServlet {
    CategoryServiceIface categoryService = new CategoryServiceImpl();// 多态   在controller中调service
    String method = "";
    @Override
    //查找数据  删除数据
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        method = request.getParameter("m");// m  自定义的key
        if ("list".equals(method)){
            list(request,response);
        }else if ("del".equals(method)){
            delete(request,response);
        }
    }

    @Override
    // 添加数据  Post
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("add".equals(method)){
            add(request,response);
        }else if ("update".equals(method)){
            update(request,response);
        }
    }

    //method长的一样的方法
    //添加商品类型数据
    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {


    }
    //删除商品类型数据
    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


    }
    //查找商品类型数据
    private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       /* List<CategoryVO> categoryList = new ArrayList<>();
        CategoryVO vo = new CategoryVO();
        vo.setId(1);
        vo.setCateName("计算机类");
        vo.setCateDesc("计算机类型书籍描述");
        CategoryVO vo2 = new CategoryVO();
        vo2.setId(2);
        vo2.setCateName("英语类");
        vo.setCateDesc("英语类型书籍描述");
        CategoryVO vo3 = new CategoryVO();
        vo3.setId(3);
        vo3.setCateName("历史类");
        vo3.setCateDesc("历史类型书籍描述");

        categoryList.add(vo);
        categoryList.add(vo2);
        categoryList.add(vo3);*/

        List<CategoryVO> categoryList = categoryService.getCategoryList();//获得商品列表信息

        //把对象转换成json字符串
        String data = JSON.toJSONString(categoryList);

        //写回到前端
        response.getWriter().write(data);
    }
    //更新商品类型数据
    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


    }

}