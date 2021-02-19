public class JPAMain {

  public static void main(String[] args) {

    UserDAO pdao = new UserDAOWithJPAImpl();

    /*
     Jag connectar till Users tabellen i everyloop databasen
    */

    System.out.println("Created!");
    User user = new User("1","leoebe", "password","leo", "ebe", "email", "123123");
    pdao.create(user);

    System.out.println(pdao.getByName("leoebe"));

    System.out.println("Updated!");
    pdao.updatePassword("1","test");
    System.out.println(pdao.getByName("leoebe"));

    System.out.println("Removed!");
    pdao.remove("1");
    System.out.println(pdao.getByName("leoebe"));

    /* ## test sequence ##
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();

    User p = em.find(User.class, "990130-1619");
    System.out.println(p);

    em.getTransaction().commit();
    */

  }

}
