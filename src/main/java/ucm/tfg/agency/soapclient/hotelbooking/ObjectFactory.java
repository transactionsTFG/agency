
package ucm.tfg.agency.soapclient.hotelbooking;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucm.tfg.agency.soapclient.hotelbooking package. 
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

    private final static QName _CancelHotelBookingLine_QNAME = new QName("http://soap/", "cancelHotelBookingLine");
    private final static QName _CancelHotelBookingLineResponse_QNAME = new QName("http://soap/", "cancelHotelBookingLineResponse");
    private final static QName _MakeHotelBooking_QNAME = new QName("http://soap/", "makeHotelBooking");
    private final static QName _MakeHotelBookingResponse_QNAME = new QName("http://soap/", "makeHotelBookingResponse");
    private final static QName _ModifyHotelBooking_QNAME = new QName("http://soap/", "modifyHotelBooking");
    private final static QName _ModifyHotelBookingResponse_QNAME = new QName("http://soap/", "modifyHotelBookingResponse");
    private final static QName _ReadHotelBooking_QNAME = new QName("http://soap/", "readHotelBooking");
    private final static QName _ReadHotelBookingResponse_QNAME = new QName("http://soap/", "readHotelBookingResponse");
    private final static QName _CancelHotelBookingResponse_QNAME = new QName("http://soap/", "cancelHotelBookingResponse");
    private final static QName _CancelHotelBooking_QNAME = new QName("http://soap/", "cancelHotelBooking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucm.tfg.agency.soapclient.hotelbooking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelHotelBookingLine }
     * 
     */
    public CancelHotelBookingLine createCancelHotelBookingLine() {
        return new CancelHotelBookingLine();
    }

    /**
     * Create an instance of {@link CancelHotelBookingLineResponse }
     * 
     */
    public CancelHotelBookingLineResponse createCancelHotelBookingLineResponse() {
        return new CancelHotelBookingLineResponse();
    }

    /**
     * Create an instance of {@link MakeHotelBooking }
     * 
     */
    public MakeHotelBooking createMakeHotelBooking() {
        return new MakeHotelBooking();
    }

    /**
     * Create an instance of {@link MakeHotelBookingResponse }
     * 
     */
    public MakeHotelBookingResponse createMakeHotelBookingResponse() {
        return new MakeHotelBookingResponse();
    }

    /**
     * Create an instance of {@link ModifyHotelBooking }
     * 
     */
    public ModifyHotelBooking createModifyHotelBooking() {
        return new ModifyHotelBooking();
    }

    /**
     * Create an instance of {@link ModifyHotelBookingResponse }
     * 
     */
    public ModifyHotelBookingResponse createModifyHotelBookingResponse() {
        return new ModifyHotelBookingResponse();
    }

    /**
     * Create an instance of {@link ReadHotelBooking }
     * 
     */
    public ReadHotelBooking createReadHotelBooking() {
        return new ReadHotelBooking();
    }

    /**
     * Create an instance of {@link ReadHotelBookingResponse }
     * 
     */
    public ReadHotelBookingResponse createReadHotelBookingResponse() {
        return new ReadHotelBookingResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLine }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelHotelBookingLine")
    public JAXBElement<CancelHotelBookingLine> createCancelHotelBookingLine(CancelHotelBookingLine value) {
        return new JAXBElement<CancelHotelBookingLine>(_CancelHotelBookingLine_QNAME, CancelHotelBookingLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLineResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLineResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelHotelBookingLineResponse")
    public JAXBElement<CancelHotelBookingLineResponse> createCancelHotelBookingLineResponse(CancelHotelBookingLineResponse value) {
        return new JAXBElement<CancelHotelBookingLineResponse>(_CancelHotelBookingLineResponse_QNAME, CancelHotelBookingLineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeHotelBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeHotelBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeHotelBooking")
    public JAXBElement<MakeHotelBooking> createMakeHotelBooking(MakeHotelBooking value) {
        return new JAXBElement<MakeHotelBooking>(_MakeHotelBooking_QNAME, MakeHotelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeHotelBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeHotelBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeHotelBookingResponse")
    public JAXBElement<MakeHotelBookingResponse> createMakeHotelBookingResponse(MakeHotelBookingResponse value) {
        return new JAXBElement<MakeHotelBookingResponse>(_MakeHotelBookingResponse_QNAME, MakeHotelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyHotelBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyHotelBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyHotelBooking")
    public JAXBElement<ModifyHotelBooking> createModifyHotelBooking(ModifyHotelBooking value) {
        return new JAXBElement<ModifyHotelBooking>(_ModifyHotelBooking_QNAME, ModifyHotelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyHotelBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyHotelBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyHotelBookingResponse")
    public JAXBElement<ModifyHotelBookingResponse> createModifyHotelBookingResponse(ModifyHotelBookingResponse value) {
        return new JAXBElement<ModifyHotelBookingResponse>(_ModifyHotelBookingResponse_QNAME, ModifyHotelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadHotelBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadHotelBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "readHotelBooking")
    public JAXBElement<ReadHotelBooking> createReadHotelBooking(ReadHotelBooking value) {
        return new JAXBElement<ReadHotelBooking>(_ReadHotelBooking_QNAME, ReadHotelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadHotelBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadHotelBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "readHotelBookingResponse")
    public JAXBElement<ReadHotelBookingResponse> createReadHotelBookingResponse(ReadHotelBookingResponse value) {
        return new JAXBElement<ReadHotelBookingResponse>(_ReadHotelBookingResponse_QNAME, ReadHotelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLineResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLineResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelHotelBookingResponse")
    public JAXBElement<CancelHotelBookingLineResponse> createCancelHotelBookingResponse(CancelHotelBookingLineResponse value) {
        return new JAXBElement<CancelHotelBookingLineResponse>(_CancelHotelBookingResponse_QNAME, CancelHotelBookingLineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelHotelBookingLine }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelHotelBooking")
    public JAXBElement<CancelHotelBookingLine> createCancelHotelBooking(CancelHotelBookingLine value) {
        return new JAXBElement<CancelHotelBookingLine>(_CancelHotelBooking_QNAME, CancelHotelBookingLine.class, null, value);
    }

}
