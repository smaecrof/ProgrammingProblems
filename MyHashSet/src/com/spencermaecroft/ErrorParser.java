package com.spencermaecroft;

public class ErrorParser {
    private String[] methodsStrList;
    private int[] methodInputList;
    private MyHashSet hashSetObj;

    public ErrorParser(String[] methods, String nums, MyHashSet object){
        this.methodsStrList = methods;
        this.methodInputList = convertInputToInt(nums);
        this.hashSetObj = object;
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
    public int[] convertInputToInt(String nums){
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

    public void replicateIssue(){
        int numsIndex = 0;

        for(String method: methodsStrList){
            switch(method){
                case "add":
                    hashSetObj.add(methodInputList[numsIndex]);
                    numsIndex++;
                    break;
                case "remove":
                    hashSetObj.remove(methodInputList[numsIndex]);
                    numsIndex++;
                    break;

                case "contains":
                    hashSetObj.contains(methodInputList[numsIndex]);
                    numsIndex++;
                    break;
                default:
                    System.out.println("UHH not sure why default is hitting");
            }
        }
    }

    public void replicateIssueWithPrintOuts(){
        int numsIndex = 0;
        boolean doesContain;

        for(String method: methodsStrList){
            System.out.println("\n----------------------------------------------------");
            System.out.println("Obj index: " + hashSetObj.index);
            System.out.println("numIndex: " + numsIndex);

            switch(method){
                case "add":
                    System.out.println("add(" + methodInputList[numsIndex] + ")");
                    hashSetObj.add(methodInputList[numsIndex]);
                    numsIndex++;
                    break;
                case "remove":
                    System.out.println("remove(" + methodInputList[numsIndex] + ")");
                    hashSetObj.remove(methodInputList[numsIndex]);
                    numsIndex++;
                    break;

                case "contains":
                    System.out.println("contains(" + methodInputList[numsIndex] + ")");
                    doesContain = hashSetObj.contains(methodInputList[numsIndex]);
                    System.out.println("Contains: " + doesContain);
                    numsIndex++;
                    break;
                default:
                    System.out.println("UHH not sure why default is hitting");
            }

            hashSetObj.printSet(); // Display Current Set
        }
    }
}
