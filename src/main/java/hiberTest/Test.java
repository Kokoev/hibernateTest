package hiberTest;
import hiberTest.Pupil;
/**
 * Created by sovarugby on 12.12.16.
 */
public class Test {


    public static void main(String[] args) {
        PupilService serviceOfPupil = new PupilService();

        Pupil pupil1 = new Pupil();
        pupil1.setRole("ROLE_USER");
        pupil1.setLogin("pes");
        pupil1.setPassword("gavgav");
        pupil1.setGender("M");
        pupil1.setAge(123);
        pupil1.setSchool("madrid");

        Pupil pupil = serviceOfPupil.add(pupil1);

        System.out.println(pupil);

    }
}
