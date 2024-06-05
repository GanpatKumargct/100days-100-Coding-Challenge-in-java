package com.Ganpat.Challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStudent {
    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {

            return name +" : "+grade;
        }


    }

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();

            }
        });

        queue.offer(new Student("Ganpat", 'C'));
        queue.offer(new Student("Sita", 'A'));
        queue.offer(new Student("Harish",'A' ));
        queue.offer(new Student("Abhinav", 'D'));
        queue.offer(new Student("Ram", 'C'));
        queue.offer(new Student("Vivek", 'A'));
        System.out.println(queue);

        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());

    }

}
