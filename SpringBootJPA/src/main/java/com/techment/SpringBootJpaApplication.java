package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner{

	@Autowired
	IProductDao iProductDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hello this is my first spring boot ");
		
//		Product product1 = new Product("Dell","laptop",45000);
//		Product product2 = new Product("mi","Mobile",25000);
		
		//iProductDao.save(product1);    // Save to product value in database
		//iProductDao.save(product2);  // withtout is ,, the data will not be inserted
		
		System.out.println("=========Inserted==============");
		System.out.println("====================Findind=================");
		
		
		//find any specific
//		Product product3 = iProductDao.findById(3).get();
//		System.out.println("Product values "+product3 );
		// or 
		
		/*
		Optional<Product> product = iProductDao.findById(3);
		if(product.isPresent())
		{
			System.out.println("Products details = "+product.get());
		}
		else
			System.out.println("no value with the give id");
		*/
		// to find all data
//		System.out.println("=================all data ========================");
//		List<Product> products =iProductDao.findAll();
//		products.forEach(System.out::println);
		
		
		/*
		 * count
		 */
//		System.out.println("================ counting value===========");
//		long totalProduct = iProductDao.count();
//		System.out.println("Total no. of product "+totalProduct);
		
		
		
		/*
		 * deleteById
		 */
		
//		System.out.println("=============Delete by Id================");
//		iProductDao.deleteById(3);
//		System.out.println(".........delected.......");
//		
//		//or
//		if(iProductDao.existsById(4))
//		{
//			iProductDao.deleteById(8);
//			System.out.println("deleted=============");
//		}
//		else 
//			System.out.println("no id is present");
//		
		
		/*
		 * custom fining
		 */
		
		System.out.println("===find by name============");
		List<Product> prod = iProductDao.findByName("Dell");
		System.out.println("PRODUCT "+prod);
		
		
		System.out.println("===find by Category============");
		List<Product> prodc = iProductDao.findByCategory("laptop");
		System.out.println("PRODUCT "+prodc);
		
		
		System.out.println("===find by Name and Category together============");
		List<Product> prodm = iProductDao.findByNameAndCategory("Dell", "laptop");
		System.out.println("PRODUCT anem and Category "+prodm);
	
	}

}
