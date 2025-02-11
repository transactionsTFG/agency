
package ucm.tfg.agency.soapclient.agency.user;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucm.tfg.agency.soapclient.agency.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserLoginSOAP_QNAME = new QName("http://soap/", "UserLoginSOAP");
    private final static QName _UserRegisterSOAP_QNAME = new QName("http://soap/", "UserRegisterSOAP");
    private final static QName _RegisterUser_QNAME = new QName("http://soap/", "registerUser");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://soap/", "registerUserResponse");
    private final static QName _LoginUser_QNAME = new QName("http://soap/", "loginUser");
    private final static QName _LoginUserResponse_QNAME = new QName("http://soap/", "loginUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucm.tfg.agency.soapclient.agency.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserLoginSOAP }
     * 
     */
    public UserLoginSOAP createUserLoginSOAP() {
        return new UserLoginSOAP();
    }

    /**
     * Create an instance of {@link UserRegisterSOAP }
     * 
     */
    public UserRegisterSOAP createUserRegisterSOAP() {
        return new UserRegisterSOAP();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLoginSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserLoginSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "UserLoginSOAP")
    public JAXBElement<UserLoginSOAP> createUserLoginSOAP(UserLoginSOAP value) {
        return new JAXBElement<UserLoginSOAP>(_UserLoginSOAP_QNAME, UserLoginSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegisterSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserRegisterSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "UserRegisterSOAP")
    public JAXBElement<UserRegisterSOAP> createUserRegisterSOAP(UserRegisterSOAP value) {
        return new JAXBElement<UserRegisterSOAP>(_UserRegisterSOAP_QNAME, UserRegisterSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

}
