package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@Param("useId") Integer useId, @Param("productId")Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@Param("useId") Integer useId,@Param("productIdList")List<String> productIdList);

    int checkedOrUncheckedProduct(@Param("useId") Integer useId,@Param("productId")Integer productId, @Param("checked") Integer checked);

    int selectCartProductCount(@Param("useId") Integer useId);

    List<Cart> selectCheckedOrderByUserId(Integer userId);
}