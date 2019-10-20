package org.consult.dao;

import org.consult.model.hibernate.entities.ResultSessionCalc;
import org.consult.model.hibernate.entities.SessionCalc;
//
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.consult.utils.HibernateSessionFactoryUtil;
import java.util.List;

public class SessionCalcDao {

    public SessionCalc findById(int session_id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(SessionCalc.class, session_id);
    }
    //
    public void save(SessionCalc sess_calc) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(sess_calc);
        tx1.commit();
        session.close();
    }
    //
    public void update(SessionCalc sess_calc ) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(sess_calc);
        tx1.commit();
        session.close();
    }
    //
    public void delete(SessionCalc sess_calc) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(sess_calc);
        tx1.commit();
        session.close();
    }
    //
    public ResultSessionCalc findResultSessionCalcById(int session_id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(ResultSessionCalc.class, session_id);
    }
    //
    public List<SessionCalc> findAll() {
        List<SessionCalc> SessionCalc_s = (List<SessionCalc>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From SessionCalc").list();
        return SessionCalc_s;
    }

}