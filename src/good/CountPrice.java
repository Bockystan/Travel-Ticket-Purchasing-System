package good;
public class CountPrice {
	  4     private double num_apple;
	  5     private double num_orange;
	  6     private double num_banana;
	  7     private double num_grapefruit;
	  8     private double num_peach;
	  9     private double pri_apple;
	 10     private double pri_orange;
	 11     private double pri_banana;
	 12     private double pri_grapefruit;
	 13     private double pri_peach;
	 14     private double total_price;
	 15 
	 16     public double getNum_apple() {
	 17         return num_apple;
	 18     }
	 19 
	 20     public void setNum_apple(double num_apple) {
	 21         this.num_apple = num_apple;
	 22         this.setPri_apple(num_apple * 5.0);
	 23     }
	 24 
	 25     public double getNum_orange() {
	 26         return num_orange;
	 27     }
	 28 
	 29     public void setNum_orange(double num_orange) {
	 30         this.num_orange = num_orange;
	 31         this.setPri_orange(num_orange * 3.0);
	 32     }
	 33 
	 34     public double getNum_banana() {
	 35         return num_banana;
	 36 
	 37     }
	 38 
	 39     public void setNum_banana(double num_banana) {
	 40         this.num_banana = num_banana;
	 41         this.setPri_banana(num_banana * 2.0);
	 42     }
	 43 
	 44     public double getNum_grapefruit() {
	 45         return num_grapefruit;
	 46     }
	 47 
	 48     public void setNum_grapefruit(double num_grapefruit) {
	 49         this.num_grapefruit = num_grapefruit;
	 50         this.setPri_grapefruit(num_grapefruit * 4.5);
	 51     }
	 52 
	 53     public double getNum_peach() {
	 54         return num_peach;
	 55     }
	 56 
	 57     public void setNum_peach(double num_peach) {
	 58         this.num_peach = num_peach;
	 59         this.setPri_peach(num_peach * 5.5);
	 60     }
	 61 
	 62     public double getPri_apple() {
	 63         return pri_apple;
	 64     }
	 65 
	 66     public void setPri_apple(double pri_apple) {
	 67         this.pri_apple = pri_apple;
	 68     }
	 69 
	 70     public double getPri_orange() {
	 71         return pri_orange;
	 72     }
	 73 
	 74     public void setPri_orange(double pri_orange) {
	 75         this.pri_orange = pri_orange;
	 76     }
	 77 
	 78     public double getPri_banana() {
	 79         return pri_banana;
	 80     }
	 81 
	 82     public void setPri_banana(double pri_banana) {
	 83         this.pri_banana = pri_banana;
	 84     }
	 85 
	 86     public double getPri_grapefruit() {
	 87         return pri_grapefruit;
	 88     }
	 89 
	 90     public void setPri_grapefruit(double pri_grapefruit) {
	 91         this.pri_grapefruit = pri_grapefruit;
	 92     }
	 93 
	 94     public double getPri_peach() {
	 95         return pri_peach;
	 96     }
	 97 
	 98     public void setPri_peach(double pri_peach) {
	 99         this.pri_peach = pri_peach;
	100     }
	101 
	102     public double getTotal_price() {
	103         this.total_price = this.getPri_apple() + this.getPri_banana()
	104                 + this.getPri_grapefruit() + this.getPri_grapefruit()
	105                 + this.getPri_orange() + this.getPri_peach();
	106         return total_price;
	107     }
	108 }
