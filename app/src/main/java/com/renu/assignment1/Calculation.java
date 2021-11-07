package com.renu.assignment1;

import android.util.Log;

import java.util.ArrayList;

public class Calculation {
    public static String TAG="Calculation";
    static ArrayList<String> calculation = new ArrayList<String>();

    public static float CalculatetheValue() {
        float total_calculation=0;
        ArrayList<String> tempdata=new ArrayList<>();
        tempdata.addAll(calculation);

        if(tempdata!=null && tempdata.size()>0){
            for(int i=0;i<tempdata.size();i++){
                if(tempdata.get(i).contains("+") || tempdata.get(i).contains("-")
                        || tempdata.get(i).contains("*") || tempdata.get(i).contains("/")  ){
                    float firstnumber=Float.parseFloat(tempdata.get(i-1));
                    String operation=tempdata.get(i);
                    float secondnumber=Float.parseFloat(tempdata.get(i+1));
                    total_calculation=MethodforCalculation(firstnumber,secondnumber,operation);
                    tempdata.set(i+1,total_calculation+"");
                    if(i+1==tempdata.size()){
                        return total_calculation;
                    }
                    i=i+1;

                }
            }
        }
        return total_calculation;
    }

    private static float MethodforCalculation(float firstnumber, float secondnumber, String operation) {
        float result=0;
        switch (operation){
            case "+":
                result=firstnumber+secondnumber;
                Log.e(TAG, "result="+result);
                break;
            case "-":
                result=firstnumber-secondnumber;
                Log.e(TAG, "result="+result);
                break;
            case "*":
                result=firstnumber*secondnumber;
                Log.e(TAG, "result="+result);
                break;
            case "/":
                result=firstnumber/secondnumber;
                Log.e(TAG, "result="+result);
                break;

        }
        return result;
    }

    public static void push(String s) {
        calculation.add(s);
    }

    public static void clearArray() {
        calculation.clear();
        calculation=new ArrayList<>();
    }
}

