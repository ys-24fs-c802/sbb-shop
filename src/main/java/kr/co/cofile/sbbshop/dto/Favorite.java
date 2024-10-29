package kr.co.cofile.sbbshop.dto;

import lombok.Data;

@Data
public class Favorite {
	Long favorite_id;
    Long userId;
    String productId;
    String productName;
    String productUrl;
    String productImage;
}
