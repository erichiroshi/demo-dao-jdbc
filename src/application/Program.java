package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("==== TEST 2: sellers findByDepartment ====");
		List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
		sellers.forEach(System.out::println);

		System.out.println();
		System.out.println("==== TEST 3: sellers findAll ====");
		sellers = sellerDao.findAll();
		sellers.forEach(System.out::println);
		
		System.out.println();
		System.out.println("==== TEST 4: sellers insert ====");
		sellerDao.insert(new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, new Department(2, null)));
		
		
		seller = sellerDao.findById(5);
		
		seller.setName("Donald Trump");
		
		System.out.println();
		System.out.println("==== TEST 5: sellers update ====");
		sellerDao.update(seller);
		
		System.out.println();
		System.out.println("==== TEST 6: sellers delete ====");
		sellerDao.deleteById(13);
		
		
	}

}
