package shopping.domain;

import shopping.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="products", path="products")
public interface ProductRepository extends PagingAndSortingRepository<Product, >{
}