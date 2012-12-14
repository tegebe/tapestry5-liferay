package tapestry.liferay.portlets.pages.kawwa2;

import java.util.List;
import javax.portlet.Event;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.AssetSource;
import tapestry.liferay.portlets.data.kawwa2.Product;
import tapestry.liferay.portlets.services.ProductCatalog;


public class Catalog {
	
	@Inject
	private ProductCatalog catalog;
	
	@Property
	private Product current;
	
	@Inject
	private AssetSource as;
	
	public List<Product> getList(){
		return catalog.getProducts();
	}
	public String getLogoUrl(){
		return as.getContextAsset(current.getAssetLocation(), null).toClientURL();
	}
	
	/*public Event onPublishAddToBasket(Long productId){
	        return new PortletEventImpl("addToBasket",null, productId);
	}*/
	 	 
	 
	
}
