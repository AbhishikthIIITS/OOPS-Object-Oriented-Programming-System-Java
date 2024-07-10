
import java.util.*;
import java.lang.*;
 class User_Authentication 
{
    public  static boolean adminlogin() 
    {
        int try1 = 0;
        int true1 = 0;
        String username, password;
        while(try1<3){
        System.out.print ("\n\n\n\n\n\n");
        System.out.print("\t\t\t\t    ----------------------------------\n");
        System.out.print("\t\t\t\t    |POLICE STATION MANAGEMENT SYSTEM|\n");
        System.out.print("\t\t\t\t    ----------------------------------\n");
        System.out.print("\n\n");
        System.out.print ("\t\t\t\t\t");
        Scanner s = new Scanner(System.in);

        System.out.print("Enter username:");//username:admin
        username = s.nextLine();
        System.out.print("\t\t\t\t\n");
        System.out.print("\n\n");
        System.out.print ("\t\t\t\t\t");
    System.out.print("Enter password:");//password:password
        password = s.nextLine();
        //s.close();
        if(username.equals("admin") && password.equals("password"))
        {
            System.out.print("\n\n");
            System.out.print("\t\t\t\t");
            System.out.print("You are accessed to the system!\n\n");
            System.out.print("\t\t\t\t");
            true1 =1;
            return true;
            
        }
    else{
        try1 = try1+1;
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t");
        System.out.print("No. of attempts remain: ");
        System.out.print(3-try1);
        System.out.print("\n\n");
        System.out.print("\t\t\t\t");
        if(try1>=3)
        {

            System.out.print("\t\t\t\t\t\t");
            System.out.print("\n");
            System.out.print("\t\t\t\t");
            System.out.print("No permission to enter the system!\n\n");
            System.out.print("\t\t\t\t");
         callExit();
        }
      }
    }
        return false;
    
}

public  static boolean userlogin() 
{
    int try1 = 0;
    int true1 = 0;
    String username, password;
    while(try1<3){
    System.out.print ("\n\n\n\n\n\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |POLICE STATION MANAGEMENT SYSTEM|\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\n\n");
    System.out.print ("\t\t\t\t\t");
    Scanner s = new Scanner(System.in);

    System.out.print("Enter username:");//username:username
    username = s.nextLine();
    System.out.print("\t\t\t\t\n");
    System.out.print("\n\n");
    System.out.print ("\t\t\t\t\t");
System.out.print("Enter password:");//password:password
    password = s.nextLine();
    //s.close();
    if(username.equals("username") && password.equals("password"))
    {
        System.out.print("\n\n");
        System.out.print("\t\t\t\t");
        System.out.print("You are accessed to the system!\n\n");
        System.out.print("\t\t\t\t");
        true1 =1;
        return true;
        
    }
else{
    try1 = try1+1;
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("\t\t\t\t\t");
    System.out.print("No. of attempts remain: ");
    System.out.print(3-try1);
    System.out.print("\n\n");
    System.out.print("\t\t\t\t");
    if(try1>=3)
    {

        System.out.print("\t\t\t\t\t\t");
        System.out.print("\n");
        System.out.print("\t\t\t\t");
        System.out.print("No permission to enter the system!\n\n");
        System.out.print("\t\t\t\t");
     callExit();
    }
  }
}
    return false;

}
    static void callExit()
    {
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\tTaking You Out of The System");
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t");
        System.out.print("You are out of the System.\n");
        System.out.print("\t\t\t\t\t\t");
        System.out.print("Thank You !");
        System.out.print("\n\n");
        System.out.print("\t\t\t\t\t");
      System.exit(0);
    
    }

}


class Complaint{

