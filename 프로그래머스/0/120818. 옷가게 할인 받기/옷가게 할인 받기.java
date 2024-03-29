class Solution {
    public int solution(int price) {
        int discount =0;
     if(price>=500000){
         discount =20;
     }else if(price >=300000){
         discount=10;
     }else if(price >= 100000){
         discount =5;
     }
        double discountPrice = price *(1 - (double)discount/100);
        return (int)discountPrice;
    }
}