package com.cts.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(book);
		System.out.println("Data Saved");
		
		
	}

	@Override
	public List<Book> listAllBook() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		CriteriaQuery<Book> criteriaQuery=criteriaBuilder.createQuery(Book.class);
		Root<Book> root=criteriaQuery.from(Book.class);
		criteriaQuery.select(root);
		Query<Book> query =session.createQuery(criteriaQuery);
		return query.getResultList();
		
	}

}
