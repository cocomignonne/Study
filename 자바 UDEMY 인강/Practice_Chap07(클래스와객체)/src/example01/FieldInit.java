package example01;

import java.util.Arrays;

//���赵, �ؾƲ�� ����� �۾�
public class FieldInit {
		//�⺻�� ����
	
		byte byteField;     //1
		short shortField;   //2
		int intField;       //4(����Ʈ Ÿ��)
		long longField;     //8
		
		boolean boolField;  //1
		char charField;     //2
		
		float floatField;   //4
		double doubleField; //8
		
		//����������
		
		int[] arrField;     //4
		String strField; 
		
		// annotation �����Ϸ����� ���� �������� �䱸
		// �ʵ��� ������ �츮�� ���÷� Ȯ���� ���� ���ϴ� �������� ����������� ����ϰ��� �� �� ���
		
		
		@Override
		public String toString() {
			return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
					+ ", longField=" + longField + ", boolField=" + boolField + ", charField=" + charField
					+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
					+ Arrays.toString(arrField) + ", strField=" + strField + "]";
		}
		
}
