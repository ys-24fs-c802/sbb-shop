package kr.co.cofile.sbbshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.cofile.sbbshop.dto.Favorite;

@Mapper
public interface ShopMapper {
    void insertFavorite(Favorite favorite);
    List<Favorite> selectFavoritesByUserId(int userId);
}
