
package ucm.tfg.agency.soapclient.gatewayagency;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucm.tfg.agency.soapclient.gatewayagency package. 
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
    private final static QName _SearchAirlineHotelRequestSOAP_QNAME = new QName("http://soap/", "searchAirlineHotelRequestSOAP");
    private final static QName _GetTravelSOAP_QNAME = new QName("http://soap/", "GetTravelSOAP");
    private final static QName _DelFlightHotelReservation_QNAME = new QName("http://soap/", "delFlightHotelReservation");
    private final static QName _DelFlightHotelReservationResponse_QNAME = new QName("http://soap/", "delFlightHotelReservationResponse");
    private final static QName _GetFlightHotelReservation_QNAME = new QName("http://soap/", "getFlightHotelReservation");
    private final static QName _GetFlightHotelReservationResponse_QNAME = new QName("http://soap/", "getFlightHotelReservationResponse");
    private final static QName _MakeFlightHotelReservation_QNAME = new QName("http://soap/", "makeFlightHotelReservation");
    private final static QName _MakeFlightHotelReservationResponse_QNAME = new QName("http://soap/", "makeFlightHotelReservationResponse");
    private final static QName _ModFlightHotelReservation_QNAME = new QName("http://soap/", "modFlightHotelReservation");
    private final static QName _ModFlightHotelReservationResponse_QNAME = new QName("http://soap/", "modFlightHotelReservationResponse");
    private final static QName _SearchFlightHotel_QNAME = new QName("http://soap/", "searchFlightHotel");
    private final static QName _SearchFlightHotelResponse_QNAME = new QName("http://soap/", "searchFlightHotelResponse");
    private final static QName _SearchTravel_QNAME = new QName("http://soap/", "searchTravel");
    private final static QName _SearchTravelResponse_QNAME = new QName("http://soap/", "searchTravelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucm.tfg.agency.soapclient.gatewayagency
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchFlightHotelResponse }
     * 
     */
    public SearchFlightHotelResponse createSearchFlightHotelResponse() {
        return new SearchFlightHotelResponse();
    }

    /**
     * Create an instance of {@link SearchFlightHotelResponse.Return }
     * 
     */
    public SearchFlightHotelResponse.Return createSearchFlightHotelResponseReturn() {
        return new SearchFlightHotelResponse.Return();
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
     * Create an instance of {@link SearchAirlineHotelRequestSOAP }
     * 
     */
    public SearchAirlineHotelRequestSOAP createSearchAirlineHotelRequestSOAP() {
        return new SearchAirlineHotelRequestSOAP();
    }

    /**
     * Create an instance of {@link GetTravelSOAP }
     * 
     */
    public GetTravelSOAP createGetTravelSOAP() {
        return new GetTravelSOAP();
    }

    /**
     * Create an instance of {@link DelFlightHotelReservation }
     * 
     */
    public DelFlightHotelReservation createDelFlightHotelReservation() {
        return new DelFlightHotelReservation();
    }

    /**
     * Create an instance of {@link DelFlightHotelReservationResponse }
     * 
     */
    public DelFlightHotelReservationResponse createDelFlightHotelReservationResponse() {
        return new DelFlightHotelReservationResponse();
    }

    /**
     * Create an instance of {@link GetFlightHotelReservation }
     * 
     */
    public GetFlightHotelReservation createGetFlightHotelReservation() {
        return new GetFlightHotelReservation();
    }

    /**
     * Create an instance of {@link GetFlightHotelReservationResponse }
     * 
     */
    public GetFlightHotelReservationResponse createGetFlightHotelReservationResponse() {
        return new GetFlightHotelReservationResponse();
    }

    /**
     * Create an instance of {@link MakeFlightHotelReservation }
     * 
     */
    public MakeFlightHotelReservation createMakeFlightHotelReservation() {
        return new MakeFlightHotelReservation();
    }

    /**
     * Create an instance of {@link MakeFlightHotelReservationResponse }
     * 
     */
    public MakeFlightHotelReservationResponse createMakeFlightHotelReservationResponse() {
        return new MakeFlightHotelReservationResponse();
    }

    /**
     * Create an instance of {@link ModFlightHotelReservation }
     * 
     */
    public ModFlightHotelReservation createModFlightHotelReservation() {
        return new ModFlightHotelReservation();
    }

    /**
     * Create an instance of {@link ModFlightHotelReservationResponse }
     * 
     */
    public ModFlightHotelReservationResponse createModFlightHotelReservationResponse() {
        return new ModFlightHotelReservationResponse();
    }

    /**
     * Create an instance of {@link SearchFlightHotel }
     * 
     */
    public SearchFlightHotel createSearchFlightHotel() {
        return new SearchFlightHotel();
    }

    /**
     * Create an instance of {@link SearchTravel }
     * 
     */
    public SearchTravel createSearchTravel() {
        return new SearchTravel();
    }

    /**
     * Create an instance of {@link SearchTravelResponse }
     * 
     */
    public SearchTravelResponse createSearchTravelResponse() {
        return new SearchTravelResponse();
    }

    /**
     * Create an instance of {@link BookingDTO }
     * 
     */
    public BookingDTO createBookingDTO() {
        return new BookingDTO();
    }

    /**
     * Create an instance of {@link MakeBookingReservationDTO }
     * 
     */
    public MakeBookingReservationDTO createMakeBookingReservationDTO() {
        return new MakeBookingReservationDTO();
    }

    /**
     * Create an instance of {@link ModifyBookingReservationDTO }
     * 
     */
    public ModifyBookingReservationDTO createModifyBookingReservationDTO() {
        return new ModifyBookingReservationDTO();
    }

    /**
     * Create an instance of {@link HotelFlightReservationDTO }
     * 
     */
    public HotelFlightReservationDTO createHotelFlightReservationDTO() {
        return new HotelFlightReservationDTO();
    }

    /**
     * Create an instance of {@link AgencyReservationSuccessDTO }
     * 
     */
    public AgencyReservationSuccessDTO createAgencyReservationSuccessDTO() {
        return new AgencyReservationSuccessDTO();
    }

    /**
     * Create an instance of {@link FlightHotelDTO }
     * 
     */
    public FlightHotelDTO createFlightHotelDTO() {
        return new FlightHotelDTO();
    }

    /**
     * Create an instance of {@link FlightListDTO }
     * 
     */
    public FlightListDTO createFlightListDTO() {
        return new FlightListDTO();
    }

    /**
     * Create an instance of {@link ReservationDTO }
     * 
     */
    public ReservationDTO createReservationDTO() {
        return new ReservationDTO();
    }

    /**
     * Create an instance of {@link RoomListDTO }
     * 
     */
    public RoomListDTO createRoomListDTO() {
        return new RoomListDTO();
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
     * Create an instance of {@link SearchFlightHotelResponse.Return.Entry }
     * 
     */
    public SearchFlightHotelResponse.Return.Entry createSearchFlightHotelResponseReturnEntry() {
        return new SearchFlightHotelResponse.Return.Entry();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAirlineHotelRequestSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchAirlineHotelRequestSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchAirlineHotelRequestSOAP")
    public JAXBElement<SearchAirlineHotelRequestSOAP> createSearchAirlineHotelRequestSOAP(SearchAirlineHotelRequestSOAP value) {
        return new JAXBElement<SearchAirlineHotelRequestSOAP>(_SearchAirlineHotelRequestSOAP_QNAME, SearchAirlineHotelRequestSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTravelSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTravelSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "GetTravelSOAP")
    public JAXBElement<GetTravelSOAP> createGetTravelSOAP(GetTravelSOAP value) {
        return new JAXBElement<GetTravelSOAP>(_GetTravelSOAP_QNAME, GetTravelSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelFlightHotelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelFlightHotelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "delFlightHotelReservation")
    public JAXBElement<DelFlightHotelReservation> createDelFlightHotelReservation(DelFlightHotelReservation value) {
        return new JAXBElement<DelFlightHotelReservation>(_DelFlightHotelReservation_QNAME, DelFlightHotelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelFlightHotelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelFlightHotelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "delFlightHotelReservationResponse")
    public JAXBElement<DelFlightHotelReservationResponse> createDelFlightHotelReservationResponse(DelFlightHotelReservationResponse value) {
        return new JAXBElement<DelFlightHotelReservationResponse>(_DelFlightHotelReservationResponse_QNAME, DelFlightHotelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightHotelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightHotelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getFlightHotelReservation")
    public JAXBElement<GetFlightHotelReservation> createGetFlightHotelReservation(GetFlightHotelReservation value) {
        return new JAXBElement<GetFlightHotelReservation>(_GetFlightHotelReservation_QNAME, GetFlightHotelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightHotelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightHotelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getFlightHotelReservationResponse")
    public JAXBElement<GetFlightHotelReservationResponse> createGetFlightHotelReservationResponse(GetFlightHotelReservationResponse value) {
        return new JAXBElement<GetFlightHotelReservationResponse>(_GetFlightHotelReservationResponse_QNAME, GetFlightHotelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeFlightHotelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeFlightHotelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeFlightHotelReservation")
    public JAXBElement<MakeFlightHotelReservation> createMakeFlightHotelReservation(MakeFlightHotelReservation value) {
        return new JAXBElement<MakeFlightHotelReservation>(_MakeFlightHotelReservation_QNAME, MakeFlightHotelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeFlightHotelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeFlightHotelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeFlightHotelReservationResponse")
    public JAXBElement<MakeFlightHotelReservationResponse> createMakeFlightHotelReservationResponse(MakeFlightHotelReservationResponse value) {
        return new JAXBElement<MakeFlightHotelReservationResponse>(_MakeFlightHotelReservationResponse_QNAME, MakeFlightHotelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModFlightHotelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModFlightHotelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modFlightHotelReservation")
    public JAXBElement<ModFlightHotelReservation> createModFlightHotelReservation(ModFlightHotelReservation value) {
        return new JAXBElement<ModFlightHotelReservation>(_ModFlightHotelReservation_QNAME, ModFlightHotelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModFlightHotelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModFlightHotelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modFlightHotelReservationResponse")
    public JAXBElement<ModFlightHotelReservationResponse> createModFlightHotelReservationResponse(ModFlightHotelReservationResponse value) {
        return new JAXBElement<ModFlightHotelReservationResponse>(_ModFlightHotelReservationResponse_QNAME, ModFlightHotelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightHotel")
    public JAXBElement<SearchFlightHotel> createSearchFlightHotel(SearchFlightHotel value) {
        return new JAXBElement<SearchFlightHotel>(_SearchFlightHotel_QNAME, SearchFlightHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightHotelResponse")
    public JAXBElement<SearchFlightHotelResponse> createSearchFlightHotelResponse(SearchFlightHotelResponse value) {
        return new JAXBElement<SearchFlightHotelResponse>(_SearchFlightHotelResponse_QNAME, SearchFlightHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTravel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTravel }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchTravel")
    public JAXBElement<SearchTravel> createSearchTravel(SearchTravel value) {
        return new JAXBElement<SearchTravel>(_SearchTravel_QNAME, SearchTravel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTravelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTravelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchTravelResponse")
    public JAXBElement<SearchTravelResponse> createSearchTravelResponse(SearchTravelResponse value) {
        return new JAXBElement<SearchTravelResponse>(_SearchTravelResponse_QNAME, SearchTravelResponse.class, null, value);
    }

}
