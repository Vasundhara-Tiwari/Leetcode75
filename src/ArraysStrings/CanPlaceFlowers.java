package ArraysStrings;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && (i == 0 || flowerbed[i - 1] == 0)){
                flowerbed[i] = 1;
                n--;
                i++;
            }
        }
        return n <= 0;
    }
}
