package service;


import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Users;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private DSLContext dslContext;


    public void insertUsers(Users users){
        dslContext.insertInto(Tables.USERS, Tables.USERS.ID,
                                            Tables.USERS.STATUSID,
                                            Tables.USERS.EMAIL,
                                            Tables.USERS.MONEY,
                                            Tables.USERS.USERNAME,
                                            Tables.USERS.PASSWORD,
                                            Tables.USERS.NUMBER).values(users.getId(),
                                                                        users.getStatusid(),
                                                                        users.getEmail(),
                                                                        users.getMoney(),
                                                                        users.getUsername(),
                                                                        users.getPassword(),
                                                                        users.getNumber()).execute();
    }

    public List<Users> getUsers(){
        return dslContext.selectFrom(Tables.USERS)
                .fetchInto(Users.class);
    }

}
