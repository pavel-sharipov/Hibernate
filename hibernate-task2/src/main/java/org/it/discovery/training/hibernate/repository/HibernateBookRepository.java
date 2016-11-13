package org.it.discovery.training.hibernate.repository;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.it.discovery.training.hibernate.model.Book;
import org.it.discovery.training.hibernate.util.HibernateUtil;

import java.util.List;

/**
 * Created by Шарипов on 13.11.2016.
 */
public class HibernateBookRepository implements BookRepository {
    @Override
    public List<Book> findAll() {

        return null;
    }

    @Override
    public List<Book> findWithName(String name) {
        List<Book> books = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            criteria.add(Restrictions.eq("name", name));
            books = criteria.list();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findLikeName(String text) {
        return null;
    }

    @Override
    public List<Book> findWithMorePages(int pages) {
        return null;
    }

    @Override
    public List<Book> searchBooks(String name, int pages) {
        return null;
    }

    @Override
    public int findTotalPages() {
        return 0;
    }

    @Override
    public List<Book> findSortedBooks() {
        return null;
    }
}
