package com.aplication.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.application.model.FourWheeler;
import com.application.model.TwoWheeler;
import com.application.model.Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("bike");
		bike.setSteeringHandle("bike steering wheel");

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVehicleName("Porsche");
		fourWheeler.setSteeringWheel("Porsche Steering  wheel");

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(fourWheeler);
		session.save(bike);
		session.getTransaction().commit();
	}

}
