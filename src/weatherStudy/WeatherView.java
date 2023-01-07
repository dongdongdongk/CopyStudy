package weatherStudy;

public class WeatherView {

	
	//2개의 메서드 생성
	//지역 기온 날씨 미세먼지 
	
		//1. 모든 정보를 출력
	public void view(WeatherDTO [] datadiv) {
		for(int i=0;i<datadiv.length;i++) {
			WeatherDTO weatherDTO = datadiv[i];
			this.view(weatherDTO);		
		}
	}
		//2. DTO 하나의 정보를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("지역" + weatherDTO.getCity());
		System.out.println("기온" + weatherDTO.getGion());
		System.out.println("날씨" + weatherDTO.getStatus());
		System.out.println("미세먼지" + weatherDTO.getMise());
		System.out.println("==============================");
	}

}
