package assignments;

public class MainTeacher2 {


		public static void main(String[] args) {
			ITTeacher it = new ITTeacher(); 
			System.out.println(it.sub);
			it.work();
			MathTeacher mt =new MathTeacher();
			System.out.println(mt.sub);

			mt.work();
			MusicTeacher mct=new MusicTeacher();
			System.out.println(mct.sub);

			mct.work();
			PhysicsTeacher pt = new PhysicsTeacher();
			System.out.println(pt.sub);

			pt.work();
		
	}}
