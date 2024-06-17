package org.example.macarongraphql;

import lombok.RequiredArgsConstructor;
import org.example.macarongraphql.dao.ProductDao;
import org.example.macarongraphql.ds.Product;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class MacaronGraphqlApplication {

    private final ProductDao productDao;

    @Bean
    @Transactional
    @Profile("dev")
    public ApplicationRunner runner() {
        return args -> {
            var product1 = new Product(
                    null, "Caramel Apple", "caramel-apple.png",
                    "apple", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM001", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );
            var product2 = new Product(
                    null, "Chocolate Orange", "chocolate-orange.jpg",
                    "orange", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM002", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );
            var product3 = new Product(
                    null, "Cranberry Clementine", "cranberry-clementine.png",
                    "cranberry", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM003", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );
            var product4 = new Product(
                    null, "Pear, Vanilla and Banana", "pear-vanilla-cinnamon.png",
                    "pear, banana", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM004", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );
            var product5 = new Product(
                    null, "Quince Cobnut", "quince-cobnut.png",
                    "quince", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM005", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );
            var product6 = new Product(
                    null, "Spiced Pumpkin", "spiced-pumpkin.png",
                    "pumpkin", 18.5, "Enjoy the taste of our indulgent Chocolate Orange Macarons. Bursting with 100% natural flavours, our perfectly proportioned treats are handcrafted in our kitchen and beautifully packaged for your enjoyment.",
                    "MACM006", "Ground Almonds (contains nuts) , Icing Sugar, Free Range Egg Whites (contains Eggs)", "300g", "We carefully package our macarons and use Royal Mail to post them to you under first class postage. We do not ship to international addresses outside of the UK."
            );

            productDao.saveAll(List.of(product1, product2, product3, product4, product5, product6));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(MacaronGraphqlApplication.class, args);
    }

}
