package site.services;


import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Status;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    private DSLContext dslContext;

    public void insertStatus(Status status) {
        dslContext.insertInto(Tables.STATUS,
                Tables.STATUS.ID,
                Tables.STATUS.STATUSNAME).values(
                status.getId(),
                status.getStatusname()).execute();

    }

    public List<Status> getOrders(){
        return dslContext.selectFrom(Tables.STATUS).fetchInto(Status.class);
    }
}
