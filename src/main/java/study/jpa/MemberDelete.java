package study.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MemberDelete {

  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutoring-persistence-unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();

    Member selectedMember = entityManager.find(Member.class, 10L);
    entityManager.remove(selectedMember);

    transaction.commit();
  }
}
