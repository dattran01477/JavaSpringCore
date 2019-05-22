package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Category;

@Repository
@Transactional
public class CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Category category) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(category);
	}

}
