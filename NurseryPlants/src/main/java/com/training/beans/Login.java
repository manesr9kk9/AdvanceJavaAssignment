package com.training.beans;

public class Login {


		private String  uname;
		private String  upass;
		private String  utype;
		public Login(String uname, String upass, String utype) {
			super();
			this.uname = uname;
			this.upass = upass;
			this.utype = utype;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUpass() {
			return upass;
		}
		public void setUpass(String upass) {
			this.upass = upass;
		}
		public String getUtype() {
			return utype;
		}
		public void setUtype(String utype) {
			this.utype = utype;
		}
		public Login() {
			super();
		}
	
}
