package tut01;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;

/**
* @overview Person represents 
* @attributes 
* id 	Integer		 INT
* name	String  	 String
* phone	MobilePhone 
* @object a typical Person object is p = <id,name> where id(id) and name(name)
* @abstract_properties 
* mutable(id) = false /\ optional(id) = false /\ min(id) = 1 /\
* mutable(name) = true /\ optional(name) = false /\ length(name) = 30 /\
* mutable(phone) = true /\ optional(phone) = true
* */
class Person {
	
	@DomainConstraint(mutable = false, optional = true, min = 1)
	private int id;
	@DomainConstraint(mutable = true, optional = false, length = 30)
	private String name;
	@DomainConstraint(mutable = true, optional = true)
	private MobilePhone phone;
	/**
	 * @effects return this.id
	 * **/
	@DOpt(type = OptType.Observer) @AttrRef ("id")
	public int get_Id() {
		return this.id;
	}
	@DOpt(type = OptType.Observer) @AttrRef("name")
	public String get_Name() {
		return this.name;
	}
	@DOpt(type = OptType.Observer) @AttrRef("phone")
	public MobilePhone get_Phone() {
		return this.phone;
	}
	
	@DOpt(type = OptType.Mutator) @AttrRef("id")
	public boolean set_Id(int id) {
		if(validateid(id)) {
			this.id = id;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @effects <pre>
	 * 	if name is valid
	 * 		set this.name = name
	 * 		return true
	 * 	else
	 * 		return false
	 * </pre>
	 * **/
	@DOpt(type = OptType.Mutator) @AttrRef("name")
	public boolean set_Name(String name) {
		if(validatename(name)) {
			this.name = name;
			return true;
		}
		else {
			return false;
		}
	}
	@DOpt(type = OptType.Mutator) @AttrRef("phone")
	public boolean set_Phone(MobilePhone phone) {
		if(validatephone(phone)) {
			this.phone = phone;
			return true;
		}
		else {
			return false;
		}
		
	}
	// behavior space - methods
	// public return_type methodName(param_type paramName, param_type2 paramName2) {}
	
	// constructor
	/** 
	 *  @modifies this.id, this.name
	 *  @effects  <pre>
	 *  	if id, name is valid
	 *  		initialize this as <id, name>
	 *  	else
	 *  		throws NotPossibleException
	 *  </pre>
	 * **/
	public Person(@AttrRef("id") int id,
				@AttrRef("name") String name) throws NotPossibleException {
		// TODO: check id id, name are valid
		if (!validateid(id)) {
			throw new NotPossibleException("Invalid ID!");
		}
		
		if (!validatename(name)) {
			throw new NotPossibleException("Invalid Name!");
		}
		
		this.id = id;
		this.name = name;
	}

	// getters - foreach atts -> getter
	
	// setters - mutator: mutable = true  -> setter
	
	
	// helper - validators
	/**
	 * @effects <pre>
	 * 	if id is valid
	 * 		return true
	 * 	else
	 * 		return false
	 * </pre>
	 * **/
	public boolean validateid(int id) {
		if(id <1) {
			return false;
		}
		return true;
	}
	
	public boolean validatename(String name) {
		//optional name = NULL
		if (name == null) {
			return false;
		}
		//length
		if(name.length() > 30 || name.length() == 0) {
			return false;
		}
		return true;
	}
	
	public boolean validatephone(MobilePhone mobilephone) {
		// optional = true
		// TODO: 
		if(mobilephone != null ) {
			if(!mobilephone.repOK()) {
				return false;
			}
		}
		return true;
	}
	
	
	// repOK
	/**
	 * @effects <pre>
	 * 	if this satisfies abstract properties
	 * 		return true
	 * 	else
	 * 		return false
	 * </pre>
	 * **/
	public boolean repOK() {
		if(validateid(this.id) && validatename(this.name) && validatephone(this.phone)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// toString
	
	public String toString() {
		return "Person <id = "+this.id+", name = "+this.name+", phone = "+this.phone+"> ";
	}
	
}

