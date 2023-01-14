public class task1 {
    public static void main(String[] args) {
//Create a boolean variable workDay and assign true create int variable day and assign it to 1
//As long as it is workDay print “I need a day off” and increase day.
//Once day is 6 print “I do not need a day off any more”
        boolean workday=true;
        int day=1;
        while(day<8){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("i dont need a day off any more");
                workday=false;

            }
            day++;
        }
    }
}
