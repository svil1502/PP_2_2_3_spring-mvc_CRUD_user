package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;
import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserDAO {
    private final EntityManager entityManager;

    @Autowired
    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public List<User> index() {

        return entityManager.createQuery("select p from User p", User.class)
                .getResultList();
    }

    @Transactional(readOnly = true)
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void save(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Transactional
    public void update(int id, User updatedUser) {
        entityManager.getTransaction().begin();
        User userUpd = entityManager.find(User.class, id);
        userUpd.setName(updatedUser.getName());
        userUpd.setEmail(updatedUser.getEmail());
        entityManager.persist(userUpd);
        entityManager.getTransaction().commit();
    }

    @Transactional
    public void delete(int id) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }
}


