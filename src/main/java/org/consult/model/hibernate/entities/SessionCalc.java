package org.consult.model.hibernate.entities;
import java.util.ArrayList;
import java.util.Date;
//----import java.util.HashSet;
import java.util.List;
//----import java.util.Set;
//
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
//
@Entity
@Table(name = "SessionCalc",
  uniqueConstraints = { @UniqueConstraint(columnNames = { "session_id" }) })
public class SessionCalc {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "session_id")
private int session_id;
public int getSession_id() {
   return session_id;
}
//
@Column(name = "user_name", length = 20, nullable = false)
private String user_name;
public String getUser_name() {
   return user_name;
}
 
public void setUser_Name(String user_name) {
   this.user_name = user_name;
}
//
@Column(name = "date_session", nullable = false)
@Temporal(TemporalType.DATE)
private Date date_session;
public Date getDate_session() {
	return date_session;
}
public void setDate_session( Date date_session ) {
	this.date_session = date_session;
}
//
@OneToMany(mappedBy = "session_calc", cascade = CascadeType.ALL, orphanRemoval = true)
private List<ResultSessionCalc> results;
 
public SessionCalc() {

 }
public SessionCalc(String user_name, Date date_session) {
	   //this.session_id = session_id;
	   this.user_name = user_name;
	   this.date_session = date_session;
	   results = new ArrayList<ResultSessionCalc>();
	}
//
public void addResultSession( ResultSessionCalc result_session) {
    result_session.setSession(this);
    results.add(result_session);
}

public void removeREsultSession( ResultSessionCalc result_session) {
    results.remove(result_session);
}
//

/* 
public void setSession_id(Integer session_id) {
   this.session_id = session_id;
}
*/
 


//
//---- @OneToMany(fetch = FetchType.LAZY, mappedBy = "Session")
public List<ResultSessionCalc> getResults() {
   return results;
}
 
public void setResults(List<ResultSessionCalc> results) {
   this.results = results;
}
//
}
