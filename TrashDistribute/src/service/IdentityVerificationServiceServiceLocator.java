/**
 * IdentityVerificationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class IdentityVerificationServiceServiceLocator extends org.apache.axis.client.Service implements service.IdentityVerificationServiceService {

    public IdentityVerificationServiceServiceLocator() {
    }


    public IdentityVerificationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IdentityVerificationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IdentityVerificationServicePort
    private java.lang.String IdentityVerificationServicePort_address = "http://47.94.203.80/SH_CXF_Service/service/identityVerificaton";

    public java.lang.String getIdentityVerificationServicePortAddress() {
        return IdentityVerificationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IdentityVerificationServicePortWSDDServiceName = "IdentityVerificationServicePort";

    public java.lang.String getIdentityVerificationServicePortWSDDServiceName() {
        return IdentityVerificationServicePortWSDDServiceName;
    }

    public void setIdentityVerificationServicePortWSDDServiceName(java.lang.String name) {
        IdentityVerificationServicePortWSDDServiceName = name;
    }

    public service.IdentityVerificationService getIdentityVerificationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IdentityVerificationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIdentityVerificationServicePort(endpoint);
    }

    public service.IdentityVerificationService getIdentityVerificationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.IdentityVerificationServiceServiceSoapBindingStub _stub = new service.IdentityVerificationServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIdentityVerificationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIdentityVerificationServicePortEndpointAddress(java.lang.String address) {
        IdentityVerificationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.IdentityVerificationService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.IdentityVerificationServiceServiceSoapBindingStub _stub = new service.IdentityVerificationServiceServiceSoapBindingStub(new java.net.URL(IdentityVerificationServicePort_address), this);
                _stub.setPortName(getIdentityVerificationServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IdentityVerificationServicePort".equals(inputPortName)) {
            return getIdentityVerificationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "IdentityVerificationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "IdentityVerificationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IdentityVerificationServicePort".equals(portName)) {
            setIdentityVerificationServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
