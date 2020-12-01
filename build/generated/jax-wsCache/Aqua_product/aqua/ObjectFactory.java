
package aqua;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aqua package. 
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

    private final static QName _DeleteProduct_QNAME = new QName("http://aqua/", "deleteProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://aqua/", "deleteProductResponse");
    private final static QName _InsertProduct_QNAME = new QName("http://aqua/", "insertProduct");
    private final static QName _InsertProductResponse_QNAME = new QName("http://aqua/", "insertProductResponse");
    private final static QName _SearchProduct_QNAME = new QName("http://aqua/", "searchProduct");
    private final static QName _SearchProductResponse_QNAME = new QName("http://aqua/", "searchProductResponse");
    private final static QName _UpdateProduct_QNAME = new QName("http://aqua/", "updateProduct");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://aqua/", "updateProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aqua
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link InsertProduct }
     * 
     */
    public InsertProduct createInsertProduct() {
        return new InsertProduct();
    }

    /**
     * Create an instance of {@link InsertProductResponse }
     * 
     */
    public InsertProductResponse createInsertProductResponse() {
        return new InsertProductResponse();
    }

    /**
     * Create an instance of {@link SearchProduct }
     * 
     */
    public SearchProduct createSearchProduct() {
        return new SearchProduct();
    }

    /**
     * Create an instance of {@link SearchProductResponse }
     * 
     */
    public SearchProductResponse createSearchProductResponse() {
        return new SearchProductResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "insertProduct")
    public JAXBElement<InsertProduct> createInsertProduct(InsertProduct value) {
        return new JAXBElement<InsertProduct>(_InsertProduct_QNAME, InsertProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "insertProductResponse")
    public JAXBElement<InsertProductResponse> createInsertProductResponse(InsertProductResponse value) {
        return new JAXBElement<InsertProductResponse>(_InsertProductResponse_QNAME, InsertProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "searchProduct")
    public JAXBElement<SearchProduct> createSearchProduct(SearchProduct value) {
        return new JAXBElement<SearchProduct>(_SearchProduct_QNAME, SearchProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "searchProductResponse")
    public JAXBElement<SearchProductResponse> createSearchProductResponse(SearchProductResponse value) {
        return new JAXBElement<SearchProductResponse>(_SearchProductResponse_QNAME, SearchProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://aqua/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

}
