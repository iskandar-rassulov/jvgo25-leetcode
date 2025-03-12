class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        
        answer[0] = 1; //Потому что первый элемент массива ни на что не умножается

        for(int i = 1; i < length; i++){ //Проходим слева направо, но со второго элемента массива
            answer[i] = answer[i - 1] * nums[i - 1]; //Умножаем то число что слева на тотал всех предыдущих до него
        }

        int R = 1; // Потому что последний элемент массива с правой стороны ни на что не умножается
        for(int i = length - 1; i >= 0; i--){ // Проходим справа налево
            answer[i] *= R;
            R *= nums[i];
        }

        return answer;
    }
}