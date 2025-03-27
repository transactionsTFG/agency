
package ucm.tfg.agency.soapclient.airlineflight;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucm.tfg.agency.soapclient.airlineflight package. 
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

    private final static QName _ParamSearchFlightSOAP_QNAME = new QName("http://soap/", "paramSearchFlightSOAP");
    private final static QName _Search_QNAME = new QName("http://soap/", "search");
    private final static QName _SearchFlight_QNAME = new QName("http://soap/", "searchFlight");
    private final static QName _SearchFlightResponse_QNAME = new QName("http://soap/", "searchFlightResponse");
    private final static QName _SearchFlightInstance_QNAME = new QName("http://soap/", "searchFlightInstance");
    private final static QName _SearchFlightInstanceResponse_QNAME = new QName("http://soap/", "searchFlightInstanceResponse");
    private final static QName _SearchResponse_QNAME = new QName("http://soap/", "searchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucm.tfg.agency.soapclient.airlineflight
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParamSearchFlightSOAP }
     * 
     */
    public ParamSearchFlightSOAP createParamSearchFlightSOAP() {
        return new ParamSearchFlightSOAP();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchFlight }
     * 
     */
    public SearchFlight createSearchFlight() {
        return new SearchFlight();
    }

    /**
     * Create an instance of {@link SearchFlightResponse }
     * 
     */
    public SearchFlightResponse createSearchFlightResponse() {
        return new SearchFlightResponse();
    }

    /**
     * Create an instance of {@link SearchFlightInstance }
     * 
     */
    public SearchFlightInstance createSearchFlightInstance() {
        return new SearchFlightInstance();
    }

    /**
     * Create an instance of {@link SearchFlightInstanceResponse }
     * 
     */
    public SearchFlightInstanceResponse createSearchFlightInstanceResponse() {
        return new SearchFlightInstanceResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link FlightListDTO }
     * 
     */
    public FlightListDTO createFlightListDTO() {
        return new FlightListDTO();
    }

    /**
     * Create an instance of {@link FlightInstanceDTO }
     * 
     */
    public FlightInstanceDTO createFlightInstanceDTO() {
        return new FlightInstanceDTO();
    }

    /**
     * Create an instance of {@link FlightSOAP }
     * 
     */
    public FlightSOAP createFlightSOAP() {
        return new FlightSOAP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamSearchFlightSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamSearchFlightSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "paramSearchFlightSOAP")
    public JAXBElement<ParamSearchFlightSOAP> createParamSearchFlightSOAP(ParamSearchFlightSOAP value) {
        return new JAXBElement<ParamSearchFlightSOAP>(_ParamSearchFlightSOAP_QNAME, ParamSearchFlightSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Search }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlight")
    public JAXBElement<SearchFlight> createSearchFlight(SearchFlight value) {
        return new JAXBElement<SearchFlight>(_SearchFlight_QNAME, SearchFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightResponse")
    public JAXBElement<SearchFlightResponse> createSearchFlightResponse(SearchFlightResponse value) {
        return new JAXBElement<SearchFlightResponse>(_SearchFlightResponse_QNAME, SearchFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightInstance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightInstance }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightInstance")
    public JAXBElement<SearchFlightInstance> createSearchFlightInstance(SearchFlightInstance value) {
        return new JAXBElement<SearchFlightInstance>(_SearchFlightInstance_QNAME, SearchFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightInstanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightInstanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightInstanceResponse")
    public JAXBElement<SearchFlightInstanceResponse> createSearchFlightInstanceResponse(SearchFlightInstanceResponse value) {
        return new JAXBElement<SearchFlightInstanceResponse>(_SearchFlightInstanceResponse_QNAME, SearchFlightInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

}
