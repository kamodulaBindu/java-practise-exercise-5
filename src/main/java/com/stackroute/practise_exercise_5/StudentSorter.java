package com.stackroute.practise_exercise_5;

import java.util.Comparator;

class StudentSorter implements Comparator<Student> {
    //class to compare students
    public int compare(Student a, Student b) {
        if (a.getAge() == b.getAge()) {
            //if age is equal sort by name
            if (a.getName().equals(b.getName())) {
                //if name is equal sort by id
                return a.getId().compareTo(b.getId());
            } else
                //if name is not equal sort by name
                return a.getName().compareTo(b.getName());

        }
        else
            //if age is not equal sort by age
            return a.getAge() - b.getAge();
    }

}



