

/* First created by JCasGen Sat Sep 20 11:22:18 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** the input sentence
 * Updated by JCasGen Tue Sep 23 15:00:14 EDT 2014
 * XML source: C:/Users/PengtaoXie/workspace/11791/git/hw1-pxie1/hw1-pxie1/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets id of the sentence
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets id of the sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets content of the string
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets content of the string 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_content, v);}    
  }

    