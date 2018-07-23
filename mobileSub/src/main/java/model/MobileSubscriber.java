package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class MobileSubscriber {
	
	private int ID;
	private String msisdn;
	private int customer_id_owner;
	private int customer_id_user;
	private String service_type;
	private long service_start_date;
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public int getCustomer_id_owner() {
		return customer_id_owner;
	}

	public void setCustomer_id_owner(int customer_id_owner) {
		this.customer_id_owner = customer_id_owner;
	}

	public int getCustomer_id_user() {
		return customer_id_user;
	}

	public void setCustomer_id_user(int customer_id_user) {
		this.customer_id_user = customer_id_user;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public long getService_start_date() {
		return service_start_date;
	}

	public void setService_start_date(long service_start_date) {
		this.service_start_date = service_start_date;
	}
	
	

}
