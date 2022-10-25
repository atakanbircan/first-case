public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    int girisMaas;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;



    }

     int tax(){
        if (salary<1000){
            return  0;
        }
        else {
            return salary*3/100;
        }
    }
     int bonus(){
        if (workHours>40){
            int bonus;
            bonus=(workHours-40)*30;
            return bonus;
        }
        else {
            return 0;
        }
    }
    int raiseSalary(){
        int raise=salary;
        int now=2021;



        if ((now-hireYear)<10){
             raise/=20;

        } else if ((now-hireYear)>9&&(now-hireYear)<20) {
             raise/=10;


        }
        else if ((now-hireYear)>19){
             raise=raise*3/20;
        }
        return raise;
    }
    void toStringg(){


        int vergiVeBonuslarile=salary+raiseSalary();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+salary);
        System.out.println("Çalışma saati : "+workHours);
        System.out.println("Başlangıç yılı : "+hireYear);
        System.out.println("Vergi : "+ tax());
        System.out.println("Bonus :"+ bonus());
        System.out.println("Maaş Artışı :"+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ (salary+bonus()-tax()));
        System.out.println("Toplam Maaş : "+(salary+raiseSalary()+bonus()-tax()));


    }
}
