package weatherStudy;

public class WeatherData {

private String data;
	
	//field
	public WeatherData() {
		this.data="SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,Junju,32,흐림,5";
	}
	
	//init 
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴

	//method
	
	public void init() {
		
		String [] datas = this.data.split(","); 
		WeatherData [] datadiv = new WeatherData [datas.length/4];
		int idx = 0;
		for(int i=0;i<data.length();i=i+4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(datas[i]);
			weatherDTO.setGion(datas[i+1]);
			weatherDTO.setStatus(datas[i+2]);
			weatherDTO.setMise(datas[i+3]);
			w
			idx++;
		}
		
	}


}
