package kr.co.cofile.sbbshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cofile.sbbshop.dto.Favorite;
import kr.co.cofile.sbbshop.mapper.ShopMapper;

@Service
public class ShopService {

    @Autowired
    private ShopMapper favoriteMapper;

    public void addFavorite(Favorite favorite) {
        favoriteMapper.insertFavorite(favorite);
    }

    public List<Favorite> getFavoritesByUserId(int userId) {
        return favoriteMapper.selectFavoritesByUserId(userId);
    }
}
