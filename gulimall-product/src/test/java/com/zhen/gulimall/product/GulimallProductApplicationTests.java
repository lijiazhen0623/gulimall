package com.zhen.gulimall.product;

import com.zhen.gulimall.product.entity.BrandEntity;
import com.zhen.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("手机品牌");
        boolean save = brandService.save(brandEntity);
        if (save) {
            System.out.println("保存成功");
        }
    }

}
