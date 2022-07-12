package org.ccunix.eshop.service.impl;

import org.ccunix.eshop.dao.CategoryDao;
import org.ccunix.eshop.domian.dto.CategoryVO;
import org.ccunix.eshop.service.CategoryServiceIface;

import java.util.List;



public class CategoryServiceImpl implements CategoryServiceIface {
    CategoryDao categoryDao = new CategoryDao();//在service中调Dao

    @Override
    public List<CategoryVO> getCategoryList() {
        return categoryDao.selectCategoryList();//加上括号才能创建的是方法，不然创建的是变量
    }
}
