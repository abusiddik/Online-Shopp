/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Catagory;
import entity.SubCatagory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author Nayeem
 */
public class AddDao {
    public boolean addCatagory(Catagory cat){
        try{
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(cat);
        session.getTransaction().commit();
        session.close();
        return true;
        }
        catch(Exception e){
        return false;
        }
    }
    public boolean addSubCatagory(SubCatagory subcat){
        try{
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(subcat);
        session.getTransaction().commit();
        session.close();
        return true;
        }
        catch(Exception ex){
        return false;
        }
    }
}
