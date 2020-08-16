package service;

public class BagsIssuedServiceProxy implements service.BagsIssuedService {
  private String _endpoint = null;
  private service.BagsIssuedService bagsIssuedService = null;
  
  public BagsIssuedServiceProxy() {
    _initBagsIssuedServiceProxy();
  }
  
  public BagsIssuedServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBagsIssuedServiceProxy();
  }
  
  private void _initBagsIssuedServiceProxy() {
    try {
      bagsIssuedService = (new service.BagsIssuedServiceServiceLocator()).getBagsIssuedServicePort();
      if (bagsIssuedService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bagsIssuedService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bagsIssuedService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bagsIssuedService != null)
      ((javax.xml.rpc.Stub)bagsIssuedService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BagsIssuedService getBagsIssuedService() {
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService;
  }
  
  public int getCommunity(java.lang.String arg0) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.getCommunity(arg0);
  }
  
  public boolean updateAmountByWx(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.updateAmountByWx(arg0, arg1);
  }
  
  public int getAmountByWx(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.getAmountByWx(arg0, arg1);
  }
  
  public boolean outBag(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.outBag(arg0, arg1);
  }
  
  public boolean checkMatch(int arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.checkMatch(arg0, arg1);
  }
  
  public service.BagRecord[] getRecords(int arg0) throws java.rmi.RemoteException{
    if (bagsIssuedService == null)
      _initBagsIssuedServiceProxy();
    return bagsIssuedService.getRecords(arg0);
  }
  
  
}