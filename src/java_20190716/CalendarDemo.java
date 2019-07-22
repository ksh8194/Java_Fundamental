package java_20190716;

public class CalendarDemo {
	public static void main(String[] args) {
		/* -달력만들기
		1. 1년1월1일 월요일
		2. 1년 = 365일 , 윤년 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 그중에서 100의 배수는 제외하고 400의배수는 제외하지 않는다.
		4. 2019년 12월 25일이 무슨요일?
		5. 2018년까지 총일수,11월까지 총일수,25일 더해서 7로 나눈 나머지가 1이면 월요일,2이면 화요일....
		
		*/
		int year = 2020;
		int month = 3;
		int day = 15;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;
		
		// 2019년도까지 총 일수 구하기
		totalCount = preYear * 365 +(preYear/4-preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && (year%100!=0) || (year%400==0)) {
			monthArray[1] = 29;
		}
		
		// 2019년도 11월까지 합 구하기
		for(int i=0;i<preMonth;i++) {
			totalCount+=monthArray[i];
		}
		totalCount+=31+29;
		
		totalCount += day;
		String message = null;
		
		int dayOfWeek = totalCount%7;
		
		if(dayOfWeek==1) {
			message = "월요일";
		}else if(dayOfWeek==2) {
		
			message = "화요일";
		}else if(dayOfWeek==3) {
			
			message = "수요일";
		}else if(dayOfWeek==4) {
			
			message = "목요일";
		}else if(dayOfWeek==5) {
			
			message = "금요일";
		}else if(dayOfWeek==6) {
			message = "토요일";
			
		}else if(dayOfWeek==0) {
			message = "일요일";
		
		}
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+message);
		
	}

}
