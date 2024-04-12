package a2_22BI13034.studentman;

import utils.*;

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
    private static final double MINIMUM_GPA=0.0f;
    private static final double MAXIMUM_GPA=4.0f;
    private static final float MINIMUM_ID=1e8f+1;
    private static final float MAXIMUM_ID=1e9f;
    
    @DomainConstraint(type="Float", optional=false, min=MINIMUM_GPA, max=MAXIMUM_GPA)
    private float gpa;
    /**
     * @effects
     *   <pre>
     *     if id,name,phoneNumber,address,gpa are valid
     *     		set necessary attributes <id,name,phoneNumber,address,gpa>
     *     else throw NotPossibleException
     *   </pre>
     */
    public PostgradStudent( 
            @AttrRef("id") int id,
            @AttrRef("name") String name,
            @AttrRef("phoneNumber") String phoneNumber,
            @AttrRef("address") String address,
            @AttrRef("gpa") float gpa
            ) throws NotPossibleException {
            super(id, name, phoneNumber, address);
            if (!validate_gpa(gpa) || !validate_id(id)) {
                throw new NotPossibleException("Error, invalid GPA or ID for PostgradStudent" + name);
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
        if (gpa < MINIMUM_GPA || gpa > MAXIMUM_GPA) {
            return false;
        }
        return true;
    }

    @Override
    @DomainConstraint(type="Integer", mutable=false, optional=false, min=MINIMUM_ID, max=MAXIMUM_ID)
    protected boolean validate_id(int id) {
        if (id < MINIMUM_ID || id > MAXIMUM_ID) {
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
    @Override
    public String toHtmlDoc() {
        return String.format("<html>\n" +
                "<head><title>PostgradStudent:%d-%s</title></head>\n" +
                "<body>\n" +
                "%d %s %s %s %f\n" +
                "</body></html>", id, name, id, name, phoneNumber, address, gpa);
    }
}
