package com.banking;

import com.security.softronix.PwdSecurityServices;

public class BankingUserPassword {

	public static void main(String[] args) {
		
		PwdSecurityServices pss=new PwdSecurityServices();
		String encode=pss.encode("Softronix");
		System.out.println(encode);
		
	}

}
