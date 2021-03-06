package com.anjani.restjersey;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name ="user")
public class User implements Serializable {

	private int id ;
	private String name;
	private String profession;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public boolean equals(Object object){
		if(object==null){
			return false;
		}
		else if (!(object instanceof User)) {
			return false;
		}
		else {
			User user=(User)object;
			if(id == user.getId() && name.equals(user.getName()) && profession.equals(user.getProfession()));{
				return true;
			}
			
		}
		
		
	}
	
	
}
