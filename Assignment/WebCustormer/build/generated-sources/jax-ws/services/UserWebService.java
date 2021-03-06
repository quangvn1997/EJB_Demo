
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserWebService {


    /**
     * 
     * @param codeDG
     * @param passDG
     * @return
     *     returns services.User1
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkUserCs", targetNamespace = "http://service/", className = "services.CheckUserCs")
    @ResponseWrapper(localName = "checkUserCsResponse", targetNamespace = "http://service/", className = "services.CheckUserCsResponse")
    @Action(input = "http://service/UserWebService/checkUserCsRequest", output = "http://service/UserWebService/checkUserCsResponse")
    public User1 checkUserCs(
        @WebParam(name = "codeDG", targetNamespace = "")
        int codeDG,
        @WebParam(name = "passDG", targetNamespace = "")
        int passDG);

    /**
     * 
     * @param codePin
     * @param codeUser
     * @return
     *     returns services.User1
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkUserKh", targetNamespace = "http://service/", className = "services.CheckUserKh")
    @ResponseWrapper(localName = "checkUserKhResponse", targetNamespace = "http://service/", className = "services.CheckUserKhResponse")
    @Action(input = "http://service/UserWebService/checkUserKhRequest", output = "http://service/UserWebService/checkUserKhResponse")
    public User1 checkUserKh(
        @WebParam(name = "CodeUser", targetNamespace = "")
        int codeUser,
        @WebParam(name = "CodePin", targetNamespace = "")
        int codePin);

    /**
     * 
     * @param user
     */
    @WebMethod
    @RequestWrapper(localName = "editUser", targetNamespace = "http://service/", className = "services.EditUser")
    @ResponseWrapper(localName = "editUserResponse", targetNamespace = "http://service/", className = "services.EditUserResponse")
    @Action(input = "http://service/UserWebService/editUserRequest", output = "http://service/UserWebService/editUserResponse")
    public void editUser(
        @WebParam(name = "user", targetNamespace = "")
        User1 user);

    /**
     * 
     * @param codeUser
     * @param moneyOrder
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editUserWithId", targetNamespace = "http://service/", className = "services.EditUserWithId")
    @ResponseWrapper(localName = "editUserWithIdResponse", targetNamespace = "http://service/", className = "services.EditUserWithIdResponse")
    @Action(input = "http://service/UserWebService/editUserWithIdRequest", output = "http://service/UserWebService/editUserWithIdResponse")
    public boolean editUserWithId(
        @WebParam(name = "codeUser", targetNamespace = "")
        int codeUser,
        @WebParam(name = "moneyOrder", targetNamespace = "")
        int moneyOrder);

}
