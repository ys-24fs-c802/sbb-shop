package kr.co.cofile.sbbshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cofile.sbbshop.dto.Favorite;
import kr.co.cofile.sbbshop.dto.Product;
import kr.co.cofile.sbbshop.service.NaverShoppingService;
import kr.co.cofile.sbbshop.service.ShopService;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    private NaverShoppingService naverShoppingService;

    @Autowired
    private ShopService favoriteService;

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam("query") String query) {
        return naverShoppingService.searchProducts(query);
    }

    @PostMapping("/favorites")
    public ResponseEntity<String> addFavorite(@RequestBody Favorite favorite) {
        favoriteService.addFavorite(favorite);
        return ResponseEntity.ok("Added to favorites");
    }

    @GetMapping("/favorites")
    public List<Favorite> getFavorites(@RequestParam("userId") int userId) {
        return favoriteService.getFavoritesByUserId(userId);
    }
}
