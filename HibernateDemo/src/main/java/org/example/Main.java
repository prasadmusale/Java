package org.example;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//         Student s1 = new Student();
//         s1.setId(2);
//         s1.setName("Ram");
//         s1.setMarks(95);

        Laptop l1 = new Laptop();
        //lID IS NEEDED WHEN WE ARE CREATING NEW TABLE OF LAPTOP INSTEAD OF EMBEDDED ONE .
        l1.setLid(101);
        l1.setBrand("Apple");
        l1.setModel("Macbook");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(102);
        l2.setBrand("Asus");
        l2.setModel("Ideapad");
        l2.setRam(8);

        Laptop l3 = new Laptop();
        l3.setLid(103);
        l3.setBrand("Dell");
        l3.setModel("book");
        l3.setRam(4);

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Prasad");
        a1.setTech("Java");
////        //Used when we have to insert values in EMBEDDED TABLE OF LAPTOP AND ALIEN
        Alien a2 = new Alien();
        a2.setAid(2);
        a2.setAname("Ram");
        a2.setTech("C++");

        Alien a3 = new Alien();
        a3.setAid(3);
        a3.setAname("Sham");
        a3.setTech("Python");

        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l2,l3));
        a3.setLaptops(Arrays.asList(l1));


        l1.setAliens(Arrays.asList(a1,a3));
        l2.setAliens(Arrays.asList(a2,a3));
        l3.setAliens(Arrays.asList(a2));






        //.configure() will load the xml file.
         SessionFactory sf = new Configuration()
                                 .addAnnotatedClass(org.example.Alien.class)
                                  .addAnnotatedClass(org.example.Laptop.class)
                                 .configure()
                                 .buildSessionFactory();

         Session session = sf.openSession();

         //TO SAVE NEW RECORDS
         //when we have to save new records then only persist and commit methods are used .
//         //whenever we have to make changes to database we have to use commit method which is method og transaction interface .
//         Transaction transaction = session.beginTransaction();
//         //persist() is used to save the data .
//         session.persist(s1);
//         transaction.commit();

//         //TO READ DATA FROM TABLE IN FORM OF OBJECT
//         Student s2  = session.get(Student.class , 2);
//         System.out.println(s2);

//           //TO UPDATE DATA IN TABLE
//           session.merge(s1);
//           Transaction transaction = session.beginTransaction();
//           transaction.commit();

//             //TO DELETE DATA IN TABLE
//             Student s2 = session.get(Student.class , 2);
//             session.remove(s2);
//             Transaction transaction = session.beginTransaction();
//             transaction.commit();

//              //TO SAVE NEW RECORD WITH LAPTOP FIELDS IN ALIEN CLASS
//        Transaction transaction = session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();

//        //WRITTEN TO UPDATE EMBEDDED TABLE OF ALIEN AND LAPTOP
//        Transaction transaction = session.beginTransaction();
//        session.merge(a1);
//        transaction.commit();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        transaction.commit();

        //Query query = session.createQuery("from Laptop where ram = 32");
        //Query query = session.createQuery("select model from Laptop where brand like ?1");
        //String brand = "Asus";
        //query.setParameters(1,brand);
        //List<Laptop> laptops = query.getResultList();

        //System.out.println(laptops);



        //Always close sessionfactory object and session after use
         session.close();
         sf.close();



    }
}