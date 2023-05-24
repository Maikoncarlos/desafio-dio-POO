import com.gitHub.maikoncarlos.desafio.dominio.Content;
import com.gitHub.maikoncarlos.desafio.dominio.Course;
import com.gitHub.maikoncarlos.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course courseJava = new Course();
        courseJava.setTitle("Title - Java");
        courseJava.setDescription("Description Course - Java POO ");
        courseJava.setDuration(8);

        Course courseKotlin= new Course();
        courseKotlin.setTitle("Title - Course Kotlin");
        courseKotlin.setDescription("Description Course - Kotlin POO ");
        courseKotlin.setDuration(7);

        System.out.println(courseJava);
        System.out.println(courseKotlin);

        Mentoring mentoringJava = new Mentoring();
        mentoringJava.setTitle("Title - Mentoring Java");
        mentoringJava.setDescription("Description Mentoring - Java POO");
        mentoringJava.setNow_date(LocalDate.now());

        Mentoring mentoringKotlin = new Mentoring();
        mentoringKotlin.setTitle("Title - Mentoring Kotlin");
        mentoringKotlin.setDescription("Description Mentoring - Kotlin POO");
        mentoringKotlin.setNow_date(LocalDate.now().plusWeeks(2));

        System.out.println(mentoringJava);
        System.out.println(mentoringKotlin);
    }
}