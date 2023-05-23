public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Pupil studies badly");
    }

    @Override
    public void read() {
        System.out.println("Pupil reads badly");
    }

    @Override
    public void write() {
        System.out.println("Pupil writes badly");
    }

    @Override
    public void relax() {
        System.out.println("Pupil relax badly");
    }

}
