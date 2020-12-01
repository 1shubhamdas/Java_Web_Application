
package Offer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Offer package. 
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

    private final static QName _DeleteOffer_QNAME = new QName("http://aqua/", "deleteOffer");
    private final static QName _DeleteOfferResponse_QNAME = new QName("http://aqua/", "deleteOfferResponse");
    private final static QName _InsertOffer_QNAME = new QName("http://aqua/", "insertOffer");
    private final static QName _InsertOfferResponse_QNAME = new QName("http://aqua/", "insertOfferResponse");
    private final static QName _SearchOffer_QNAME = new QName("http://aqua/", "searchOffer");
    private final static QName _SearchOfferResponse_QNAME = new QName("http://aqua/", "searchOfferResponse");
    private final static QName _UpdateOffer_QNAME = new QName("http://aqua/", "updateOffer");
    private final static QName _UpdateOfferResponse_QNAME = new QName("http://aqua/", "updateOfferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Offer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteOffer }
     * 
     */
    public DeleteOffer createDeleteOffer() {
        return new DeleteOffer();
    }

    /**
     * Create an instance of {@link DeleteOfferResponse }
     * 
     */
    public DeleteOfferResponse createDeleteOfferResponse() {
        return new DeleteOfferResponse();
    }

    /**
     * Create an instance of {@link InsertOffer }
     * 
     */
    public InsertOffer createInsertOffer() {
        return new InsertOffer();
    }

    /**
     * Create an instance of {@link InsertOfferResponse }
     * 
     */
    public InsertOfferResponse createInsertOfferResponse() {
        return new InsertOfferResponse();
    }

    /**
     * Create an instance of {@link SearchOffer }
     * 
     */
    public SearchOffer createSearchOffer() {
        return new SearchOffer();
    }

    /**
     * Create an instance of {@link SearchOfferResponse }
     * 
     */
    public SearchOfferResponse createSearchOfferResponse() {
        return new SearchOfferResponse();
    }

    /**
     * Create an instance of {@link UpdateOffer }
     * 
     */
    public UpdateOffer createUpdateOffer() {
        return new UpdateOffer();
    }

    /**
     * Create an instance of {@link UpdateOfferResponse }
     * 
     */
    public UpdateOfferResponse createUpdateOfferResponse() {
        return new UpdateOfferResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOffer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOffer }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "deleteOffer")
    public JAXBElement<DeleteOffer> createDeleteOffer(DeleteOffer value) {
        return new JAXBElement<DeleteOffer>(_DeleteOffer_QNAME, DeleteOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOfferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOfferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "deleteOfferResponse")
    public JAXBElement<DeleteOfferResponse> createDeleteOfferResponse(DeleteOfferResponse value) {
        return new JAXBElement<DeleteOfferResponse>(_DeleteOfferResponse_QNAME, DeleteOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOffer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertOffer }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "insertOffer")
    public JAXBElement<InsertOffer> createInsertOffer(InsertOffer value) {
        return new JAXBElement<InsertOffer>(_InsertOffer_QNAME, InsertOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOfferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertOfferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "insertOfferResponse")
    public JAXBElement<InsertOfferResponse> createInsertOfferResponse(InsertOfferResponse value) {
        return new JAXBElement<InsertOfferResponse>(_InsertOfferResponse_QNAME, InsertOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOffer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchOffer }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "searchOffer")
    public JAXBElement<SearchOffer> createSearchOffer(SearchOffer value) {
        return new JAXBElement<SearchOffer>(_SearchOffer_QNAME, SearchOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOfferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchOfferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "searchOfferResponse")
    public JAXBElement<SearchOfferResponse> createSearchOfferResponse(SearchOfferResponse value) {
        return new JAXBElement<SearchOfferResponse>(_SearchOfferResponse_QNAME, SearchOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOffer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOffer }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "updateOffer")
    public JAXBElement<UpdateOffer> createUpdateOffer(UpdateOffer value) {
        return new JAXBElement<UpdateOffer>(_UpdateOffer_QNAME, UpdateOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOfferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOfferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "updateOfferResponse")
    public JAXBElement<UpdateOfferResponse> createUpdateOfferResponse(UpdateOfferResponse value) {
        return new JAXBElement<UpdateOfferResponse>(_UpdateOfferResponse_QNAME, UpdateOfferResponse.class, null, value);
    }

}
