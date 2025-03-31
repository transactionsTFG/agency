
package ucm.tfg.agency.soapclient.airlinereservation;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucm.tfg.agency.soapclient.airlinereservation package. 
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

    private final static QName _MakeFlightReservationSOAP_QNAME = new QName("http://soap/", "MakeFlightReservationSOAP");
    private final static QName _ModifyFlightReservationRequestionSOAP_QNAME = new QName("http://soap/", "ModifyFlightReservationRequestionSOAP");
    private final static QName _DelFlightReservation_QNAME = new QName("http://soap/", "delFlightReservation");
    private final static QName _DelFlightReservationResponse_QNAME = new QName("http://soap/", "delFlightReservationResponse");
    private final static QName _MakeFlightReservation_QNAME = new QName("http://soap/", "makeFlightReservation");
    private final static QName _MakeFlightReservationResponse_QNAME = new QName("http://soap/", "makeFlightReservationResponse");
    private final static QName _ModFlightReservation_QNAME = new QName("http://soap/", "modFlightReservation");
    private final static QName _ModFlightReservationResponse_QNAME = new QName("http://soap/", "modFlightReservationResponse");
    private final static QName _SearchFlightReservation_QNAME = new QName("http://soap/", "searchFlightReservation");
    private final static QName _SearchFlightReservationResponse_QNAME = new QName("http://soap/", "searchFlightReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucm.tfg.agency.soapclient.airlinereservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifyFlightReservationRequestionSOAP }
     * 
     */
    public ModifyFlightReservationRequestionSOAP createModifyFlightReservationRequestionSOAP() {
        return new ModifyFlightReservationRequestionSOAP();
    }

    /**
     * Create an instance of {@link MakeFlightReservationSOAP }
     * 
     */
    public MakeFlightReservationSOAP createMakeFlightReservationSOAP() {
        return new MakeFlightReservationSOAP();
    }

    /**
     * Create an instance of {@link DelFlightReservation }
     * 
     */
    public DelFlightReservation createDelFlightReservation() {
        return new DelFlightReservation();
    }

    /**
     * Create an instance of {@link DelFlightReservationResponse }
     * 
     */
    public DelFlightReservationResponse createDelFlightReservationResponse() {
        return new DelFlightReservationResponse();
    }

    /**
     * Create an instance of {@link MakeFlightReservation }
     * 
     */
    public MakeFlightReservation createMakeFlightReservation() {
        return new MakeFlightReservation();
    }

    /**
     * Create an instance of {@link MakeFlightReservationResponse }
     * 
     */
    public MakeFlightReservationResponse createMakeFlightReservationResponse() {
        return new MakeFlightReservationResponse();
    }

    /**
     * Create an instance of {@link ModFlightReservation }
     * 
     */
    public ModFlightReservation createModFlightReservation() {
        return new ModFlightReservation();
    }

    /**
     * Create an instance of {@link ModFlightReservationResponse }
     * 
     */
    public ModFlightReservationResponse createModFlightReservationResponse() {
        return new ModFlightReservationResponse();
    }

    /**
     * Create an instance of {@link SearchFlightReservation }
     * 
     */
    public SearchFlightReservation createSearchFlightReservation() {
        return new SearchFlightReservation();
    }

    /**
     * Create an instance of {@link SearchFlightReservationResponse }
     * 
     */
    public SearchFlightReservationResponse createSearchFlightReservationResponse() {
        return new SearchFlightReservationResponse();
    }

    /**
     * Create an instance of {@link BookingDTO }
     * 
     */
    public BookingDTO createBookingDTO() {
        return new BookingDTO();
    }

    /**
     * Create an instance of {@link AgencyReservationSuccessDTO }
     * 
     */
    public AgencyReservationSuccessDTO createAgencyReservationSuccessDTO() {
        return new AgencyReservationSuccessDTO();
    }

    /**
     * Create an instance of {@link ReservationDTO }
     * 
     */
    public ReservationDTO createReservationDTO() {
        return new ReservationDTO();
    }

    /**
     * Create an instance of {@link StatusFlightDTO }
     * 
     */
    public StatusFlightDTO createStatusFlightDTO() {
        return new StatusFlightDTO();
    }

    /**
     * Create an instance of {@link UpdatePriceReservationDTO }
     * 
     */
    public UpdatePriceReservationDTO createUpdatePriceReservationDTO() {
        return new UpdatePriceReservationDTO();
    }

    /**
     * Create an instance of {@link UpdateReservationDTO }
     * 
     */
    public UpdateReservationDTO createUpdateReservationDTO() {
        return new UpdateReservationDTO();
    }

    /**
     * Create an instance of {@link IdFlightInstanceWithSeatsSOAP }
     * 
     */
    public IdFlightInstanceWithSeatsSOAP createIdFlightInstanceWithSeatsSOAP() {
        return new IdFlightInstanceWithSeatsSOAP();
    }

    /**
     * Create an instance of {@link ModifyFlightReservationRequestionSOAP.Flights }
     * 
     */
    public ModifyFlightReservationRequestionSOAP.Flights createModifyFlightReservationRequestionSOAPFlights() {
        return new ModifyFlightReservationRequestionSOAP.Flights();
    }

    /**
     * Create an instance of {@link MakeFlightReservationSOAP.Flights }
     * 
     */
    public MakeFlightReservationSOAP.Flights createMakeFlightReservationSOAPFlights() {
        return new MakeFlightReservationSOAP.Flights();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeFlightReservationSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeFlightReservationSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "MakeFlightReservationSOAP")
    public JAXBElement<MakeFlightReservationSOAP> createMakeFlightReservationSOAP(MakeFlightReservationSOAP value) {
        return new JAXBElement<MakeFlightReservationSOAP>(_MakeFlightReservationSOAP_QNAME, MakeFlightReservationSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyFlightReservationRequestionSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyFlightReservationRequestionSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ModifyFlightReservationRequestionSOAP")
    public JAXBElement<ModifyFlightReservationRequestionSOAP> createModifyFlightReservationRequestionSOAP(ModifyFlightReservationRequestionSOAP value) {
        return new JAXBElement<ModifyFlightReservationRequestionSOAP>(_ModifyFlightReservationRequestionSOAP_QNAME, ModifyFlightReservationRequestionSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelFlightReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelFlightReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "delFlightReservation")
    public JAXBElement<DelFlightReservation> createDelFlightReservation(DelFlightReservation value) {
        return new JAXBElement<DelFlightReservation>(_DelFlightReservation_QNAME, DelFlightReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelFlightReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelFlightReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "delFlightReservationResponse")
    public JAXBElement<DelFlightReservationResponse> createDelFlightReservationResponse(DelFlightReservationResponse value) {
        return new JAXBElement<DelFlightReservationResponse>(_DelFlightReservationResponse_QNAME, DelFlightReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeFlightReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeFlightReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeFlightReservation")
    public JAXBElement<MakeFlightReservation> createMakeFlightReservation(MakeFlightReservation value) {
        return new JAXBElement<MakeFlightReservation>(_MakeFlightReservation_QNAME, MakeFlightReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeFlightReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeFlightReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeFlightReservationResponse")
    public JAXBElement<MakeFlightReservationResponse> createMakeFlightReservationResponse(MakeFlightReservationResponse value) {
        return new JAXBElement<MakeFlightReservationResponse>(_MakeFlightReservationResponse_QNAME, MakeFlightReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModFlightReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModFlightReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modFlightReservation")
    public JAXBElement<ModFlightReservation> createModFlightReservation(ModFlightReservation value) {
        return new JAXBElement<ModFlightReservation>(_ModFlightReservation_QNAME, ModFlightReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModFlightReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModFlightReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modFlightReservationResponse")
    public JAXBElement<ModFlightReservationResponse> createModFlightReservationResponse(ModFlightReservationResponse value) {
        return new JAXBElement<ModFlightReservationResponse>(_ModFlightReservationResponse_QNAME, ModFlightReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightReservation")
    public JAXBElement<SearchFlightReservation> createSearchFlightReservation(SearchFlightReservation value) {
        return new JAXBElement<SearchFlightReservation>(_SearchFlightReservation_QNAME, SearchFlightReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightReservationResponse")
    public JAXBElement<SearchFlightReservationResponse> createSearchFlightReservationResponse(SearchFlightReservationResponse value) {
        return new JAXBElement<SearchFlightReservationResponse>(_SearchFlightReservationResponse_QNAME, SearchFlightReservationResponse.class, null, value);
    }

}
