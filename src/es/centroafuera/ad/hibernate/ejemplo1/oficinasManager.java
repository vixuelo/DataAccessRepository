 package es.centroafuera.ad.hibernate.ejemplo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

              public class oficinasManager {

                public static void main(String[] args) {

                    SessionFactory sessionFactory = new
                       Configuration().configure().buildSessionFactory();
                    Session session = sessionFactory.getCurrentSession();
                    Transaction tx = session.beginTransaction();

                    oficinas ofi = new oficinas();
                    ofi.setId(0);
                    ofi.setNombre("unacualquiera");
                    ofi.setFk_pais(0);
                    ofi.setDescripcion("nosequeponer");
                    

                    session.save(ofi);
                    tx.commit();

                    System.out.println 
                            ("Oficina " + ofi.getNombre()+ " guardado en la BBDD Correctamente");

                }
              }
            