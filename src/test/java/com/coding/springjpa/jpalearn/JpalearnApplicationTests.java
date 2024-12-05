package com.coding.springjpa.jpalearn;

import com.coding.springjpa.jpalearn.entities.ProductEntity;
import com.coding.springjpa.jpalearn.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpalearnApplicationTests {

	/*@Autowired
	ProductRepository productRepository;*/
	@Test
	void contextLoads() {
	}

	/*
	@Test
	void testRepository(){
		ProductEntity productEntity=ProductEntity
				.builder()
				.sku("nestle1234").title("Nestle Chocolate").price(BigDecimal.valueOf(190.58)).quantity(20).build();
		ProductEntity savedProductEntity=productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}

	@Test
	void getRepository(){
		List<ProductEntity> list1=productRepository.findAll();
		System.out.println(list1);

		List<ProductEntity> list2=productRepository.findByTitle("Pepsi");
		System.out.println(list2);

		List<ProductEntity> list3=productRepository.findByCreatedAtAfter(LocalDateTime.of(2024,1,1,0,0,0));
		System.out.println(list3);

		List<ProductEntity> list4=productRepository.findByQuantityAndPrice(12,BigDecimal.valueOf(123.45));
		System.out.println(list4);

		List<ProductEntity> list5=productRepository.findByQuantityGreaterThanAndPriceLessThan(12,BigDecimal.valueOf(123.45));
		System.out.println(list5);

		List<ProductEntity> list6=productRepository.findByTitleLike("%Choco%");
		System.out.println(list6);

		List<ProductEntity> list7=productRepository.findByTitleContainingIgnoreCase("choCo");
		System.out.println(list7);
	}

	@Test
	void getSingleFromRepository(){
		Optional<ProductEntity> productEntityOptional=productRepository.findByTitleAndPrice("Nestle Chocolate",
				BigDecimal.valueOf(190.58));
		productEntityOptional.ifPresent(System.out::println);
	}*/
}
