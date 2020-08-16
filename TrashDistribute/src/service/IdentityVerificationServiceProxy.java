package service;

public class IdentityVerificationServiceProxy implements service.IdentityVerificationService {
  private String _endpoint = null;
  private service.IdentityVerificationService identityVerificationService = null;
  
  public IdentityVerificationServiceProxy() {
    _initIdentityVerificationServiceProxy();
  }
  
  public IdentityVerificationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIdentityVerificationServiceProxy();
  }
  
  private void _initIdentityVerificationServiceProxy() {
    try {
      identityVerificationService = (new service.IdentityVerificationServiceServiceLocator()).getIdentityVerificationServicePort();
      if (identityVerificationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)identityVerificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)identityVerificationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (identityVerificationService != null)
      ((javax.xml.rpc.Stub)identityVerificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.IdentityVerificationService getIdentityVerificationService() {
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService;
  }
  
  public void unbindOpenID(java.lang.String arg0) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    identityVerificationService.unbindOpenID(arg0);
  }
  
  public boolean checkPhone(java.lang.String arg0) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.checkPhone(arg0);
  }
  
  public boolean checkOpenid(java.lang.String arg0) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.checkOpenid(arg0);
  }
  
  public int[] getPropertysByPhone(java.lang.String arg0) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.getPropertysByPhone(arg0);
  }
  
  public void insertOpenid(int arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    identityVerificationService.insertOpenid(arg0, arg1);
  }
  
  public boolean checkPhoneAndPWD(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.checkPhoneAndPWD(arg0, arg1);
  }
  
  public boolean updateDataBase(int arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.updateDataBase(arg0, arg1);
  }
  
  public boolean updatePhoneAndPWD(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.updatePhoneAndPWD(arg0, arg1, arg2);
  }
  
  public int hasBindProperty(java.lang.String arg0) throws java.rmi.RemoteException{
    if (identityVerificationService == null)
      _initIdentityVerificationServiceProxy();
    return identityVerificationService.hasBindProperty(arg0);
  }
  
  
}