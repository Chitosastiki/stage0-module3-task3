package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
           int first = 1;
           int second = 10;
           int third = 100;
        for(int i: new int[]{first, second, third}){
        System.out.println(i);
        }  
            int linkToFirst = first;
                int linkToSecond = second;
                int linkToThird = third;
                first = 15;
                second = 6;
                third= 4 ;
        
        for(int j: new int[]{first, second, third, linkToFirst, linkToSecond, linkToThird}){
        System.out.println(j);
        }
    }
}
