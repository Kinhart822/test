package a2_22BI13034.studentman;

import utils.*;

/**
 * @overview This represents an undergraduate student.
 * @attributes
 *    id 			Integer		int
 *    name 			String		String
 *    phoneNumber 	String		String
 *    address 		String		String
 * @object
 *    A  typical undergraduate student object is under_graduate_student=(id, name, phoneNumber, address).
 * @abstract_properties
 *    mutable(id)=false /\ optional(id)=false /\ min(id)=10^5 /\ max(id)=10^8 /\
 *    mutable(name)=true /\ optional(name)=false /\ length(name)=50 /\
 *    mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber)=10 /\
 *    mutable(address)=true /\ optional(address)=false /\ length(address)=100
 */

public class UndergradStudent extends Student {
    private static final float MINIMUM_ID=1e5f;
    private static final float MAXIMUM_ID=1e8f;

/**
 * @effects
 *    <pre>
 *     if id,name,phoneNumber,address are valid
 *     		set necessary attributes <id,name,phoneNumber,address>
 *     else throw NotPossibleException
 *   </pre>
 */
    public UndergradStudent(
            @AttrRef("id") int id,
            @AttrRef("name") String name,
            @AttrRef("phoneNumber") String phoneNumber,
            @AttrRef("address") String address) throws NotPossibleException {
        super(id, name, phoneNumber, address);
        if (!validate_id(this.getId())) {
            throw new NotPossibleException("Error, invalid ID for UndergradStudent" + name);
        }
    }

// Other methods
    @Override
    public String toString() {
        return String.format("UndergradStudent:<%d, %s, %s, %s>", this.getId(), this.getName(), this.getPhoneNumber(), this.getAddress());
    }

    @Override
    public String toHtmlDoc() {
        return String.format(
            "<html>\n<head><title>UndergradStudent:%d-%s</title></head>\n<body>\n%d %s %s %s\n</body></html>",
            id, name, id, name, phoneNumber, address
        );
    }

// Helper methods
    @Override
    @DomainConstraint(type="Integer", mutable=false, optional=false, min=MINIMUM_ID, max=MAXIMUM_ID)
    protected boolean validate_id(int id) {
        if (id < MINIMUM_ID || id > MAXIMUM_ID) {
            return false;
        }
        return true;
    }
}
