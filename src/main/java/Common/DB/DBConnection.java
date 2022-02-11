package Common.DB;

import Common.DAO.AccountsEntity;
import Common.DAO.CharactersEntity;
import Common.DAO.ItemsEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class DBConnection {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static AccountsEntity DBGetUsername(String account) {
        final Session session = getSession();
        Query query = session.createQuery("FROM AccountsEntity WHERE username=:username");
        query.setParameter("username", account);
        AccountsEntity accountsEntity = (AccountsEntity) query.uniqueResult();
        session.close();
        return accountsEntity;
    }

    public static void DBSetUserData(AccountsEntity accountobject) {
        final Session session = getSession();
        session.saveOrUpdate(accountobject);
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
    }
    public static List<CharactersEntity> DBGetCharacters(int accountId) {
        final Session session = getSession();
        Query<CharactersEntity> query = session.createQuery("FROM CharactersEntity WHERE accountId=:accountId",CharactersEntity.class);
        query.setParameter("accountId", accountId);
        List<CharactersEntity> charactersEntity = query.getResultList();
        session.close();
        return charactersEntity;
    }
    public static List<ItemsEntity> DBGetCharactersItems(int Charactersid) {
        final Session session = getSession();
        Query<ItemsEntity> query = session.createQuery("FROM ItemsEntity WHERE cid=:cid",ItemsEntity.class);
        query.setParameter("cid", Charactersid);
        List<ItemsEntity> ItemsEntity = query.getResultList();
        session.close();
        return ItemsEntity;
    }

}
