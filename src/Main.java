/**
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
 * Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
 * У тілі класу створіть методи void study(), void read(), void write(), void relax().
 * Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
 * Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може передати 2 або 3 аргументи.
 * Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */

public class Main {

    public static void main(String[] args) {

        ExcellentPupil pupil1 = new ExcellentPupil();
        ExcellentPupil pupil2 = new ExcellentPupil();
        GoodPupil pupil3 = new GoodPupil();
        BadPupil pupil4 = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        classRoom.pupil1.study();
        classRoom.pupil1.read();
        classRoom.pupil1.write();
        classRoom.pupil1.relax();

        classRoom.pupil2.study();
        classRoom.pupil2.read();
        classRoom.pupil2.write();
        classRoom.pupil2.relax();

        classRoom.pupil3.study();
        classRoom.pupil3.read();
        classRoom.pupil3.write();
        classRoom.pupil3.relax();

        classRoom.pupil4.study();
        classRoom.pupil4.read();
        classRoom.pupil4.write();
        classRoom.pupil4.relax();
        System.out.println();


    }

}
