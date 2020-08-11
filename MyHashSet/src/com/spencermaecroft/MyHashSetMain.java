package com.spencermaecroft;

public class MyHashSetMain {

    public static void main(String[] args){
        MyHashSet obj = new MyHashSet();

        String[] methods = new String[]{"contains","remove","add","add","contains","remove","contains","contains","add",
                "add","add","add","remove","add","add","add","add","add","add","add","add","add","add","contains","add",
                "contains","add","add","contains","add","add","remove","add","add","add","add","add","contains","add",
                "add","add","remove","contains","add","contains","add","add","add","add","add","contains","remove",
                "remove","add","remove","contains","add","remove","add","add","add","add","contains","contains","add",
                "remove","remove","remove","remove","add","add","contains","add","add","remove","add","add","add","add",
                "add","add","add","add","remove","add","remove","remove","add","remove","add","remove","add","add","add",
                "remove","remove","remove","add","contains","add"};


//        String inputStr = ""["MyHashSet","add","contains","add","contains","remove","add","contains","add","add","add",
//                "add","add","add","contains","add","add","add","contains","remove","contains","contains","add","remove",
//                "add","remove","add","remove","add","contains","add","add","contains","add","add","add","add","remove",
//                "contains","add","contains","add","add","add","remove","remove","add","contains","add","add","contains",
//                "remove","add","contains","add","remove","remove","add","contains","add","contains","contains","add","add",
//                "remove","remove","add","remove","add","add","add","add","add","add","remove","remove","add","remove","add",
//                "add","add","add","contains","add","remove","remove","remove","remove","add","add","add","add","contains",
//                "add","add","add","add","add","add","add","add"]";
//                "[[],[58],[0],[14],[58],[91],[6],[58],[66],[51],[16],[40],[52],[48],[40],[42],[85],[36],[16],[0],[43]," +
//                "[6],[3],[25],[99],[66],[60],[58],[97],[3],[35],[65],[40],[41],[10],[37],[65],[37],[40],[28],[60],[30]," +
//                "[63],[76],[90],[3],[43],[81],[61],[39],[75],[10],[55],[92],[71],[2],[20],[7],[55],[88],[39],[97],[44],[1]," +
//                "[51],[89],[37],[19],[3],[13],[11],[68],[18],[17],[41],[87],[48],[43],[68],[80],[35],[2],[17],[71],[90],[83]," +
//                 "[42],[88],[16],[37],[33],[66],[59],[6],[79],[77],[14],[69],[36],[21],[40]]";

        //String[] methodsList = inputMethodStringParser(String inputStr);

        String nums ="[72],[91],[48],[41],[96],[87],[48],[49],[84],[82],[24],[7],[56],[87],[81],[55],[19]," +
                "[40],[68],[23],[80],[53],[76],[93],[95],[95],[67],[31],[80],[62],[73],[97],[33],[28],[62],[81],[57],[40],[11]," +
                "[89],[28],[97],[86],[20],[5],[77],[52],[57],[88],[20],[48],[42],[86],[49],[62],[53],[43],[98],[32],[15],[42]," +
                "[50],[19],[32],[67],[84],[60],[8],[85],[43],[59],[65],[40],[81],[55],[56],[54],[59],[78],[53],[0],[24],[7],[53]," +
                "[33],[69],[86],[7],[1],[16],[58],[61],[34],[53],[84],[21],[58],[25],[45],[3]";
        int[] numsList = convertNumStringToList(nums);
        replicateIssue(methods, numsList, obj);
        obj.printSet();
    }

    public static String[] inputMethodStringParser(String inputStr){
        String[] methods = new String[]{};
        int methodsListIndex = 0;
        String currentMethodString = "";

        for(int i = 0; i < inputStr.length(); i++){
            if(inputStr.charAt(i) == '['){
                continue;
            }
            else if(inputStr.charAt(i) == ','){
                methods[methodsListIndex] = currentMethodString;
                currentMethodString = "";
                methodsListIndex++;
            }
            else if (inputStr.charAt(i) == ']'){
                return methods;
            }
            else {
                currentMethodString = currentMethodString + inputStr.charAt(i);
            }
        }
        return methods;
    }

    /**
     * Self-verified to remain accurate with given input
     * @param nums
     * @return int[]
     */
    public static int[] convertNumStringToList(String nums){
        int[] numsList = new int[100];
        int numsListInteger = 0;
        String currentNumString = "";

        for(int i = 0; i < nums.length(); i++){
            if(nums.charAt(i) == '['){
                continue;
            }
            else if(nums.charAt(i) == ']'){
                numsList[numsListInteger] = Integer.parseInt(currentNumString);
                currentNumString = "";
                numsListInteger++;
            }
            else if(nums.charAt(i) != ','){
                currentNumString = currentNumString + nums.charAt(i);
            }
        }
        return numsList;
    }

    public static void replicateIssue(String[] methods, int[] nums, MyHashSet obj){
        int numsIndex = 0;

        for(String method: methods){
            switch(method){
                case "add":
                    obj.add(nums[numsIndex]);
                    numsIndex++;
                    break;
                case "remove":
                    obj.remove(nums[numsIndex]);
                    numsIndex++;
                    break;

                case "contains":
                    obj.contains(nums[numsIndex]);
                    numsIndex++;
                    break;
                default:
                    System.out.println("UHH not sure why default is hitting");
            }
        }
    }
}
