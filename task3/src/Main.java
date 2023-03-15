import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    public static Double errorNum = 9999999999.0;
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<Double> listResult = new LinkedList<>();
        System.out.print("=>");
        Double result = 0.0;
        while(true){
            Double x;
            Double y;
            String action = "";
            if (result > 0){
                System.out.print(result);
            }
            action = iScanner.nextLine();
            action.replace(" ","");
            int indexAction = FindActionPosition(action);
            if(action.equals("back")){
                listResult.remove(listResult.getLast());
                result = listResult.getLast();
            } else if (action.equals("exit")) {
                System.exit(0);
            }else {
                if (indexAction >= 0) {

                    if (result > 0){
                        x = result;
                        action = result.toString() + action;
                        indexAction = FindActionPosition(action);
                    } else {
                        x = Double.parseDouble(action.substring(0, indexAction));
                    }
                    y = Double.parseDouble(action.substring(indexAction + 1, action.length()));
                    result = GetAction(action, x, y);
                    if (result != errorNum){
                        listResult.add(result) ;
                    }
                    System.out.println(action + " = " + GetAction(action, x, y));
                }
            }
        }
    }
    public static int FindActionPosition(String action){

        int indexAction = - 1;
        if (action.contains("+")){
            indexAction = action.indexOf("+");
        } else if (action.contains("-")) {
            indexAction = action.indexOf("-");
        } else if (action.contains("*")) {
            indexAction = action.indexOf("*");
        } else if (action.contains("/")) {
            indexAction = action.indexOf("/");
        }
        return indexAction;
    }

    public static Double GetAction(String action, Double x, Double y){
        if (action.contains("+")){
            return  x + y;
        } else if (action.contains("-")) {
            return  x - y;
        } else if (action.contains("*")) {
            return  x * y;
        } else if (action.contains("/")) {
            if (y == 0){
                return errorNum;
            }
            return  x / y;
        };
        return errorNum;
    }

}