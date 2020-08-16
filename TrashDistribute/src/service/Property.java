/**
 * Property.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Property  implements java.io.Serializable {
    private service.Community communityID;

    private java.lang.String house;

    private int id;

    private int isBind;

    private java.lang.String password;

    private int propertyID;

    private java.lang.String tel;

    public Property() {
    }

    public Property(
           service.Community communityID,
           java.lang.String house,
           int id,
           int isBind,
           java.lang.String password,
           int propertyID,
           java.lang.String tel) {
           this.communityID = communityID;
           this.house = house;
           this.id = id;
           this.isBind = isBind;
           this.password = password;
           this.propertyID = propertyID;
           this.tel = tel;
    }


    /**
     * Gets the communityID value for this Property.
     * 
     * @return communityID
     */
    public service.Community getCommunityID() {
        return communityID;
    }


    /**
     * Sets the communityID value for this Property.
     * 
     * @param communityID
     */
    public void setCommunityID(service.Community communityID) {
        this.communityID = communityID;
    }


    /**
     * Gets the house value for this Property.
     * 
     * @return house
     */
    public java.lang.String getHouse() {
        return house;
    }


    /**
     * Sets the house value for this Property.
     * 
     * @param house
     */
    public void setHouse(java.lang.String house) {
        this.house = house;
    }


    /**
     * Gets the id value for this Property.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Property.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the isBind value for this Property.
     * 
     * @return isBind
     */
    public int getIsBind() {
        return isBind;
    }


    /**
     * Sets the isBind value for this Property.
     * 
     * @param isBind
     */
    public void setIsBind(int isBind) {
        this.isBind = isBind;
    }


    /**
     * Gets the password value for this Property.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Property.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the propertyID value for this Property.
     * 
     * @return propertyID
     */
    public int getPropertyID() {
        return propertyID;
    }


    /**
     * Sets the propertyID value for this Property.
     * 
     * @param propertyID
     */
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }


    /**
     * Gets the tel value for this Property.
     * 
     * @return tel
     */
    public java.lang.String getTel() {
        return tel;
    }


    /**
     * Sets the tel value for this Property.
     * 
     * @param tel
     */
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Property)) return false;
        Property other = (Property) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communityID==null && other.getCommunityID()==null) || 
             (this.communityID!=null &&
              this.communityID.equals(other.getCommunityID()))) &&
            ((this.house==null && other.getHouse()==null) || 
             (this.house!=null &&
              this.house.equals(other.getHouse()))) &&
            this.id == other.getId() &&
            this.isBind == other.getIsBind() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.propertyID == other.getPropertyID() &&
            ((this.tel==null && other.getTel()==null) || 
             (this.tel!=null &&
              this.tel.equals(other.getTel())));
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
        if (getCommunityID() != null) {
            _hashCode += getCommunityID().hashCode();
        }
        if (getHouse() != null) {
            _hashCode += getHouse().hashCode();
        }
        _hashCode += getId();
        _hashCode += getIsBind();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += getPropertyID();
        if (getTel() != null) {
            _hashCode += getTel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Property.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "property"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "community"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house");
        elemField.setXmlName(new javax.xml.namespace.QName("", "house"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
