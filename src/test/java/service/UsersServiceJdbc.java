package service;

import com.dtuchs.libs.jdbc.base.DSBuilder;
import com.dtuchs.libs.orm.base.EmfBuilder;
import com.dtuchs.libs.orm.base.JpaService;
import entity.PurchaseEntity;
import entity.UsersEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersServiceJdbc  {

    private JdbcTemplate template = new JdbcTemplate(new DSBuilder()
            .postgres()
            .dbHost("localhost")
            .dbPort(5432)
            .dbName("hb_database")
            .username("postgres")
            .password("secret")
            .build());


   public void addPurchaseToUser(String userName, String purchase, int price) {
       UsersEntity userEntity = template.queryForObject("SELECT * FROM users WHERE name = ?", (rs, rowNum) -> {
           UsersEntity ue = new UsersEntity();
           ue.setId(rs.getInt("id"));
           ue.setName(rs.getString("name"));
           ue.setBalance(rs.getInt("balance"));
           return ue;
       }, userName);

       template.update("INSERT INTO purchase (user_id, title, price) " +
               "VALUES (?, ?, ?)", userEntity.getId(), purchase, price);
    }
}
