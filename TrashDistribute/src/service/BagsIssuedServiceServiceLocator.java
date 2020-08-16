/**
 * BagsIssuedServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BagsIssuedServiceServiceLocator extends org.apache.axis.client.Service implements service.BagsIssuedServiceService {

    public BagsIssuedServiceServiceLocator() {
    }


    public BagsIssuedServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BagsIssuedServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BagsIssuedServicePort
    private java.lang.String BagsIssuedServicePort_address = "http://47.94.203.80/SH_CXF_Service/service/bagsIssued";

    public java.lang.String getBagsIssuedServicePortAddress() {
        return BagsIssuedServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BagsIssuedServicePortWSDDServiceName = "BagsIssuedServicePort";

    public java.lang.String getBagsIssuedServicePortWSDDServiceName() {
        return BagsIssuedServicePortWSDDServiceName;
    }

    public void setBagsIssuedServicePortWSDDServiceName(java.lang.String name) {
        BagsIssuedServicePortWSDDServiceName = name;
    }

    public service.BagsIssuedService getBagsIssuedServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BagsIssuedServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBagsIssuedServicePort(endpoint);
    }

    public service.BagsIssuedService getBagsIssuedServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.BagsIssuedServiceServiceSoapBindingStub _stub = new service.BagsIssuedServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBagsIssuedServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBagsIssuedServicePortEndpointAddress(java.lang.String address) {
        BagsIssuedServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.BagsIssuedService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.BagsIssuedServiceServiceSoapBindingStub _stub = new service.BagsIssuedServiceServiceSoapBindingStub(new java.net.URL(BagsIssuedServicePort_address), this);
                _stub.setPortName(getBagsIssuedServicePortWSDDServiceName());
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
        if ("BagsIssuedServicePort".equals(inputPortName)) {
            return getBagsIssuedServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "BagsIssuedServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "BagsIssuedServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BagsIssuedServicePort".equals(portName)) {
            setBagsIssuedServicePortEndpointAddress(address);
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
