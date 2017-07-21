/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Catagory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author B4
 */
public class ListDao {
    public List catList(){
      SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
    List<Catagory> cList = session.createQuery("select al from catagory al").list();
        
    cList.toString();
        session.close();
   // return null;
    return cList;
    } 
    public List<Catagory> catListByName(String name){
      SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
    List<Catagory> cList = session.createQuery("select al from Catagory al where lower(catName)='"+name.toLowerCase()+"'").list();
        
    cList.toString();
        session.close();
   // return null;
    return cList;
    }
}
