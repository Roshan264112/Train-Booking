package train.manage;

public class Train {
         private int trainId;
         private String trainname;
         private String traintime;
         private String traincity;
		
         
         
         public int getTrainId() {
			return trainId;
		}

		public void setTrainId(int trainId) {
			this.trainId = trainId;
		}

		public String getTrainname() {
			return trainname;
		}

		public void setTrainname(String trainname) {
			this.trainname = trainname;
		}

		public String getTraintime() {
			return traintime;
		}

		public void setTraintime(String traintime) {
			this.traintime = traintime;
		}

		public String getTraincity() {
			return traincity;
		}

		public void setTraincity(String traincity) {
			this.traincity = traincity;
		}

		public Train(int trainId, String trainname, String traintime, String traincity) {
			super();
			this.trainId = trainId;
			this.trainname = trainname;
			this.traintime = traintime;
			this.traincity = traincity;
		}

		public Train(String trainname, String traintime, String traincity) {
			super();
			this.trainname = trainname;
			this.traintime = traintime;
			this.traincity = traincity;
		}

		public Train() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Train [trainId=" + trainId + ", trainname=" + trainname + ", traintime=" + traintime
					+ ", traincity=" + traincity + "]";
		}  
         
         
         
}
	

