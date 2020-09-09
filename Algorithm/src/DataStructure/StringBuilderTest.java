package DataStructure;


class StringBuilder {
	private char[] value;
	private int size;
	private int index;

	//객체생성
	StringBuilder() {
		//배열 크기 1로 초기화 
		size = 1;
		//크기만큼의 배열 생성
		value = new char[size];
		//새로 추가될 data는 인덱스 0부터 저장
		index = 0;
	}
	//문자열을 추가하는 함수 append, 매개변수로 문자열
	public void append(String str) {
		if (str == null)
			str = "null";
		//문자열의 길이 len
		int len = str.length();
		//배열이 문자열의 길이를 받을 수 있을 지 충분한지 확인 
		ensureCapacity(len);
		//for문으로 돌면서 한 글자씩 문자열을 받아준다 
		for (int i = 0; i < str.length(); i++) {
			value[index] = str.charAt(i);
			//인덱스를 증가시켜 다음 인덱스를 가리킨다
			index++;
		}
		//kw 추가 후 인덱스는 2, 공배is추가 후 인덱스 5 
		//kw is pretty 26,12임 
		System.out.println(size + ", " + index);
	}

	//배열방이 넉넉하지 않으면 크기를 늘려주는 ensureCapacity 함수
	//매개변수로는 문자열의 길이를 받는다
	private void ensureCapacity(int len) {
		//현재 문자열의 길이에 인덱스를 더했을 때 합이 배열의 길이를 초과하면 size * 2
		if (index + len > size) {
			size = (size + len) * 2;
			//새로운 배열
			char[] newValue = new char[size];
			//기존 배열을 돌면서 새로운 data를 newValue 배열에 복사
			for (int i = 0; i < value.length; i++) {
				newValue[i] = value[i];
			}
			value = newValue;
			//1에 문자열 k,w를 더하고 두배로 사이즈를 눌려줘서 배열의 길이는 6, 인덱스는 0
			//6,5 상태에서 공백pretty를 추가하면 (6+7)*2 배열의 길이가 26, kw is까지 인덱스는 5
			
			System.out.println("***" + size + ", " + index);
		}
	}

	//append한 모든 문자열을 붙여서 반환하는 toString함수
	//현재 저장된 value배열을 0번부터 현재 인덱스까지 문자열로 반환
	public String toString() {
		return new String(value, 0, index);

	}
}

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("kw");
		sb.append(" is");
		sb.append(" pretty");
		System.out.println(sb.toString());
	}

}
