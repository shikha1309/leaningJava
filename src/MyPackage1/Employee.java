package MyPackage1;

public class Employee {

        private int empID =2;
        private int phoneNumber ;
        private String Name  ;
        private int basicSalary =25000;
        private int incentive =500;

        // making a constructor


  public  Employee(){
      phoneNumber = 948848994;
      Name ="Kaju";


   }
    public Employee(int PhoneNumber ,String EmployeeName) {
        phoneNumber=PhoneNumber;
        Name =EmployeeName;
    }



    void countSalary (){
            System.out.println(basicSalary+incentive);
        }

        // getter and setter
      public int getphoneNumber(){
            return phoneNumber;
        }
    public String getName(){
            return Name;
        }
      public   void setphoneNumber(int mobile){
        phoneNumber=mobile;
        }
     public   void setName(String cName){
           Name=cName;
        }


    }


