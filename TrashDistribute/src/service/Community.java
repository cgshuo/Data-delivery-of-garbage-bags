/**
 * Community.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Community  implements java.io.Serializable {
    private int communityID;

    private java.lang.String communityName;

    private int id;

    public Community() {
    }

    public Community(
           int communityID,
           java.lang.String communityName,
           int id) {
           this.communityID = communityID;
           this.communityName = communityName;
           this.id = id;
    }


    /**
     * Gets the communityID value for this Community.
     * 
     * @return communityID
     */
    public int getCommunityID() {
        return communityID;
    }


    /**
     * Sets the communityID value for this Community.
     * 
     * @param communityID
     */
    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }


    /**
     * Gets the communityName value for this Community.
     * 
     * @return communityName
     */
    public java.lang.String getCommunityName() {
        return communityName;
    }


    /**
     * Sets the communityName value for this Community.
     * 
     * @param communityName
     */
    public void setCommunityName(java.lang.String communityName) {
        this.communityName = communityName;
    }


    /**
     * Gets the id value for this Community.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Community.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Community)) return false;
        Community other = (Community) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.communityID == other.getCommunityID() &&
            ((this.communityName==null && other.getCommunityName()==null) || 
             (this.communityName!=null &&
              this.communityName.equals(other.getCommunityName()))) &&
            this.id == other.getId();
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
        _hashCode += getCommunityID();
        if (getCommunityName() != null) {
            _hashCode += getCommunityName().hashCode();
        }
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Community.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "community"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
