
    public class StudentGrades{
        public int maximum(int [] arr,int length){
            int max_value=arr[0];
            for(int i=1;i<length;i++){
                if(arr[i]>max_value){
                    max_value=arr[i];
                }
            }
            return max_value;
        }

        public int minimum(int [] arr,int length){
            int min=arr[0];
            for(int i=1;i<length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }

        public double average(int [] arr, int length){
            int sum=0;
            for(int i=0;i<length;i++){
                sum+=arr[i];
            }
            double average=sum/length;
            return average;
        }
    }


