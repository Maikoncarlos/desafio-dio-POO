import com.gitHub.maikoncarlos.desafio.dominio.*;

import java.time.LocalDate;

//public class Main {
////    public static void main(String[] args) {
//
//        Course courseJava = new Course();
//        courseJava.setTitle("Title - Java");
//        courseJava.setDescription("Description Course - Java POO ");
//        courseJava.setDuration(8);
//
//        Course courseKotlin= new Course();
//        courseKotlin.setTitle("Title - Course Kotlin");
//        courseKotlin.setDescription("Description Course - Kotlin POO ");
//        courseKotlin.setDuration(7);
//
////        System.out.println(courseJava);
////        System.out.println(courseKotlin);
//
//        Mentoring mentoringJava = new Mentoring();
//        mentoringJava.setTitle("Title - Mentoring Java");
//        mentoringJava.setDescription("Description Mentoring - Java POO");
//        mentoringJava.setNow_date(LocalDate.now());
//
//        Mentoring mentoringKotlin = new Mentoring();
//        mentoringKotlin.setTitle("Title - Mentoring Kotlin");
//        mentoringKotlin.setDescription("Description Mentoring - Kotlin POO");
//        mentoringKotlin.setNow_date(LocalDate.now().plusWeeks(2));
//
////        System.out.println(mentoringJava);
////        System.out.println(mentoringKotlin);
//
//        Bootcamp bootcamp = new Bootcamp();
//        bootcamp.setName("Bootcamp Java Developer");
//        bootcamp.setDescription("Description Bootcamp Java Developer");
//        bootcamp.getContentes().add(courseJava);
//        bootcamp.getContentes().add(courseKotlin);
//
//        Dev devCamila = new Dev();
//        devCamila.setName(" Camila ");
//        devCamila.subscribeBootcamp(bootcamp);
//        System.out.println(" Conteudos inscritos Camila: " + devCamila.getSubscribedContent());
//        devCamila.toProgress();
//        System.out.println(" Camila finalizou: " + devCamila.getFinishedContent());
//
//        System.out.println(" ");
//
//        System.out.println(" Conteudos inscritos Camila: " + devCamila.getSubscribedContent());
//        devCamila.toProgress();
//        System.out.println(" Camila finalizou: " + devCamila.getFinishedContent());
//        System.out.println(" ");
//        System.out.println(" Total de XP da Camila: " + devCamila.calculateTotalXP());
//
//        System.out.println(" ");
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println(" ");
//
//
//        Dev devJoao= new Dev();
//        devJoao.setName(" Joao ");
//        devJoao.subscribeBootcamp(bootcamp);
//        System.out.println(" Conteudos inscritos Joao: " + devJoao.getSubscribedContent());
//        devJoao.toProgress();
//        System.out.println(" Joao finalizou: " + devJoao.getFinishedContent());
//
//        System.out.println(" ");
//        System.out.println(" Total de XP do Joao: " + devJoao.calculateTotalXP());
//
//    }
//}