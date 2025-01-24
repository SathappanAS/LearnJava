package OOP_Interface;

public class AIMS implements USEducation,UKEducation,IndianEducation{
	//IndianEduction
		@Override
		public void BS() {
			System.out.println("BS---IndianEducation");
			
		}

		@Override
		public void BE() {
			System.out.println("BE---IndianEducation");
			
		}

		@Override
		public void BSC() {
			System.out.println("BSC---IndianEducation");
			
		}
		
		//UKEduction
		@Override
		public void EduinDental() {
			System.out.println("EduinDental---UKEduction");
			
		}

		@Override
		public void EduinMBBS() {
			System.out.println("EduinMBBS---UKEduction");
			
		}

		@Override
		public void EduinOrotho() {
			System.out.println("EduinOrotho---UKEduction");
			
		}

		@Override
		public void MSinCS() {
			System.out.println("EduinOrotho---UKEduction");
			
		}
		
		//USEducation
		@Override
		public void phd() {
			System.out.println("Phd---USEducation");
			
		}

		@Override
		public void MS() {
			System.out.println("MS---USEducation");
			
		}
		
		//COMMON
		@Override
		public void fee() {
			System.out.println("FEE---CommonMethod");
			
		}

}
