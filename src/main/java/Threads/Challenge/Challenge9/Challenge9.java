package Threads.Challenge.Challenge9;

import java.util.concurrent.locks.ReentrantLock;

public class Challenge9 {
    public static void main(String[] args) {
//        ReentrantLock reentrantLock = new ReentrantLock();
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor {
    private NewStudent student;


    public void setStudent(NewStudent student) {
        this.student = student;
    }

    public void studyTime() {

        synchronized (this) {
            System.out.println("Tutor has arrived");
            synchronized (student) {
                try {
                    // wait for student to arrive
                    this.wait();
                } catch (InterruptedException e) {
                    student.startStudy();
                    System.out.println("Tutor is studying with student");
                }
            }
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor tutor;


    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (tutor) {

                tutor.getProgressReport();
                System.out.println("Student handed in assignment");
                tutor.notifyAll();
        }
    }
}