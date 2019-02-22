 package es.centroafuera.ad.hibernate.ejemplo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

              public class EmpleadoManager {

                public static void main(String[] args) {

                    SessionFactory sessionFactory = new
                       Configuration().configure().buildSessionFactory();
                    Session session = sessionFactory.getCurrentSession();
                    Transaction tx = session.beginTransaction();

                    Empleado empleado = new Empleado();
                    empleado.setNombre("Fatima");
					empleado.setApellido("Santana");
                    

                    session.save(empleado);
                    tx.commit();

                    System.out.println 
                            ("Empleado " + empleado.getNombre()+ " guardado en la BBDD Correctamente");

                }
              }
            