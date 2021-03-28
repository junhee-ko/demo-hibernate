package study.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MemberCreate {

  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutoring-persistence-unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();

    Member member01 = new Member();
    member01.setId(21L);
    member01.setName("micle");
    member01.setAge(50);

    Member member02 = new Member();
    member02.setId(22L);
    member02.setName("pppp");
    member02.setAge(60);

    entityManager.persist(member01);
    entityManager.persist(member02);

    transaction.commit();
  }
}
