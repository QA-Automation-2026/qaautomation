package revision;

public class ifconditions {

    public static void main(String[] args)
    {
        int a = 10;
        int b = 15;

        /*
        * if condition
        * if condition is true then only inside block of code is executed,
        * else statement - if condition failed, then else block code is executed
        * if(condition){}else{}
        * */

        if(a<=b) // always returns true or false only
        {
            System.out.println("a is greater than b, my statement is correct");
        }
        else{
            System.out.println("Given statement is wrong, hence if block is not executed");
        }


        /*
        * In case of multiple condtions
        * first condition - false -if(condtion) -chicken biryani - (a>b) - false
        * second condition - false - else if(veg biryani)  = condition = veg biryani
        * third condition - false - else if (egg biryani) = condition = egg biryani
        * fourth condition - false - else if(meals) = condition = meals
        * final condtion - else block - true - resturannt pick
        * */

        int i = 5;
        int j = 6;
        if(i>j)
        {
            System.out.println("Planning for chicken biryani for lunch");
        }
        else if(i==j)
        {
            System.out.println("Planning for egg biryani for lunch");
        }
        else if(i<j)
        {
            System.out.println("Planning for veg biryani");
        }
        else
        {
            System.out.println("Order food on zomoto");
        }
        //combination of relational operators and logical operators
    }
}
