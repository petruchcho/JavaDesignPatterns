package decorator;

import common.Pupil;
import common.Pupils;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        Pupils.setPupilFactory(new PupilSynchronizedFactory());
        Pupil pupil = Pupils.createInstance(Pupils.randomStudentName(), 10);
        Pupils.fillPupilMarks(pupil);
        Pupils.print(pupil);
    }
}