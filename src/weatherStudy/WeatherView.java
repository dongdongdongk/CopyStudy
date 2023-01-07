package weatherStudy;

public class WeatherView {

	
	//2개의 메서드 생성
	//지역 기온 날씨 미세먼지 
	
		//1. 모든 정보를 출력
	public void view(WeatherDTO [] datadiv) {
		for(int i=0;i<datadiv.length;i++) {
			System.out.println("지역" + datadiv[i].getCity());
			System.out.println("기온" + datadiv[i].getGion());
			System.out.println("날씨" + datadiv[i].getStatus());
			System.out.println("미세먼지" + datadiv[i].getMise());
			System.out.println("==============================");
			
		}
	}
		//2. DTO 하나의 정보를 출력

}
