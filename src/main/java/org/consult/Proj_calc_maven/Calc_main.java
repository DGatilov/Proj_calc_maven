package org.consult.Proj_calc_maven;

import java.util.Date;

import org.consult.model.hibernate.entities.ResultSessionCalc;
import org.consult.model.hibernate.entities.SessionCalc;
import org.consult.services.SessionCalcService;

//import javax.imageio.spi.ServiceRegistry;

import org.consult.view.CalcWindow;
/*
import org.hibernate.AnnotationException;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
*/

public class Calc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String configFileName = "hibernate.cfg.xml";
		// Create the ServiceRegistry from hibernate-xxx.cfg.xml
	    //----- ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure(configFileName).build();
	   //
	   // AnnotationConfiguration aConf = new AnnotationException().addAnnotatedClass(webdb.books.Book.class);
       // sessionFactory = aConf.configure("hibernate.cfg.xml").buildSessionFactory();
	   //
       CalcWindow calc_v = new CalcWindow();
       calc_v.init();
	   System.out.println("CalcWindow !!!");	
	   //
	   SessionCalcService sess_calc_service = new SessionCalcService();
	   Date date = new Date();
       SessionCalc sess_calc = new SessionCalc("Dmitriy", date);
       sess_calc_service.saveCalcSession(sess_calc);
       //
       ResultSessionCalc result_sess = new ResultSessionCalc( 1 , "6 * 2 = 12");
       result_sess.setSession(sess_calc);
       sess_calc.addResultSession(result_sess);
       //
       ResultSessionCalc result_sess_2 = new ResultSessionCalc( 2 , "6 / 2 = 3");
       result_sess_2.setSession(sess_calc);
       sess_calc.addResultSession(result_sess_2);
       sess_calc.setUser_Name("Sarochka");
       sess_calc_service.updateSessionCalc(sess_calc);
       sess_calc_service.deleteSessionCalc(sess_calc);
	}

}
