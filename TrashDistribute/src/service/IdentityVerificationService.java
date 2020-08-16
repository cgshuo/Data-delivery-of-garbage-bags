/**
 * IdentityVerificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface IdentityVerificationService extends java.rmi.Remote {
    public void unbindOpenID(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean checkPhone(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean checkOpenid(java.lang.String arg0) throws java.rmi.RemoteException;
    public int[] getPropertysByPhone(java.lang.String arg0) throws java.rmi.RemoteException;
    public void insertOpenid(int arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean checkPhoneAndPWD(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean updateDataBase(int arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean updatePhoneAndPWD(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public int hasBindProperty(java.lang.String arg0) throws java.rmi.RemoteException;
}
