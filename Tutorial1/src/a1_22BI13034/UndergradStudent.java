package a1_22BI13034;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.NotPossibleException;

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

    @Override
    public String toString() {
        return String.format("UndergradStudent:<%d, %s, %s, %s>", this.getId(), this.getName(), this.getPhoneNumber(), this.getAddress());
    }
    @Override
    @DomainConstraint(type="Integer", mutable=false, optional=false, min=10^5, max=10^8)
    protected boolean validate_id(int id) {
        if (id < Math.pow(10,5) || id > Math.pow(10,8)) {
            return false;
        }
        return true;
    }
}
