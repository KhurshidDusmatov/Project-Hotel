package com.company.repository;

import com.company.entity.EmployeeEntity;
import com.company.entity.RoomEntity;
import com.company.mapper.RoomComfortMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(RoomEntity entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    public List<RoomComfortMapper> getList() {
        Session session = sessionFactory.openSession();
        Query<RoomComfortMapper> query = session.createQuery("SELECT new com.company.mapper.RoomComfortMapper" +
                "( r.id, r.number, r.floorNumber, r.type, r.price, r.area," +
                " c.swimmingPool, c.sauna, c.karaoke, c.miniBar, c.tv, c.airConditioner) " +
                " FROM RoomEntity as r join r.comfortEntity c ", RoomComfortMapper.class);
        List<RoomComfortMapper> list = query.getResultList();
        session.close();
        return list;
    }

    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from RoomEntity where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    public RoomEntity find(int id) {
        Session session = sessionFactory.openSession();
        RoomEntity entity = session.find(RoomEntity.class, id);
        session.close();
        return entity;

        Session session = sessionFactory.openSession();
        Query<StudentEntity> query = session.createQuery("select s.id, s.name FROM StudentEntity as s where s.id =:id", StudentEntity.class);
        query.setParameter("id", id);

        StudentEntity student = query.getSingleResult();
        session.close();
        return student;
    }
}
