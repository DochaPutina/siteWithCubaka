package site.services;


import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Product;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private DSLContext dslContext;

    public void insertProduct(Product product) {
        dslContext.insertInto(Tables.PRODUCT,
                Tables.PRODUCT.ID,
                Tables.PRODUCT.AMOUNT,
                Tables.PRODUCT.PRICE,
                Tables.PRODUCT.PRODUCTNAME).values(
                product.getId(),
                product.getAmount(),
                product.getPrice(),
                product.getProductname()).execute();

    }

    public List<Product> getProduct(){
        return dslContext.selectFrom(Tables.PRODUCT).fetchInto(Product.class);
    }

}
