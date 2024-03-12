package com.management.product.model.dao;

import com.common.SearchCondition;
import org.apache.ibatis.annotations.*;

import com.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    List<ProductDTO> selectAllProductList();

    List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);

    int insertProduct(ProductDTO product);

    int updateProduct(ProductDTO product);



    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.

}
