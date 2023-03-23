package com.company.repository;

import com.company.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    @Autowired
    private SessionFactory sessionFactory;

//    public EmployeeEntity getEmployeeByPhone(String phoneNumber) {
//        Session session = sessionFactory.openSession();
//        EmployeeEntity employee = session.find(EmployeeEntity.class, phoneNumber);
//        session.close();
//        return employee;
//    }

    public EmployeeEntity getEmployeeByPhone(String phoneNumber) {
        Session session = sessionFactory.openSession();
        Query<EmployeeEntity> query = session.createQuery("SELECT new EmployeeEntity(e.id, e.name, e.surName, e.phoneNumber, e.birthDate, e.status, e.type) FROM EmployeeEntity as e  where e.phoneNumber =:phoneNumber", EmployeeEntity.class);
        query.setParameter("phoneNumber", phoneNumber);

        EmployeeEntity employee  = query.getSingleResult();
        session.close();
        return employee;
    }
    public void save(EmployeeEntity entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }
}
