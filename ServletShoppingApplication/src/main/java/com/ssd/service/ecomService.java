package com.ssd.service;

import com.ssd.Dao.ecomDao;
import com.ssd.Dto.ecomDto;

public class ecomService {

	 public ecomDao dao;
	 
		
		public ecomService(ecomDao dao) {
			super();
			this.dao = dao;
		}

		public ecomService() {
			super();
		}

		public void insertUserData(ecomDto dto) {
			dao.insertUserData(dto);
		}
		public ecomDto IsLogin(String Email, String Password) {
			return dao.isLogin(Email, Password);
			
		}
	
}