 String Name;
  String Sex;
  Date dob;
  String Address;
  String mobile_no;
String Subject;
  Date occurence_date;
  String place_occurence;
String status = "NOT TAKEN";

Complaint(){

}
Complaint(String Name,String Sex,Date dob,String Address,String mobile_no,String Subject,Date occurence_date,String place_occurence){
    this.Name=Name;
    this.Sex=Sex;
    this.dob=dob;
    this.Address=Address;
    this.mobile_no=mobile_no;
    this.Subject=Subject;
    this.occurence_date=occurence_date;
    this.place_occurence=place_occurence;
}
public Complaint Complaint_register(){

  Scanner s = new Scanner(System.in);
    System.out.print ("\n\n\n\n\n\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |Complaint_register|\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("Enter  name:");
    String name =s.nextLine();
    System.out.print("Enter  SEX M OR F:");
    String sex =s.nextLine();
    System.out.print("Enter month of year dob:");
    int mon1 =s.nextInt();
  System.out.print("Enter day of dob:");
    int day1 =s.nextInt();
    System.out.print("Enter year of dob:");
    int yr1 =s.nextInt();
    Date dob = new Date(mon1,day1,yr1);
   System.out.print("Enter address:");
        
   String add = s.nextLine();
       System.out.print("Enter mobile_number:");
        String mob=s.nextLine();
        System.out.print("Enter  SUBJECT:");
    String sub =s.nextLine();
    System.out.print("Enter month of OCCURENCE:");
    int mon2 =s.nextInt();
  System.out.print("Enter day of OCCURENCE:");
    int day2 =s.nextInt();
    System.out.print("Enter year of OCCURENCE:");
    int yr2 =s.nextInt();
    Date doc = new Date(mon1,day1,yr1);
    System.out.print("Enter place_of_Occurence:");
        String poc=s.nextLine();

        Complaint c = new Complaint(name, sex, dob, add, mob, sub, doc, poc);

    return c;
}


public void check_complaintstatus(List<Complaint> l1){

  Scanner s = new Scanner(System.in);
    System.out.print ("\n\n\n\n\n\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |Complaint_Status|\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("Enter  name:");
    String name =s.nextLine();
    System.out.print("Enter mobile_no:");
    String mob_no =s.nextLine();
for(Complaint c :l1){
if(name.equals(c.Name) && mob_no.equals(c.mobile_no) )
  System.out.println("Your Status is :"+status);
}
}
}

class User_Menu{


  public static void menu(Complaint l,List<Complaint>l1 ){
    int input;
  while(true)
  {
    
    System.out.print("\n\n\n");
    System.out.print("\t\t\t\t\t");
    System.out.print( "\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |POLICE STATION MANAGEMENT SYSTEM|\n");
    System.out.print( "\t\t\t\t    ----------------------------------\n");
    System.out.print("\n\n\n\n");
    System.out.print("\t\t\t\t");
    System.out.print(" 1.Register Complaint\n\n");
    System.out.print("\t\t\t\t");
    System.out.print(" 2.Check Complaint_Status\n\n");
    System.out.print("\t\t\t\t" );
    System.out.print( " 3. EXIT\n\n" );
    System.out.print("\t\t\t\t") ;
    System.out.print("Choose Option:[1/2/3] : " );
    Scanner s = new Scanner(System.in);
    input=s.nextInt();

    switch(input)
    {
      case 1:
      {
        l1.add(l.Complaint_register());
        break;
      }
      case 2 :
      {
        l.check_complaintstatus(l1);
        break;
      }
      case 3:
      {
        User_Authentication.callExit();
        
      }
      break;

      default:
      {
        System.out.print( "\n\n\n" );
        System.out.print("\t\t\t\t" );
        System.out.print("  Invalid input!" );
        System.out.print("\n\n" );
        System.out.print("\t\t\t\t" );
        menu(l,l1);
        }
      }
    }
  }
}


 class Date{
    int month;
    int day;
    int year;
    Date(int month,int day,int yr){
        this.month=month;
        this.day=day;
        this.year=yr;
    }

    public String toString(){
        return String.format("month:"+month+"day:"+day+"year:"+year);
    }

}

class Descp
{
  String colour;
  String face;
  String imark;
  String height;
  String eye_color;
  Descp(String col,String face,String imark,String hei,String eye_col){
    this.colour=col;
    this.face=face;
    this.imark=imark;
    this.height=hei;
    this.eye_color=eye_col;

  }

  public String toString(){
    return String.format("color:"+colour+"face:"+face+"imark:"+imark+"height:"+height+"eye_color:"+eye_color);
  }


}

class Police
{
  String station;
  String fir_no;
  Date date_arrest;

  Police(String sta,String id,Date d){
    this.station=sta;
    this.fir_no=id;
    this.date_arrest=d;
  }

  public String toString(){
    return String.format("Station:"+station+"Fir_no:"+fir_no+"date_arrest:"+date_arrest);
  }
}

 class Criminal{
    String name;
    String sex;
    String conno;
    String age;
    String address;
     Police P;
     Descp des;
     Criminal(){

     }
     Criminal(String name,String sex,String conno,String age,String add,Police p,Descp d){
        this.name=name;
        this.sex=sex;
        this.conno=conno;
        this.age=age;
        this.address=add;
        this.P=p;
        this.des=d;
     }
     
     public String toString(){
        return String.format("Name:"+name+"Sex:"+sex+"connoid:"+conno+"age:"+age+"add:"+address+"PoliceDetails:"+P+"Descrptive Details:"+des);
     }
public Criminal Addrecord(){
Scanner s = new Scanner(System.in);
    System.out.print ("\n\n\n\n\n\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |ADD RECORD|\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("Enter Criminal name:");
    String name =s.nextLine();
    System.out.print("Enter Criminal SEX M OR F:");
    String sex =s.nextLine();
    System.out.print("Enter Criminal id:");
        String id=s.nextLine();
      System.out.print("Enter Criminal age:");
        String age=s.nextLine();
       System.out.print("Enter Criminal address:");
        String add=s.nextLine();
       System.out.print("Enter Criminal color:");
        String col=s.nextLine();
   System.out.print("Enter Criminal face(shape):");
        String fac=s.nextLine();
        System.out.print("Enter Criminal identification mark :");
        String i_f=s.nextLine();
        System.out.print("Enter Criminal height:");
        String hei=s.nextLine();
      System.out.print("Enter Criminal eye_color:");
        String eye_col=s.nextLine();
        Descp d1 = new Descp(col,fac,i_f,hei,eye_col);
      System.out.print("Enter month of criminal arrest:");
        int mon =s.nextInt();
      System.out.print("Enter day of criminal arrest:");
        int day =s.nextInt();
        System.out.print("Enter year of criminal arrest:");
        int yr =s.nextInt();
        Date d = new Date(mon,day,yr);
    System.out.print("Enter police station in which criminal arrest:");
        String sta = s.nextLine();
        System.out.print("Enter FIR_NO of criminal :");
        String firno=s.nextLine();
        Police p1=new Police(sta,firno,d);
Criminal c1=new Criminal(name,sex,id,age,address,p1,d1);
return c1;
}

/* Based on name and conno(criminal id) */
public void DeleteRecord(List<Criminal>l){
  Scanner s = new Scanner(System.in);
  System.out.print ("\n\n\n\n\n\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("\t\t\t\t    |DELETE RECORD|\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("Enter Criminal name which u want to delete:");
    String nam =s.nextLine();
    System.out.print("Enter Criminal id which u want to delete:");
    String id =s.nextLine();
    Iterator<Criminal> it =l.iterator();
    while(it.hasNext()){
      if(it.next().name.equals(nam) && it.next().conno.equals(id)){
        it.remove();
        break;
      }
    }
}

public void displayrecord(List<Criminal>l1){
  Scanner s = new Scanner(System.in);
  System.out.print ("\n\n\n\n\n\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("\t\t\t\t    |DISPLAY RECORD|\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");

  System.out.print("Enter Criminal name which u want to display:");
    String nam =s.nextLine();
    System.out.print("Enter Criminal id which u want to display:");
    String id =s.nextLine();
  
    for(Criminal c:l1){
      if(c.name.equals(nam) && c.conno.equals(id)){
        System.out.println("\n\n\t\t----------CRIMINAL RECORD----------");
        System.out.println("\n\n\t\t\tPolice INFORMATION\n\n ");
        System.out.println(c.P);
        System.out.println("\n\n\t\t\tDescrptive INFORMATION\n\n ");
        System.out.println(c.des);
        System.out.println("\n\n\t\t\tPersonal INFORMATION\n\n ");
        System.out.println("Name:"+c.name+"Sex:"+c.sex+"connoid:"+c.conno+"age:"+c.age+"add:"+c.address);
}
    }
    }

public void listRecords(List<Criminal>l1){

  Scanner s = new Scanner(System.in);
  int count = 0;
  System.out.print ("\n\n\n\n\n\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");
  System.out.print("\t\t\t\t    |List  RECORDs between these dates in a Particular Month|\n");
  System.out.print("\t\t\t\t    ----------------------------------\n");

  System.out.print("Enter in which month u want criminal list:");
    int mon =s.nextInt();
    int day1=s.nextInt();
    int day2=s.nextInt();
    for(Criminal c :l1){
      if(c.P.date_arrest.month==mon &&  c.P.date_arrest.day>=day1 && c.P.date_arrest.day<=day2 ){

        count++;
        System.out.println(c);
}

}
System.out.println("The no. of criminals are:"+count);



}
 }




class admin_Menu{

  public static void menu(Criminal l,List<Criminal>l1 ){
    int input;
  while(true)
  {
    
    System.out.print("\n\n\n");
    System.out.print("\t\t\t\t\t");
    System.out.print( "\n");
    System.out.print("\t\t\t\t    ----------------------------------\n");
    System.out.print("\t\t\t\t    |POLICE STATION MANAGEMENT SYSTEM|\n");
    System.out.print( "\t\t\t\t    ----------------------------------\n");
    System.out.print("\n\n\n\n");
    System.out.print("\t\t\t\t");
    System.out.print(" 1. ADD RECORD\n\n");
    System.out.print("\t\t\t\t");
    System.out.print(" 2. MODIFY RECORD\n\n");
    System.out.print("\t\t\t\t" );
    System.out.print( " 3. DISPLAY RECORD\n\n" );
    System.out.print("\t\t\t\t") ;
    System.out.print( " 4. DELETE RECORD\n\n") ;
    System.out.print("\t\t\t\t" );
    System.out.print(" 5. LIST ALL RECORDS\n\n") ;
    System.out.print("\t\t\t\t") ;
    System.out.print( " 6. EXIT\n\n" );
    System.out.print("\t\t\t\t") ;
    System.out.print("Choose Option:[1/2/3/4/5/6] : " );
    Scanner s = new Scanner(System.in);
    input=s.nextInt();
    
    switch(input)
    {
      case 1:
      {
        l1.add(l.Addrecord());
        break;
      }
      case 2 :
      {
       // l.modifyrecord();
        break;
      }
      case 3:
      {
        l.displayrecord(l1);
        break;
      }
      case 4:
      {
        l.DeleteRecord(l1);
        break;
      }
      case 5:
      {
         l.listRecords(l1);
        break;
      }
      case 6:
      {
        User_Authentication.callExit();
      }
      break;

      default:
      {
        System.out.print( "\n\n\n" );
        System.out.print("\t\t\t\t" );
        System.out.print("  Invalid input!" );
        System.out.print("\n\n" );
        System.out.print("\t\t\t\t" );
        menu(l,l1);
        }
    }
  }
}
}


public class Crimemanagementsystem{public static void main(String args[]){
      List<Criminal> list1 = new  ArrayList<Criminal>(); /*To store criminal Records */
      List<Complaint> list2 = new  ArrayList<Complaint>();
      Criminal c1 = new Criminal();
      Complaint c2 = new Complaint();
      System.out.print("\t\t\t\t    ----------------------------------\n");
      System.out.print("\t\t\t\t    |WELCOME TO POLICE STATION MANAGEMENT SYSTEM|\n");
      System.out.print( "\t\t\t\t    ----------------------------------\n");
      System.out.print("\n\n\n\n");
      System.out.print("\t\t\t\t");
      System.out.print(" 1.USER LOGIN\n\n");
      System.out.print("\t\t\t\t");
      System.out.print(" 2. ADMIN LOGIN\n\n");
      System.out.print("\t\t\t\t" );
      System.out.print("Choose Option:[1/2] : " );
    Scanner s = new Scanner(System.in);
     int input=s.nextInt();
     switch(input){
      case 1 :
     if(User_Authentication.userlogin()){
      User_Menu.menu(c2,list2);
     }
    break;
      case 2:
      if(User_Authentication.adminlogin()){
              admin_Menu.menu(c1, list1);
      
            }
            break;
           }
      }
}

