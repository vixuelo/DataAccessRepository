 package es.centroafuera.ad.hibernate.ejemplo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

              public class departamentoManager {

                public static void main(String[] args) {

                    SessionFactory sessionFactory = new
                       Configuration().configure().buildSessionFactory();
                    Session session = sessionFactory.getCurrentSession();
                    Transaction tx = session.beginTransaction();

                    departamento dept = new departamento();
                    dept.setDept_no(12000000);
					dept.setDnombre("Historia");
                    

                    session.save(dept);
                    tx.commit();

                    System.out.println 
                            ("Departamento " + dept.getDnombre()+ " guardado en la BBDD Correctamente");

                }
              }
            