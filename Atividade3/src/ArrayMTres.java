public class ArrayMTres {
    public static void main(String[] args){
        int[] array = {1, 4, 3, 2, 7, 5, 0, 8, 6, 9};
        System.out.println("Valores maiores que 3 no array");
        for (int i = 0; i < array.length; i++){
            if(array[i] > 3){
                System.out.println("Posição" + i + ":" + array[i]);
            }
        }
    }
}
