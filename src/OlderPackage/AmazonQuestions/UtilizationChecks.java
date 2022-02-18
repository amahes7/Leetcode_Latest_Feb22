package OlderPackage.AmazonQuestions;

public class UtilizationChecks {
    public static int finalInstances(int instances, int[] averageUtil) {
        int totalSeconds= averageUtil.length;
        for(int i=0 ;i<totalSeconds;i++){
            if(averageUtil[i]<25){
                if(instances > 1) {
                    instances = (int)Math.ceil((double)instances/2);
                    i=i+10;
                }
                else {
                    instances=1;
                }
            }else if(averageUtil[i]>60){
                if(instances*2 <= Integer.MAX_VALUE){
                    instances = instances*2;
                }
                i=i+10;
            }
        }
        return instances;

    }

    public static void main(String[] args){
//        int[] input = {25,23,1,2,3,4,5,6,7,8,9,10,76,80};
//        System.out.println(finalInstances(2,input));
        int instances=1;
        System.out.println((int)Math.ceil((double)instances/2));
    }
}
