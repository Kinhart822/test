package tute05_6.progtrio.xref1;


import utils.DomainConstraint;
import utils.NotPossibleException;

/**
 * @overview
 *  Represent a line in a text-based document.
 *  
 * @attributes
 *  lineNo  Integer int
 *  
 * @object
 * 
 * @abstract_properties
 *  mutable(lineNo) = false /\ optional(lineNo)=false /\ min(lineNo)=1
 *  
 * @author dmle
 */
public class Line {
  @DomainConstraint(type="Integer",mutable=false,optional=false)
  private int lineNo;
  
  /**
   * @effects 
   *  if lineNo is valid
   *    set this.lineNo = lineNoe
   *  else
   *    throws NotPossibleException
   */
  public Line(int lineNo) throws NotPossibleException {
    //TODO: implement this
  }
  
  /**
   * @effects 
   *  return this.lineNo
   */
  public int getLineNo() {
    return lineNo;
  }
  
  /**
   * @effects return lineNo as String
   */
  @Override
  public String toString() {
    // TODO: implement this
    return null;
  }
  
  /**
   * @effects 
   *  if another is a Line that has the same lineNo as this.lineNo
   *    return true
   *  else
   *    return false
   */
  @Override
  public boolean equals(Object another) {
    // TODO: implement this
    return false;
  }
}
