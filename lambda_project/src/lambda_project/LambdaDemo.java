package lambda_project;

public class LambdaDemo{
	public static void main(String[] args){
		MyInter obj=(int c,int d)->{
			return c+d;
		};
		System.out.println(obj.add(90, 96));
	}
}
