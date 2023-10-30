
package whou.secproject.component;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JobInfoDetailResponseDTO {
	
	@JsonProperty("dataSearch")
	private DataSearch dataSearch;

	@Data
	public static class DataSearch {
		@JsonProperty("content")
	    private List<JobDetail> content;
	}
	@Data
	public static class JobDetail {
		private String summary; // �������ġ �� �������� ȯ�ڸ��
		private List<SchClass> SchClass;
		private String similarJob;
		private List<GenCD> GenCD;
		private List<Stateofemp> stateofemp;
	    private List<Prepareway> prepareway;
	    private List<Division> division;
	    private List<Capacity_major> capacity_major;
	    private List<LstHighAptd> lstHighAptd;
	    private List<LstVals> lstVals;
	    private List<Contact> contact;
	    private List<Job_possibility> job_possibility;
	    private String aptitude;
	    private String ability;
	    private String job;
	    private List<LstMiddleAptd> lstMiddleAptd;
	}
	@Data
	public static class SchClass{
		private List<SchPopular> popular; 
		private List<SchBook> bookmark; 
	}
	
	@Data
	public static class SchPopular{
		private String SCH_CLASS_NM; // ���л�(14~16�� û�ҳ�)
		private double PCNT; // 52.4
		private String PCNT1; // 52
		private String PCNT2; // 4
	}
	
	@Data
	public static class SchBook{
		private double PCNT; // 0.0
		private String PCNT1; // 0
		private String PCNT2; // 0
	}
	
	@Data
	public static class GenCD{
		
		private List<GenClass> GenPopular;
		private List<GenClass> GenBook;
	}
	
	@Data
	public static class GenClass{
		private String GenNM; // ����
		private double PCNT; // 75.9
		private String PCNT1; // 75
		private String PCNT2; // 9
	}
	
	@Data
	public static class Stateofemp{
		private String empway; // ��ä�� ��������� �Ұ� ���� ���� �Ƿ����
		private String employment; // �����ġ �� �������� ������ ���� 131,000���̸�,
		private String salery; // "salery": "�������ġ �� �������� ��տ���(������)�� 3075�����̴�(�ڷ�: ��ũ�� �������� 2019�� 7�� ����). 
	}
	
	@Data
	public static class Prepareway{
		private String preparation; // ����б� ���� �̻��� �з��� �䱸�ȴ�.
		private String training; // ���������б��� ��ɴ��п��� ������� ��ġ ��
		private String certification; // ���� �����ڰ������δ� �ѱ�����η°��ܿ��� �����ϴ� ���ڱ��
	}
	
	@Data
	public static class Division{
		private String emplym_code_nm; // 8329��Ÿ ���⡤���� ��� ��ġ��������
		private String std_code_nm; // 7619��Ÿ ���⡤���ڱ�� ��ġ �� ������
		private String cnet_job_dvs; // ���ко�(������)
	}
	
	@Data
	public static class Capacity_major{
		private String capacity; // ���ڻ�����, ���ڱ��
		private List<Major> major;
	}

	@Data
	public static class Major{
		private int RNUM; // 1
		private String MAJOR_NM; // ����
		private int MAJOR_SEQ; // 87
		private String CNTNTS_URL; // http://www.career.go.kr/cnet/front/base/major/FunivMajorView.do?SEQ=
		private int TOTAL_CNT; // 3
	}
	
	@Data
	public static class LstHighAptd{
		private List<LstHighAptdPop> popular;
		private List<LstHighAptdBook> book;
	}
	
	@Data
	public static class LstHighAptdPop{
		private String CD_ORDR; // 05
		private int RANK; // 1
		private String CD_NM; // â�Ƿ�
	}
	@Data
	public static class LstHighAptdBook{
	}
	@Data
	public static class LstVals{
		private List<LstValsPop> popular;
		private List<LstValsBook> book;
	}
	@Data
	public static class LstValsPop{
	}
	@Data
	public static class LstValsBook{
	}
	
	@Data
	public static class Contact{
	}
	
	@Data
	public static class Job_possibility{
		private List<Chart_item_list> chart_item_list;
		private String possiblity;
	}
	
	@Data
	public static class Chart_item_list{
		private double chart_value; // 8.00
		private String chart_key; // ����
	}
	@Data
	public static class LstMiddleAptd{
		private List<LstMiddleAptdPop> popular;
		private List<LstMiddleAptdBook> book;
	}
	@Data
	public static class LstMiddleAptdPop{
	}
	@Data
	public static class LstMiddleAptdBook{
	}
}
