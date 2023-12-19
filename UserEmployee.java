package sorting;

class Employee{
	private int id;
	private String name;
	private double sal;
	
	Employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
public class UserEmployee {

	public static void main(String[] args) {
		Employee [] emp=new Employee[5];
		emp[0]=new Employee(107,"AA",25000);
		emp[1]=new Employee(105,"BB",35000);
		emp[2]=new Employee(106,"CC",23000);
		emp[3]=new Employee(99,"DD",75000);
		emp[4]=new Employee(87,"EE",25000);
		
		selectionsort(emp);
		//bubbleSort(emp);
		//insertionsort(emp);
		display(emp);

	}
	
	public static void bubbleSort(Employee [] emp) {
		int i,j,cnt;
		Employee tmp;
		for(j=emp.length-1;j>0;j--) {
			cnt=0;
			for(i=0;i<j;i++) {
				if(emp[i].getSal()>emp[i+1].getSal()) {
					tmp=emp[i];
					emp[i]=emp[i+1];
					emp[i+1]=tmp;
					cnt++;
				}
			}
			if(cnt==0) break;
		}
	}
	
	public static void insertionsort(Employee[] emp) {
		int i,j,a;
		Employee k;
		for(i=1;i<emp.length;i++) {
			k=emp[i]; a=emp[i].getId();
			for(j=i-1;j>=0 && a<emp[j].getId();j--) {
				emp[j+1]=emp[j];
			}
			emp[j+1]=k;
		}
	}
	
	public static void selectionsort(Employee[] emp) {
		int i,j,min;
		for(i=0;i<emp.length-1;i++) {
			min=i;
			for(j=i;j<emp.length;j++) {
				if(emp[j].getId()<emp[min].getId()) {
					min=j;
				}
			}
			if(min!=i) {
				Employee tmp=emp[min];
				emp[min]=emp[i];
				emp[i]=tmp;
			}
		}
	}
	
	public static void display(Employee [] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getId()+" "+emp[i].getName()+" "+emp[i].getSal());
		}
	}

}
