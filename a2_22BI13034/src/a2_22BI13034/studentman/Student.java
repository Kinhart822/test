package a2_22BI13034.studentman;

import utils.*;

/**
 * @overview 
 * 		This represents a student of a university. There are two specific types of Students:
 * 		UndergradStudent (Undergraduate student) and PostgradStudent (Postgraduate student)
 * @attributes
 *    id 			Integer		int
 *    name 			String		String
 *    phoneNumber 	String		String
 *    address 		String		String
 * @object 
 * 		A typical Student object is student=(id, name, phoneNumber, address).
 * @abstract_properties
 *    mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\ max(id)=10^9 /\
 *    mutable(name)=true /\ optional(name)=false /\ length(name)=50 /\
 *    mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber)=10 /\
 *    mutable(address)=true /\ optional(address)=false /\ length(address)=100
 */

public class Student implements Comparable<Student>, Document {
    private static final int MINIMUM_ID=1;
    private static final int MAXIMUM_ID=(int) 1e9;
    private static final int LENGTH_NAME=50;
    private static final int LENGTH_ADDRESS=100;
    private static final int LENGTH_PHONE_NUMBER=10;

    @DomainConstraint(type="Integer", mutable=false, optional=false, min=MINIMUM_ID, max=MAXIMUM_ID)
    protected int id;

    @DomainConstraint(type="String", mutable=true, optional=false, length=LENGTH_NAME)
    protected String name;

    @DomainConstraint(type="String", mutable=true, optional=false, length=LENGTH_PHONE_NUMBER)
    protected String phoneNumber;

    @DomainConstraint(type="String", mutable=true, optional=false, length=LENGTH_ADDRESS)
    protected String address;

    /**
     * @effects
     * 		<pre>
     * 		if id,name,phoneNumber,address are valid,
     * 			Initialise <id,name,phoneNumber,address> 
     *		else throw NotPossibleException
     *		</pre>
    */
    public Student( @AttrRef("id") int id,
            @AttrRef("name") String name,
            @AttrRef("phoneNumber") String phoneNumber,
            @AttrRef("address") String address) throws NotPossibleException {
                if (this.validate_id(id)) {
            this.id=id;
        } else {
        	throw new NotPossibleException("Error, invalid ID for student " + name);
        }
        if (this.validate_name(name)) {
            this.name=name;
        } else {
            throw new NotPossibleException("Error, invalid name for student " + name);
        }
        if (this.validate_phoneNumber(phoneNumber)) {
            this.phoneNumber=phoneNumber;
        } else {
            throw new NotPossibleException("Error, invalid phone number for student " + name);
        }
        if (this.validate_address(address)) {
            this.address=address;
        } else {
            throw new NotPossibleException("Error, invalid address for student " + name);
        }
    }

    /**
     * A default constructor is required to initialize attributes in subclasses with different "id" attributes.
     *      The subclass checks the given parameters before setting the attributes,
     *      Making it necessary to have a separate constructor for initialization.
     */
    public Student() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = "";
        this.address = "";
    }
    											// Getter
    /**
     * @effects
     *   <pre>
     *   	return this.id
     *   </pre>
     */
    @DOpt(type=OptType.Observer) @AttrRef("id")
    public int getId() {
        return id;
    }
    /**
     * @effects
     *   <pre>
     *   	return this.name
     *   </pre>
     */
    @DOpt(type=OptType.Observer) @AttrRef("name")
    public String getName() {
        return name;
    }
    /**
     * @effects
     *   <pre>
     *   	return this.phoneNumber
     *   </pre>
     */
    @DOpt(type=OptType.Observer) @AttrRef("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * @effects
     *   <pre>
     *   	return this.address
     *   </pre>
     */
    @DOpt(type=OptType.Observer) @AttrRef("address")
    public String getAddress() {
        return address;
    }
    
    											// Setter
    /**
     * @effects
     *   <pre>
     *     	if input id is valid
     *     		set this.id to id
     *     		returns true 
     *    	else
     * 			return false
     *   </pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("id")
    public boolean setId(int id) {
        if (validate_id(id)) {
            this.id=id;
            return true;
        }
        return false;
    }
    /**
     * @effects
     *   <pre>
     *     	if input name is valid
     *     		set this.name to name
     *     		returns true 
     *    	else
     * 			return false
     *   </pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("name")
    public boolean setName(String name) {
        if (validate_name(name)) {
            this.name=name;
            return true;
        }
        return false;
    }
    /**
     * @effects
     *   <pre>
     *     	if input phoneNumber is valid
     *     		set this.phoneNumber to phoneNumber
     *     		returns true 
     *    	else
     * 			return false
     *   </pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("phoneNumber")
    public boolean setPhoneNumber(String phoneNumber) {
        if (validate_phoneNumber(phoneNumber)) {
            this.phoneNumber=phoneNumber;
            return true;
        }
        return false;
    }
    /**
     * @effects
     *   <pre>
     *     	if input address is valid
     *     		set this.address to address
     *     		returns true 
     *    	else
     * 			return false
     *   </pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("address")
    public boolean setAddress(String address) {
        if (validate_address(address)) {
            this.address=address;
            return true;
        }
        return false;
    }

    											// Method
    	// Helper method
    @DOpt(type=OptType.Helper)
    protected boolean validate_id(int id) {
        if (id < MINIMUM_ID || id > MAXIMUM_ID) {
            return false;
        } else {
        	return true;
        }
    }

    @DOpt(type=OptType.Helper)
    protected boolean validate_name(String name) {
        if (name == null || name.length() == 0 || name.length() > LENGTH_NAME) {
            return false;
        } else {
        	return true;
        }
    }

    @DOpt(type=OptType.Helper)
    protected boolean validate_phoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() == 0 || phoneNumber.length() > LENGTH_PHONE_NUMBER) {
            return false;
        } else {
        	return true;
        }
    }

    @DOpt(type=OptType.Helper)
    protected boolean validate_address(String address) {
        if (address == null || address.length() == 0 || address.length() > LENGTH_ADDRESS) {
            return false;
        } else {
        	return true;
        }
    }
    /**
     * @effects
     *   <pre>
     *   	if this satisfies abstract properties
     *     		return true 
     *     	else
     * 			return false
     *   </pre>
     */
    public boolean repOK() {
        boolean valid_id = validate_id(id);
        boolean valid_name = validate_name(name);
        boolean valid_phoneNumber = validate_phoneNumber(phoneNumber);
        boolean valid_address = validate_address(address);
        return valid_id && valid_name && valid_phoneNumber && valid_address;
    }
    /**
     * @effects
     *   <pre>
     *   	return a string representation of an object
     *   </pre>
     */
    @Override
    public String toString() {
        return String.format("Student information: <%d, %s, %s, %s>", this.getId(), this.getName(), this.getPhoneNumber(), this.getAddress());
    }
    /**
     * @effects
     *   <pre>
     *   	return a string representation of an object
     *   </pre>
     */
    @Override
    public int compareTo(Student input_student) throws ClassCastException, NullPointerException {
        if (input_student == null) {
            throw new NullPointerException("Input student is null! Please input again.");
        }
        if (!(input_student instanceof Student)) {
            throw new ClassCastException("Error");
        }
        return this.getName().compareTo(input_student.getName());
    }
    /**
     * @effects
     *   <pre>
     *   	return a string representation of an object
     *   </pre>
     */
    @Override
    public String toHtmlDoc() {
        return String.format(
            "<html>\n<head><title>Student: %d - %s</title></head>\n<body>\n%d %s %s %s\n</body></html>", id, name, id, name, phoneNumber, address);
    }										
}