package com.demo.SpringBootWebClients.repo;

import com.demo.SpringBootWebClients.entity.Client;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Collections;
import java.util.List;
@Repository
public class ClientRepoImp implements ClientRepo{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Client> findAll() {

        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()){

            transaction = session.beginTransaction();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Client> cq = cb.createQuery(Client.class);
            Root<Client> root = cq.from(Client.class);
            cq.select(root);

            Query<Client> query = session.createQuery(cq);
            List<Client> list = query.getResultList();
            transaction.commit();
            return list;

        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            return Collections.emptyList();
        }
    }
}
