package site.services;


import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Orders;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private DSLContext dslContext;

    public void insertOrders(Orders orders) {
        dslContext.insertInto(Tables.ORDERS,
                Tables.ORDERS.PRODUCTSID,
                Tables.ORDERS.CLIENTID,
                Tables.ORDERS.STATUSPAYMENT).values(
                        orders.getProductsid(),
                        orders.getClientid(),
                        orders.getStatuspayment()).execute();

    }

    public List<Orders> getOrders(){
        return dslContext.selectFrom(Tables.ORDERS).fetchInto(Orders.class);
    }

}
