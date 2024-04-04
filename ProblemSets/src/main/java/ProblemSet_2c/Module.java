package ProblemSet_2c;

public class Module {
		public Assessment assessment1;
		public Assessment assessment2;
		public Assessment assessment3;
		private static final String ModuleName = "COM1027";
		
		
		
		public Module(Assessment assessment1, Assessment assessment2, Assessment assessment3) {
			super();
			this.assessment1 = assessment1;
			this.assessment2 = assessment2;
			this.assessment3 = assessment3;
		}

		
		public double calculateAverage() {
			double AverageMark = ((this.assessment1.getMark() +
			this.assessment2.getMark() +
			this.assessment3.getMark()) / 3.00);
			return AverageMark;
		}

		@Override
		public String toString() {
			return ModuleName + " " + "(" + this.calculateAverage() + "%"+")";
		}

        
		
}
