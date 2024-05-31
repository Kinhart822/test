package tute05_6.progtrio.xref1;

import java.util.List;
import java.util.Map;

import utils.DomainConstraint;

/**
 * @overview
 *  Represent a text document.
 *  
 * @attributes
 *  wmap  Map<String,List<Line>>
 *  
 * @object
 * 
 * @abstract_properties
 *  mutable(wmap) = true /\ optional(wmap) = true /\ 
 *  size(wmap) > 0 -> 
 *    (for each (w,l) in wmap. 
 *      w.length > 1 /\ 
 *      l is List<Line> /\ size(l) > 0) /\ 
 *    (for all (w,l), (w',l') in wmap. equals(w,w') = false)
 * 
 * @author dmle
 *
 */
public class Document {
  @DomainConstraint(type="Map",mutable=true,optional=true)
  private Map<String,List<Line>> wmap;
  
  /**
   * @requires 
   *  doc != null
   * @effects
   *  if doc is not empty 
   *    initialise this.wmap to contain all entries (w,l) where
   *    w.length > 1 AND 
   *    size(l) > 0 AND
   *    for all Line i in l. w appears at line ith in doc 
   */
  public Document(String doc) {
    // TODO: implement this
  }
  
  /**
   * @effects
   *   if wmap is null
   *    return null
   *   else 
   *    return Map<String,List<Line>> in wmap
   */
  public Map<String,List<Line>> wordLocations() {
    // TODO: implement this
    return null;
  }
}
