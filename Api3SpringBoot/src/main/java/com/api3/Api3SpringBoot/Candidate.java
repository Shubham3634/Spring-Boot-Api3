package com.api3.Api3SpringBoot;

public class Candidate {
	
	public int id;
	public String name;
	public String phoneno;
	public String departmentit;
	public String status;
	public String createddtm;
	public String createdby;
	public String updateddtm;
	public String updatedby;
	public int cid;
	
	public Candidate(int id, String name, String phoneno, String departmentit, String status, String createddtm,
			String createdby, String updateddtm, String updatedby, int cid) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.departmentit = departmentit;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
		this.cid = cid;
	}

}
