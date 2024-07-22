package java12_exception.custom;

//회사에 Exception 패키지가 정리되어 있다면 그런 문서들을 적극적으로 참조해 보자!
//다만, 회사에서는 잘 만들지 않는 경우가 많으며, 만일 이런 패키지가 정리되어 있다면
//정리한 사람을 잘 쫒아다니자.
public class CustomExceptionEx {
	public static void main(String[] args) {
		
		User user = new User();
		
//		user.setAge(66); // 그냥 안받아줌
		//Throw가 있기 때문에 반드시 try~catch 해야 받아준다.
		
		try {
			user.setAge(66);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}

		try {
			user.setAge(-44);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
	}
	
}
