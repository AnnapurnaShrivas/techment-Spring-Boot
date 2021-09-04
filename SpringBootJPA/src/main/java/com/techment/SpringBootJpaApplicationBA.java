package com.techment;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.dao.IBookDao;
import com.techment.dao.IProductDao;
import com.techment.entity.Author;
import com.techment.entity.Book;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplicationBA implements CommandLineRunner{

	@Autowired
	IBookDao iBookDao;
	
	@Autowired
	IAuthorDao iAuthorDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplicationBA.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
     System.out.println("======BOOKS AND AUTHOR=======");
	
     
     Author a1 = new Author("ravindranath");
     Author a2 = new Author("Rakesh kumar");
     Author a3 = new Author("Sumit kumar");
     Author a4 = new Author("Ebalaguru");
     Author a5 = new Author("Annapurna");
     
     
     iAuthorDao.save(a1);
     iAuthorDao.save(a2);
     iAuthorDao.save(a3);
     iAuthorDao.save(a4);
     iAuthorDao.save(a5);
     
     System.out.println("====================Inserted    Author====================");
     
     Book b1 = new Book("Quantitative", 600, a1);
     Book b2 = new Book("Apptitute", 700, a2);
     Book b3 = new Book("Java", 800, a3);
     Book b4 = new Book("Python", 900, a4);
     Book b5 = new Book("Spring", 500, a5);
     
     iBookDao.save(b1);
     iBookDao.save(b2);
     iBookDao.save(b3);
     iBookDao.save(b4);
     iBookDao.save(b5);
     
     System.out.println("=====================Inserted Book=====================");
     System.out.println("=================Queries==============");
     
     
     System.out.println("\n\n\n=====================FINDING ALL====================");
     List<Book> bks1 = iBookDao.findAll();
     bks1.forEach(System.out::println);
     
     
     System.out.println("\n\n\n=====================FIND BY AUTHOR NAME====================");
     List<Book> bks2 = iBookDao.findByAuthorName("Annapurna");
     bks2.forEach(System.out::println);
     
     System.out.println("\n\n\n=====================FIND PRICE BETWEEN 500 to 700====================");
     List<Book> bks3 = iBookDao.findByPriceBetween(500, 700);
     bks3.forEach(System.out::println);
	}

}
