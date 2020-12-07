package lehigh;
import processing.core.PApplet;

public class bubbleSort extends PApplet {
    int[] arr={14,12,5,2,8,34,4,6,9,16};
    int[]a = sort(arr);
    int R=0;
    int G=0;
    int B=0;
    int alpha=255;
    int i = 0;
    int max = arr.length - 1;


    public void settings(){
        size(500, 500);


    }


    public void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



    public void draw(){
        delay(400);
        background(255);

        if (i >= max) {
            i = 0;
            max--;
        }

        if (arr[i] > arr[i + 1]) {
            swap(i, i + 1);


        }

        for(int j=0;j<arr.length-1;j++){
            if(j==i){
            fill(R,255,B,alpha);
            rect(50*(j),(float) (500-arr[j]*10),30,arr[j]*10);
            fill(R,255,B,alpha);
                rect(50*(j+1),(float) (500-arr[j+1]*10),30,arr[j+1]*10);}
            else{
                fill(R,G,B,0);
                rect(50*(j+1),(float) (500-arr[j+1]*10),30,arr[j+1]*10);
                fill(R,G,B,0);
                rect(0,(float)(500-arr[0]*10),30,arr[0]*10);
            }
        }
        for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==a[i]){
            fill(R,G,255);
            rect(50*(i),(float) (500-arr[i]*10),30,arr[i]*10);
             }
        }

        i++;


            }




    public static void main (String[]args){
        String[] processingArgs = {"BubbleSortTextProcessing"};
        bubbleSort bubbleSortTextProcessing = new bubbleSort();
        PApplet.runSketch(processingArgs, bubbleSortTextProcessing);
    }
}
