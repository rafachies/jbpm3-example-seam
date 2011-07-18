package org.domain.jbpmexample.session;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("productList")
@Scope(ScopeType.STATELESS)
public class ProductsFactory {

	public Products[] getProducts() {
		return Products.values();
	}
}
