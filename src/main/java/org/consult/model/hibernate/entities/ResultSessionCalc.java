package org.consult.model.hibernate.entities;

//
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.UniqueConstraint;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table( name = "ResultSession" )

public class ResultSessionCalc {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "number_operation")
    private int number_operation;

    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    @Column (name = "result")
    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_result_id")
    private SessionCalc session_calc;
    //
    public ResultSessionCalc() {
    	
    }
    //
    public ResultSessionCalc( int number_operation, String result ) {
    	this.number_operation = number_operation;
    	this.result = result;
    }
    //
    public int getId() {
        return id;
    }
    // 
    public int getNumberOperation() {
        return number_operation;
    }
    //
    public void setNumberOperation( int number_operation) {
        this.number_operation = number_operation;
    }
    //
    public String getResult() {
        return result;
    }

    public void setResult( String result) {
        this.result = result;
    }

    public SessionCalc getSession() {
        return session_calc;
    }

    public void setSession(SessionCalc session_calc) {
        this.session_calc = session_calc;
    }
    @Override
    public String toString() {
        return number_operation + " " + result;
    }
}
