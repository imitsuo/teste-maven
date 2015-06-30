package com.ike.hibernate;

import java.util.List;


import com.ike.domain.Fabricante;
import com.ike.domain.Produto;
import com.ike.util.*;
 
import org.hibernate.*;
 
public class HibernateTest {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
 
        Fabricante fabricante = new Fabricante("Vw");
        session.save(fabricante);
 
        session.save(new Produto("Fusca",fabricante));
        session.save(new Produto("Kombi",fabricante));
      
        session.getTransaction().commit();
 
        Query q = session.createQuery("From Produto ");
                 
        List<Produto> resultList = q.list();
        System.out.println("numero de Produtos:" + resultList.size());
        for (Produto next : resultList) {
            System.out.println("next produto: " + next);
        }
 
    }
    
}