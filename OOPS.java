import java.util.*;

public class OOPS {
//     public static void main(String[] args) {
//         // Pen p1 = new Pen();
//         // p1.setcolour("red");
//         // p1.settip(5);
//         // System.out.println(p1.getcolour());
//         // System.out.println(p1.gettip() );
//         // p1.setcolour("yello");
//         //System.out.println(p1.getcolour());

//         // Bankacc acc = new Bankacc();
//         // acc.user = " varun chaudhari";
//         // acc.setpassword("varun"); 

//         // employee varun = new employee();
//         // employee jay = new employee("jay viru");

//         // employee rushi = new employee(1122);

//         Student s1 = new Student();
//         s1.name = "varun ";
//         s1.roll = 1122;
//         s1.password = "ag198.";
//         s1.marks[0]= 100;
//         s1.marks[1]= 90;
//         s1.marks[2]=80;



//         Student s2 = new Student(s1);
//         s2.password = "098";
//         s1.marks[2]= 100;
//         for (int i = 0 ; i< 3 ; i++){
//             System.out.println(s2.marks[i]);
//         }
       

        
//     }
// }


// class Bankacc{
//     public String user;
//     private String password;

//     private  void setpassword(String pwd){
//         password = pwd;
//     }
// }

// class Pen{
//     //  prop + function 
//     private String colour ;
//     private int tip ;
      
//     String getcolour(){
//         return this.colour;
//     }
//     void setcolour(String newcolour){
//         colour = newcolour;
//     }

//     int gettip(){
//         return this.tip;
//     }
//     void settip(int newtip){
//         tip = newtip;
//     }


// }

// // class Student {
// //     String name;
// //     int age ;
// //     int rollno ;
// //     char div ; 
// //     int mobileno ;


// //     void setname(String newnmae){
// //         name = newnmae;
// //     }

// //     void setrollno(int newrollno){
// //         rollno = newrollno;
// //     }

// //     void setdiv (char newdiv){
// //         div = newdiv;
// //     }

// // }

// class employee{
//     public String name ;
//     public int empid ;
//     int salary ; 

//     employee(){
//         System.out.println("costructor is called ...");
//     }



//     employee(int empid){
//        // this.name = name ;
//         this.empid = empid ;

//     }

   
//     employee(String name ){
//         this.name = name ;
//     }

// }


// class Student{
//     String name ;
//     int roll ; 
//     int marks[];
//     String password;
    
//     Student(){

//         marks = new int [3];
//     }
    
//     // // shallo copy constructor
//     // Student(Student s1){
//     //     marks= new int[3];
//     //     this.name = s1.name;
//     //     this.roll= s1.roll;
//     //     this.marks = s1.marks;
        
//     // }

//     //  deep copy constructor 
//     Student(Student s1){
//         marks = new int [3];
//         this.name = s1.name ;
//         this.roll = s1.roll;
//         for(int i = 0 ; i < 3 ; i++){
//             this.marks[i] = s1.marks[i];
//         } 

//     }


public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    
}

class Animal {
    String colour ; 
    void eat(){
        System.out.println("eats");
    } 

    void breath(){
        System.out.println("brethes");
    }

}

class Fish extends Animal {
    int fins ;

    void swim(){
        System.out.println("swim");
    }
}
    
}