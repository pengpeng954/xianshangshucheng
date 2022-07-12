package org.ccunix.eshop.service;

import org.ccunix.eshop.domian.dto.CategoryVO;

import java.util.List;

public interface CategoryServiceIface {
    //获取商品列表信息
    List<CategoryVO> getCategoryList();
}
