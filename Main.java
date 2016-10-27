import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<student>();

        student s1 = new student(101,"Nena",23);
        student s2 = new student(102,"Brother",23);
        student s3 = new student(103,"me",23);

        al.add(s1);
        al.add(s2);
        al.add(s3);

        if(al.contains(s2) && s2.name =="Brother")
            System.out.println("Yes");

        for(student obj:al) {
            if(obj.name == "Brother"){
                System.out.println(al.indexOf(obj));
            }

        }
    }
}
