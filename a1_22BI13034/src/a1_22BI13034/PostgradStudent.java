package a1_22BI13034;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;

/**
 * @overview This represents a postgraduate student.
 * @attributes
 * 	  id 			Integer		int
 *    name 			String		String
 *    phoneNumber 	String		String
 *    address 		String		String
 *    gpa			Float		float
 * @object
 *    A typical postgraduate student object is post_graduate_student=(id, name, phoneNumber, address, gpa).
 * @abstract_properties
 *    mutable(id)=false /\ optional(id)=false /\ min(id)=10^8 + 1 /\ max(id)=10^9 /\
 *    mutable(name)=true /\ optional(name)=false /\ length(name)=50 /\
 *    mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber)=10 /\
 *    mutable(address)=true /\ optional(address)=false /\ length(address)=100
 *    mutable(gpa)=true /\ optional(gpa)=false /\ min(gpa)=0.0 /\ max(gpa)=4.0
 */
public class PostgradStudent extends Student {
    @DomainConstraint(type="Float", optional=false, min=0.0, max=4.0)
    private float gpa;
    /**
     * @effects
     *   <pre>
     *     if id,name,phoneNumber,address,gpa are valid
     *     		set necessary attributes <id,name,phoneNumber,address,gpa>
     *     else throw NotPossibleException
     *   </pre>
     */
    public PostgradStudent( @AttrRef("id") int id,
            @AttrRef("name") String name,
            @AttrRef("phoneNumber") String phoneNumber,
            @AttrRef("address") String address,
            @AttrRef("gpa") float gpa) throws NotPossibleException {
            super(id, name, phoneNumber, address);
            if (!validate_gpa(gpa)) {
                throw new NotPossibleException("Error, invalid GPA for PostgradStudent" + name);
            }
            this.gpa=gpa;
    }
    											// Getter
    /**
	 * @effects
     *   <pre>
	 *     	return this.gpa
     *   </pre>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("gpa")
	public float getGpa() {
		return this.gpa;
	}
												// Setter
	/**
	 * @effects
     *   <pre>
     *     if gpa is valid
     *     		return true 
     *     else 
     *     		return false
	 *   </pre>
     */
	public boolean setGpa(float gpa) {
        if (this.validate_gpa(gpa)) {
            this.gpa=gpa;
            return true;
        }
        return false;
	}
												// Method
		// Helper method
	private boolean validate_gpa(float gpa) {
        if (gpa > 4.0) {
            return false;
        }
        return true;
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
	@Override
	public boolean repOK() {
        boolean valid_other_fields = super.repOK();
        boolean valid_gpa = this.validate_gpa(gpa);
        return valid_other_fields && valid_gpa;
    }
	@Override
	public String toString() {
		return String.format("PostgradStudent:<%d, %s, %s, %s, %f>", this.getId(), this.getName(), this.getPhoneNumber(), this.getAddress(), this.getGpa());
	}
}
