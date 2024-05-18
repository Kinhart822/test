package tutorial_3_1;

import utils.DomainConstraint;

/** 
 * @overview MoibilePhone represents
 * @attributes
 * manName		String 
 * model		String
 * color		Character
 * year 		Integer		INT
 * guaranteed	Boolean	
 * @object a typical MobilePhone object is phone = <n, m, c, y, g> where manName(n), model(m), color(c), year(y), guaranteed(g)
 * @abstract_properties
 * mutable(n) = false /\ optional(n) = false /\ length(n) = 10 /\
 * mutable(m) = false /\ optional(m) = false /\ length(m) = 15 /\
 * mutable(c) = true /\ optional(c) = true /\ length(c) = 15 /\
 * mutable(y) = false /\ optional(y) = false /\ length(y) = 4 /\ min(y) = 1973 /\ max(y) = 2024 /\
 * mutable(g) = true /\ optional(g) = false 
 * */
class MobilePhone {
	@DomainConstraint(mutable = false, optional = false, length = 10)
	private String manName;
	@DomainConstraint(mutable = false, optional = false, length = 15)
	private String model;
	@DomainConstraint(mutable = true, optional = true, length = 15)
	private String color;
	@DomainConstraint(mutable = false, optional = false, length = 4, min = 1973, max = 2024)
	private int year;
	@DomainConstraint(mutable = true, optional = false)
	private boolean guaranteed;
	
	public String get_ManName() {
		return manName;
	}
	
	public String get_Model() {
		return model;
	}
	
	public String get_Color() {
		return color;
	}
	
	public int get_Year() {
		return year;
	}
	
	public boolean get_Guaranteed() {
		return guaranteed;
	}
	
	public void set_ManName(String manName) {
		this.manName = manName;
	}
	
	public void set_Model(String model) {
		this.model = model;	
		
	}
	
	public void set_Color(String color) {
		this.color = color;
	}
	
	public void set_Year(int year) {
		this.year = year;
	}
	
	public void set_Guaranteed(boolean guaranteed) {
		this.guaranteed = guaranteed;
	}	
	
	// need a repOK
	public boolean repOK() {
		return true;
	}
}
	

