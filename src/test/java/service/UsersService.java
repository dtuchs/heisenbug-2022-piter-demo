package service;

import com.dtuchs.libs.orm.base.EmfBuilder;
import com.dtuchs.libs.orm.base.JpaService;
import entity.PurchaseEntity;
import entity.UsersEntity;

import javax.persistence.EntityManager;

public class UsersService extends JpaService {
    public UsersService() {
        super(new EmfBuilder()
                .persistenceUnitName("test")
                .postgres()
                .dbHost("localhost")
                .dbPort(5432)
                .dbName("hb_database")
                .username("postgres")
                .password("secret")
                .build().createEntityManager());
    }

   public void addPurchaseToUser(String userName, String purchase, int price) {
        UsersEntity user = em.createQuery("select u from UsersEntity u where u.name = :name", UsersEntity.class)
                .setParameter("name", userName)
                .getSingleResult();

        PurchaseEntity pr = new PurchaseEntity();
        pr.setUsersByUserId(user);
        user.getPurchasesById().add(pr);
        pr.setTitle(purchase);
        pr.setPrice(price);
        merge(user);
    }
}
