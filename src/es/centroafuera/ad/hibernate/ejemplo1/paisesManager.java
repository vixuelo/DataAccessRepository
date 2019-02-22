 package es.centroafuera.ad.hibernate.ejemplo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

              public class paisesManager {

                public static void main(String[] args) {

                    SessionFactory sessionFactory = new
                       Configuration().configure().buildSessionFactory();
                    Session session = sessionFactory.getCurrentSession();
                    Transaction tx = session.beginTransaction();

                    paises pais = new paises();
                    pais.setNombre("ESPAÑA");
                    

                    session.save(pais);
                    tx.commit();

                    System.out.println 
                            ("Pais " + pais.getNombre()+ " guardado en la BBDD Correctamente");

                }
              }
            