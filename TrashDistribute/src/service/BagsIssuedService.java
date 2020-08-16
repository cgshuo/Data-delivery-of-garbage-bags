/**
 * BagsIssuedService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BagsIssuedService extends java.rmi.Remote {
    public int getCommunity(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean updateAmountByWx(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public int getAmountByWx(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public boolean outBag(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public boolean checkMatch(int arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public service.BagRecord[] getRecords(int arg0) throws java.rmi.RemoteException;
}
