package org.consult.services;
import java.util.List;

import org.consult.dao.*;
import org.consult.model.hibernate.entities.SessionCalc;
import org.consult.model.hibernate.entities.ResultSessionCalc;
//
public class SessionCalcService {
	 private SessionCalcDao session_calc_s_Dao = new SessionCalcDao();
     public SessionCalcService () {
	    }
     //
     public SessionCalc findSessionCalc(int session_id) {
         return session_calc_s_Dao.findById(session_id);
     }
     //
     public void saveCalcSession(SessionCalc sess_calc) {
    	 session_calc_s_Dao.save( sess_calc );
     }
     //
     public void deleteSessionCalc(SessionCalc sess_calc) {
         session_calc_s_Dao.delete(sess_calc);
     }
     //
     public void updateSessionCalc(SessionCalc sess_calc) {
         session_calc_s_Dao.update( sess_calc);
     }
     //
     public List<SessionCalc> findAllSessionCalc_s() {
         return session_calc_s_Dao.findAll();
     }
     //
     public ResultSessionCalc findREsultSessionCalcById(int session_id) {
         return session_calc_s_Dao.findResultSessionCalcById( session_id);
     }
}
