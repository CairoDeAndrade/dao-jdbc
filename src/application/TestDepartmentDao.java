package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentDao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: insert department ===");
		Department dep = new Department(null, "Food");
		depDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n\n=== TEST 2: update department ===");
		dep.setId(7);
		dep.setName("Web");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		sc.close();

	}

}
