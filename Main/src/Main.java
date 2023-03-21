public class Main {
    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x-y;
    }

    public static void main(String[]args){
        int subtract1 = subtract(3 , 1);
        int substract2 = subtract(8,3);
        int add1 = add(2,3);
        int add2 = add(4,5);

        int[] additionResults = {add1, add2};
        int[] subtractionResults = {subtract1,substract2};

        for(int i =0;i<additionResults.length;i++){
            if( additionResults[i] % 2 == 0){
                System.out.println("even "+additionResults[i]);
            }else{
                System.out.println("odd "+additionResults[i]);
            }
        }

        for (int b =0;b<subtractionResults.length;b++){
            if( subtractionResults[b] % 2 == 0){
                System.out.println("even "+subtractionResults[b]);
            }else{
                System.out.println("odd "+subtractionResults[b]);
            }
        }

        int i = 0;
        while(i<additionResults.length){

            if(additionResults[i] % 2 == 0){
                System.out.print("even"+additionResults[i]+" ");
            }else{
                System.out.print("odd"+additionResults[i]+" ");
            }
            i++;

        }

        int b = 0;
        while(b<subtractionResults.length){
            if(subtractionResults[b] % 2 == 0){
                System.out.print("even"+subtractionResults[b]+" ");
            }else{
                System.out.print("odd"+subtractionResults[b]+" ");
            }
            b++;
        }
    }
}

