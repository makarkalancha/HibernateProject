package org.mycompany.objects;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateDemo {
	private static SessionFactory factory;
	private static ServiceRegistry registry;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			// factory = new Configuration().configure().buildSessionFactory();
			createSessionFactory();
		} catch (Throwable e) {
			System.err.println("Failed to create sessionFactory object. " + e);

			throw new ExceptionInInitializerError(e);
		}

		HibernateDemo demo = new HibernateDemo();

		Exhibitor exhibitor1 = new Exhibitor();
		exhibitor1.setName("Hibernate exhibitor1");

		Exhibitor exhibitor2 = new Exhibitor();
		exhibitor2.setName("Hibernate exhibitor2");

		Exhibitor exhibitor3 = new Exhibitor();
		exhibitor3.setName("Hibernate exhibitor3");

		exhibitor1.setId(demo.addExhibitor(exhibitor1));
		exhibitor2.setId(demo.addExhibitor(exhibitor2));
		exhibitor3.setId(demo.addExhibitor(exhibitor3));

		demo.listExhibitor();
		
		
		System.exit(-1);;
	}

	public static void createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		registry = new StandardServiceRegistryBuilder().applySettings(
				configuration.getProperties()).build();
		factory = configuration.buildSessionFactory(registry);
	}

	public Integer addExhibitor(Exhibitor exhibitor) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer exhibitorId = null;
		try {
			tx = session.beginTransaction();
			exhibitorId = (Integer) session.save(exhibitor);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return exhibitorId;
	}

	public void listExhibitor() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// List<Exhibitor> exhibitors =
			// session.createQuery("FROM exhibitor").list();
			// Iterator<Exhibitor> iterator = exhibitors.iterator();
			// while(iterator.hasNext()){
			// Exhibitor exh = iterator.next();
			// System.out.println(">>>id:"+exh.getId());
			// System.out.println("name:"+exh.getName());
			// }

			List exhibitors = session.createQuery("FROM Exhibitor").list();
			Iterator iterator = exhibitors.iterator();
			while (iterator.hasNext()) {
				Exhibitor exh = (Exhibitor) iterator.next();
				System.out.println(">>>id:" + exh.getId());
				System.out.println("name:" + exh.getName());
			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateExhibitor(Exhibitor exhibitor) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// Exhibitor exhibitorFromDb = (Exhibitor) session.
			// get(Exhibitor.class, exhibitor.getId());
			session.save(exhibitor);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteExhibitor(Exhibitor exhibitor) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(exhibitor);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
