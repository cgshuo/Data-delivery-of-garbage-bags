/**
 * BagRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BagRecord  implements java.io.Serializable {
    private int amount;

    private int id;

    private int propertyID;

    private java.util.Calendar recTime;

    private service.WxPropert wxPropert;

    public BagRecord() {
    }

    public BagRecord(
           int amount,
           int id,
           int propertyID,
           java.util.Calendar recTime,
           service.WxPropert wxPropert) {
           this.amount = amount;
           this.id = id;
           this.propertyID = propertyID;
           this.recTime = recTime;
           this.wxPropert = wxPropert;
    }


    /**
     * Gets the amount value for this BagRecord.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BagRecord.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the id value for this BagRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this BagRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the propertyID value for this BagRecord.
     * 
     * @return propertyID
     */
    public int getPropertyID() {
        return propertyID;
    }


    /**
     * Sets the propertyID value for this BagRecord.
     * 
     * @param propertyID
     */
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }


    /**
     * Gets the recTime value for this BagRecord.
     * 
     * @return recTime
     */
    public java.util.Calendar getRecTime() {
        return recTime;
    }


    /**
     * Sets the recTime value for this BagRecord.
     * 
     * @param recTime
     */
    public void setRecTime(java.util.Calendar recTime) {
        this.recTime = recTime;
    }


    /**
     * Gets the wxPropert value for this BagRecord.
     * 
     * @return wxPropert
     */
    public service.WxPropert getWxPropert() {
        return wxPropert;
    }


    /**
     * Sets the wxPropert value for this BagRecord.
     * 
     * @param wxPropert
     */
    public void setWxPropert(service.WxPropert wxPropert) {
        this.wxPropert = wxPropert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BagRecord)) return false;
        BagRecord other = (BagRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            this.id == other.getId() &&
            this.propertyID == other.getPropertyID() &&
            ((this.recTime==null && other.getRecTime()==null) || 
             (this.recTime!=null &&
              this.recTime.equals(other.getRecTime()))) &&
            ((this.wxPropert==null && other.getWxPropert()==null) || 
             (this.wxPropert!=null &&
              this.wxPropert.equals(other.getWxPropert())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAmount();
        _hashCode += getId();
        _hashCode += getPropertyID();
        if (getRecTime() != null) {
            _hashCode += getRecTime().hashCode();
        }
        if (getWxPropert() != null) {
            _hashCode += getWxPropert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BagRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "bagRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wxPropert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wxPropert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "wxPropert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
