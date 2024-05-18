package a1_22BI13034;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;
import utils.AttrRef;
import utils.DOpt;


/**
 * @overview Person represents someone join into the seminar
 * @attributes
 *  id 		Integer		int
 *  name 	String 
 *  phone	MobilePhone	 
 * @object a typical Person object is p=<id,name>, where id(i), name(n)
 * @abstract_properties
 *  mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\
 *  mutable(name)=true /\ optional(name)=false /\ length(name)=30 /\
 *  mutable(phone)=true /\ optional(phone)=true 
 */
public class Person {
	// state space - attributes
	@DomainConstraint(mutable = false, optional = false, min = 1)
	private int id;
	
	@DomainConstraint(mutable = true, optional = false, length = 30)
	private String name;
	
	@DomainConstraint(mutable = true, optional = true)
	private MobilePhone phone;
	
	// 	behavior space - methods
//	publlic return_type methodName(param_type paramName, param_type2 paramName2, ...) {...}
	
	// 	constructor
	/**
	 * @modifies this.id, this.name
	 * @effects
	 * 	if id, name are valid
	 * 		initialize this as <id,name>
	 * 	else
	 * 		throws NotPossibleException
	 * 

	 * **/
	public Person(
			@AttrRef("id") int id,
			@AttrRef("name")String name) throws NotPossibleException {
		// TODO: check id, name are valid
		if(!validateId(id)) {
			throw new NotPossibleException("Inavalid id!");
		}
		
		if(!validateName(name)) {
			throw new NotPossibleException("Inavalid name!");
		}
		
		this.id = id;
		this.name = name;
	}

	//	getters - foreach atts -> getter
	
	/**
	* @effects return this.id
	*/
	@DOpt(type=OptType.Observer) @AttrRef("id")
	public int getId() {
		return this.id;
	}
	
	/**
	* @effects return this.name
	*/
	@DOpt(type=OptType.Observer) @AttrRef("name")
	public String getName() {
		return this.name;
	}
	
	/**
	* @effects return this.phone
	*/
	@DOpt(type=OptType.Observer) @AttrRef("phone")
	public MobilePhone getPhone() {
		return this.phone;
	}
	
	// 	mutator - setters: mutable = true -> setter 
	/**
	* @effects <pre>
	* 	if newId is valid 
	* 		set this.id = newId
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	@DOpt(type = OptType.Mutator) @AttrRef("name")
	public boolean setId(int newId) {
		if (validateId(newId)) {
			this.id = newId;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* @effects <pre>
	* 	if newName is valid 
	* 		set this.name = newName
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	@DOpt(type = OptType.Mutator) @AttrRef("name")
	public boolean setName(String newName) {
		if (validateName(newName)) {
			this.name = newName;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* @effects <pre>
	* 	if newPhone is valid 
	* 		set this.name = name
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	@DOpt(type = OptType.Mutator) @AttrRef("phone")
	public boolean setPhone(MobilePhone newPhone) {
		if (validatePhone(newPhone)) {
			this.phone = newPhone;
			return true;
		} else {
			return false;
		}
	}
	
	// 	helper - validators
	
	/**
	* @effects <pre>
	* 	if id is valid 
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	public boolean validateId(int id) {
		
//		if (id >= 1) {
//			return true;
//		}else{
//			return false;
//		}
		
		// min
		if (id < 1) {
			return false;
		}
		
		return true;
	}
	
	/**
	* @effects <pre>
	* 	if name is valid 
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	public boolean validateName(String name) {
		// optional
		if(name == null || name == "" || name.length() ==0) {
			return false;
		}
		
		// max length
		if(name.length() > 30) {
			return false;
		}
		return true;
	}
	
	/**
	* @effects <pre>
	* 	if phone is valid 
	* 		return true 
	* 	else
	* 		return false
	* </pre>
	*/
	
	public boolean validatePhone(MobilePhone phone) {
		// optional = true
		if (phone != null) {
			if (!phone.repOK()) {
				return false;
			}
		}
		
		return true;
	}
	//	repOK
	/**
	 * @effects <pre>
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	public boolean repOK() {
		if(validateId(this.id) && validateName(this.name) && validatePhone(this.phone)) {
			return true;
		}else {
			return false;
		}
	}
	//	toString
	public String toString() {
		return "Person <id = "+this.id+", name = "+this.name+", phone = "+this.phone+" >";
	}
	
}
	  
