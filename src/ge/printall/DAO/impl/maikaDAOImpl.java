package ge.printall.DAO.impl;


import ge.printall.DAO.MaikaDAO;
import ge.printall.entity.MaikebiEntity;
import ge.printall.hibernateUtil.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class maikaDAOImpl implements MaikaDAO {
    @Override
    public void getMaikaByJanri(long janriId) throws SQLException {

    }

    @Override
    public void getAllMaika(long janriId) throws SQLException {
        Session session = null;
        List maikebiList = new ArrayList();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            maikebiList = session.createCriteria(MaikebiEntity.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }


}
