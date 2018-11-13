package com.slk.training.dao;

import java.util.*;
import com.slk.training.model.*;
public class ProductDaoImpl {

	List<productBean> products=new ArrayList<>();;
	
	public ProductDaoImpl() {
		
		productBean p1=new productBean("p01", "mobile charger",1500,30);
		productBean p2=new productBean("p02", "power bank",500,12);
		productBean p3=new productBean("p03", "Laptop",129900,3);
		productBean p4=new productBean("p04", "Head Phones",9500,56);
		productBean p5=new productBean("p05", "rachet",150,300);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);	
	}
	
	public List<productBean> getAllProducts(){
		return products;
	}
	
	public List<productBean> addProduct(){
		productBean p6=new productBean("p06", "Mechanical Keyboard", 4500, 27);
		products.add(p6);
		return products;
	}
}
