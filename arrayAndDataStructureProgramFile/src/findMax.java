public class findMax {
    public int getMax(int [] inputArray){
        int maxValue=inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i]>maxValue){
                maxValue=inputArray[i];
            }
        }
        return maxValue;
    }

}
