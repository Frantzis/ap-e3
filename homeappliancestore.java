import java.util.*;
public class homeappliancestore {

    static String name, address;
    static Integer num;

        public static void main (String[] args) {

            homeappliancestore a = new homeappliancestore();

            a.setName("HomeApp");
            a.setAddress("Polytexneioy");
            a.setNum(10);

            try {
                System.out.println(a.getName());
                System.out.println(a.getAdress());
                System.out.println(a.getNum());

            } catch (Exception e) {
                if ((name == null) && (address == null) && (num == null)) {
                    System.out.println("Den yparxei onoma.");
                    System.out.println("Den yparxei dieythinsi.");
                    System.out.println("Den yparxei arithmos.");
                }
            }
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void setNum(Integer num){
            this.num = num;
        }

        public String getName(){
            return this.name;
        }

        public String getAdress(){
            return this.address;
        }

        public Integer getNum(){
            return this.num;
        }
}
